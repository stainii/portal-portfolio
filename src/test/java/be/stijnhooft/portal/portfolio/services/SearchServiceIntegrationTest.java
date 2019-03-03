package be.stijnhooft.portal.portfolio.services;

import be.stijnhooft.portal.portfolio.dtos.SearchResult;
import be.stijnhooft.portal.portfolio.model.BlogPost;
import be.stijnhooft.portal.portfolio.model.Project;
import be.stijnhooft.portal.portfolio.mothers.BlogpostMother;
import be.stijnhooft.portal.portfolio.mothers.ProjectMother;
import be.stijnhooft.portal.portfolio.repositories.BlogPostRepository;
import be.stijnhooft.portal.portfolio.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@DataMongoTest(includeFilters = @ComponentScan.Filter(Service.class))
@RunWith(SpringRunner.class)
public class SearchServiceIntegrationTest {

    @Autowired
    private SearchService searchService;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Test
    public void search() {
        // given
        Project project1 = ProjectMother.complete();
        Project project2 = ProjectMother.completeAlternative();

        BlogPost blogPost1 = BlogpostMother.complete();
        BlogPost blogPost2 = BlogpostMother.completeAlternative();

        projectRepository.save(project1);
        projectRepository.save(project2);
        blogPostRepository.save(blogPost1);
        blogPostRepository.save(blogPost2);

        // when
        SearchResult searchResult = searchService.search("European authentication");

        // then
        assertEquals(Arrays.asList(project1), searchResult.getProjects());
        assertEquals(Arrays.asList(blogPost1), searchResult.getBlogPosts());
    }

    @Test
    public void searchCaseInsensitive() {
        // given
        Project project1 = ProjectMother.complete();
        Project project2 = ProjectMother.completeAlternative();

        BlogPost blogPost1 = BlogpostMother.complete();
        BlogPost blogPost2 = BlogpostMother.completeAlternative();

        projectRepository.save(project1);
        projectRepository.save(project2);
        blogPostRepository.save(blogPost1);
        blogPostRepository.save(blogPost2);

        // when
        SearchResult searchResult = searchService.search("european autHentication");

        // then
        assertEquals(Arrays.asList(project1), searchResult.getProjects());
        assertEquals(Arrays.asList(blogPost1), searchResult.getBlogPosts());
    }

    @Test
    public void searchDiactriticInsensitive() {
        // given
        Project project1 = ProjectMother.complete();
        Project project2 = ProjectMother.completeAlternative();

        BlogPost blogPost1 = BlogpostMother.complete();
        BlogPost blogPost2 = BlogpostMother.completeAlternative();

        projectRepository.save(project1);
        projectRepository.save(project2);
        blogPostRepository.save(blogPost1);
        blogPostRepository.save(blogPost2);

        // when
        SearchResult searchResult = searchService.search("Européan aüthentication");

        // then
        assertEquals(Arrays.asList(project1), searchResult.getProjects());
        assertEquals(Arrays.asList(blogPost1), searchResult.getBlogPosts());
    }

}
