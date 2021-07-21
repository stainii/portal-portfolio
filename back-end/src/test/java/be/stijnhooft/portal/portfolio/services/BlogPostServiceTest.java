package be.stijnhooft.portal.portfolio.services;

import be.stijnhooft.portal.portfolio.model.BlogPost;
import be.stijnhooft.portal.portfolio.model.BlogPostSummary;
import be.stijnhooft.portal.portfolio.mothers.BlogPostMother;
import be.stijnhooft.portal.portfolio.repositories.BlogPostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
@RunWith(SpringRunner.class)
public class BlogPostServiceTest {

    @InjectMocks
    private BlogPostService blogPostService;

    @Mock
    private BlogPostRepository blogPostRepository;

    @Test
    public void findAllWhenNotInProduction() {
        blogPostService.profile = "dev";
        BlogPost blogPost1 = BlogPostMother.complete();
        BlogPostSummary blogPostSummary1 = blogPost1.toSummary();

        BlogPost blogPost2 = BlogPostMother.completeAlternative(LocalDate.now().plusDays(1));
        BlogPostSummary blogPostSummary2 = blogPost2.toSummary();

        doReturn(Arrays.asList(blogPost1, blogPost2)).when(blogPostRepository).findAllByOrderByPublishDateDesc();

        List<BlogPostSummary> result = blogPostService.findAll();

        verify(blogPostRepository).findAllByOrderByPublishDateDesc();
        verifyNoMoreInteractions(blogPostRepository);

        assertEquals(Arrays.asList(blogPostSummary1, blogPostSummary2), result);
    }

    @Test
    public void findAllWhenInProduction() {
        blogPostService.profile = "production";
        BlogPost blogPost1 = BlogPostMother.complete();
        BlogPostSummary blogPostSummary1 = blogPost1.toSummary();

        BlogPost blogPost2 = BlogPostMother.completeAlternative(LocalDate.now().plusDays(1));

        doReturn(Arrays.asList(blogPost1, blogPost2)).when(blogPostRepository).findAllByOrderByPublishDateDesc();

        List<BlogPostSummary> result = blogPostService.findAll();

        verify(blogPostRepository).findAllByOrderByPublishDateDesc();
        verifyNoMoreInteractions(blogPostRepository);

        assertEquals(Arrays.asList(blogPostSummary1), result);
    }

    @Test
    public void findById() {
        BlogPost blogPost = BlogPostMother.complete();
        String id = blogPost.getId();

        doReturn(Optional.of(blogPost)).when(blogPostRepository).findById(id);

        Optional<BlogPost> result = blogPostService.findById(id);

        verify(blogPostRepository).findById(id);
        verifyNoMoreInteractions(blogPostRepository);

        assertTrue(result.isPresent());
        assertEquals(blogPost, result.get());
    }

}
