package be.stijnhooft.portal.portfolio.repositories;

import be.stijnhooft.portal.portfolio.model.BlogPost;
import be.stijnhooft.portal.portfolio.mothers.BlogPostMother;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@DataMongoTest
@RunWith(SpringRunner.class)
public class BlogPostRepositoryTest {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Before
    public void init() {
        blogPostRepository.deleteAll();
    }

    @Test
    public void findByIdWhenSuccess() {
        // given
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        // when
        Optional<BlogPost> result = blogPostRepository.findById(blogPost.getId());

        // then
        assertTrue(result.isPresent());
        assertEquals(blogPost, result.get());
    }

    @Test
    public void findByIdWhenNotFound() {
        // given
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        // when
        Optional<BlogPost> result = blogPostRepository.findById("non existing");

        // then
        assertFalse(result.isPresent());
    }

    @Test
    public void findByTagsInWhenSearchingWithASingleTagAndFindingOneBlogpost() {
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(blogPost.getTags().get(0))));
        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(blogPost.getTags().get(1))));
    }

    @Test
    public void findByTagsWhenSearchingWithMultipleTagsAndFindingOneBlogpost() {
        // given
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        // when
        List<BlogPost> result = blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(blogPost.getTags().get(2), blogPost.getTags().get(1)));

        // then
        assertEquals(Arrays.asList(blogPost), result);
    }

    @Test
    public void findByTagsWhenSearchingWithOneTagAndFindingMultipleBlogpost() {
        // given
        BlogPost blogPost1 = BlogPostMother.complete();
        BlogPost blogPost2 = BlogPostMother.completeAlternative();
        blogPostRepository.save(blogPost1);
        blogPostRepository.save(blogPost2);

        // when
        List<BlogPost> result = blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("programming"));

        // then
        assertEquals(Arrays.asList(blogPost1, blogPost2), result);
    }

    @Test
    public void findByTagsWhenSearchingWithMultipleTagsAndFindingMultipleBlogposts() {
        // given
        BlogPost blogPost1 = BlogPostMother.complete();
        BlogPost blogPost2 = BlogPostMother.completeAlternative();
        blogPostRepository.save(blogPost1);
        blogPostRepository.save(blogPost2);

        // when
        List<BlogPost> result = blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("programming", "docker"));

        // then
        assertEquals(Arrays.asList(blogPost1, blogPost2), result);
    }


    @Test
    public void findByTitleWhenAllWordsMatch() {
        // given
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        // when
        List<BlogPost> result = blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("log", "in"));

        // then
        assertEquals(Arrays.asList(blogPost), result);
    }

    @Test
    public void findByTitleWhenOnlyOneWordMatches() {
        // given
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        // when
        List<BlogPost> result = blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("log", "wooooooow"));

        // then
        assertEquals(Arrays.asList(blogPost), result);
    }

    @Test
    public void findByDescription() {
        // given
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        // when
        List<BlogPost> result = blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("[description]"));

        // then
        assertEquals(Arrays.asList(blogPost), result);
    }

    @Test
    public void findByContent() {
        // given
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        // when
        List<BlogPost> result = blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("something"));

        // then
        assertEquals(Arrays.asList(blogPost), result);
    }

    @Test
    public void findWhenNothingFound() {
        // given
        BlogPost blogPost = BlogPostMother.complete();
        blogPostRepository.save(blogPost);

        // when
        List<BlogPost> result = blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("random", "wooooooow"));

        // then
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void findAllOrderByStartDateDesc() {
        // given
        BlogPost blogPost1 = BlogPostMother.complete();
        BlogPost blogPost2 = BlogPostMother.completeAlternative();
        blogPostRepository.save(blogPost1);
        blogPostRepository.save(blogPost2);

        // when
        List<BlogPost> result = blogPostRepository.findAllByOrderByPublishDateDesc();

        // then
        assertEquals(Arrays.asList(blogPost2, blogPost1), result);
    }

}
