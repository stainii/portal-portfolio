package be.stijnhooft.portal.portfolio.repositories;

import be.stijnhooft.portal.portfolio.model.BlogPost;
import be.stijnhooft.portal.portfolio.mothers.BlogpostMother;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertEquals(blogPost, blogPostRepository.findById(blogPost.getId()).get());
    }

    @Test
    public void findByIdWhenNotFound() {
        // given
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertFalse(blogPostRepository.findById("non existing").isPresent());
    }

    @Test
    public void findByTagsInWhenSearchingWithASingleTagAndFindingOneBlogpost() {
        // given
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(blogPost.getTags().get(0))));
        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(blogPost.getTags().get(1))));
    }

    @Test
    public void findByTagsWhenSearchingWithMultipleTagsAndFindingOneBlogpost() {
        // given
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(blogPost.getTags().get(2), blogPost.getTags().get(1))));
    }

    @Test
    public void findByTagsWhenSearchingWithOneTagAndFindingMultipleBlogpost() {
        // given
        BlogPost blogPost1 = BlogpostMother.complete();
        BlogPost blogPost2 = BlogpostMother.completeAlternative();

        // when
        blogPostRepository.save(blogPost1);
        blogPostRepository.save(blogPost2);

        // then
        assertEquals(Arrays.asList(blogPost1, blogPost2), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("programming")));
    }

    @Test
    public void findByTagsWhenSearchingWithMultipleTagsAndFindingMultipleBlogposts() {
        // given
        BlogPost blogPost1 = BlogpostMother.complete();
        BlogPost blogPost2 = BlogpostMother.completeAlternative();

        // when
        blogPostRepository.save(blogPost1);
        blogPostRepository.save(blogPost2);

        // then
        assertEquals(Arrays.asList(blogPost1, blogPost2), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("programming", "docker")));
    }


    @Test
    public void findByTitleWhenAllWordsMatch() {
        // given
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("log", "in")));
    }

    @Test
    public void findByTitleWhenOnlyOneWordMatches() {
        // given
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("log", "wooooooow")));
    }

    @Test
    public void findByDescription() {
        // given
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("[description]")));
    }

    @Test
    public void findByContent() {
        // given
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertEquals(Arrays.asList(blogPost), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("something")));
    }

    @Test
    public void findWhenNothingFound() {
        // given
        BlogPost blogPost = BlogpostMother.complete();

        // when
        blogPostRepository.save(blogPost);

        // then
        assertEquals(new ArrayList<>(), blogPostRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("random", "wooooooow")));
    }


}
