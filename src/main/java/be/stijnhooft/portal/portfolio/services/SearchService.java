package be.stijnhooft.portal.portfolio.services;

import be.stijnhooft.portal.portfolio.model.*;
import be.stijnhooft.portal.portfolio.repositories.BlogPostRepository;
import be.stijnhooft.portal.portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {

    private final ProjectRepository projectRepository;

    private final BlogPostRepository blogPostRepository;

    @Autowired
    public SearchService(ProjectRepository projectRepository, BlogPostRepository blogPostRepository) {
        this.projectRepository = projectRepository;
        this.blogPostRepository = blogPostRepository;
    }

    public SearchResult search(String query) {
        String[] queryWords = query.split("\\s+");
        TextCriteria criteria = TextCriteria.forDefaultLanguage()
            .matchingAny(queryWords)
            .caseSensitive(false)
            .diacriticSensitive(false);

        List<BlogPostSummary> blogPosts = blogPostRepository.findAllBy(criteria)
                                                            .stream()
                                                            .map(BlogPost::toSummary)
                                                            .collect(Collectors.toList());

        List<ProjectSummary> projects = projectRepository.findAllBy(criteria)
                                                         .stream()
                                                         .map(Project::toSummary)
                                                         .collect(Collectors.toList());

        return SearchResult.builder()
            .blogPosts(blogPosts)
            .projects(projects)
            .build();
    }
}
