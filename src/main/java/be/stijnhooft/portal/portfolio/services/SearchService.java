package be.stijnhooft.portal.portfolio.services;

import be.stijnhooft.portal.portfolio.dtos.SearchResult;
import be.stijnhooft.portal.portfolio.repositories.BlogPostRepository;
import be.stijnhooft.portal.portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Service;

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

        return SearchResult.builder()
            .blogPosts(blogPostRepository.findAllBy(criteria))
            .projects(projectRepository.findAllBy(criteria))
            .build();
    }
}
