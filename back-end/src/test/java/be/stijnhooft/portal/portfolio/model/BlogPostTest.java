package be.stijnhooft.portal.portfolio.model;

import be.stijnhooft.portal.portfolio.mothers.BlogPostMother;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlogPostTest {

    @Test
    public void isExternalWhenTrue() {
        BlogPost blogPost = BlogPostMother.completeAlternative();
        assertTrue(blogPost.isExternal());
    }


    @Test
    public void isExternalWhenFalse() {
        BlogPost blogPost = BlogPostMother.complete();
        assertFalse(blogPost.isExternal());
    }

    @Test
    public void toSummary() {
        BlogPost blogPost = BlogPostMother.complete();
        BlogPostSummary summary = blogPost.toSummary();
        assertEquals(blogPost.getId(), summary.getId());
        assertEquals(blogPost.getName(), summary.getName());
        assertEquals(blogPost.getDescription(), summary.getDescription());
        assertEquals(blogPost.getThumbnail(), summary.getThumbnail());
        assertEquals(blogPost.getPublishDate(), summary.getPublishDate());
        assertEquals(blogPost.getExternalLink(), summary.getExternalLink());
    }

}
