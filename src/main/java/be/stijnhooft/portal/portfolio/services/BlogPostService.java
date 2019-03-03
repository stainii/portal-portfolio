package be.stijnhooft.portal.portfolio.services;

import be.stijnhooft.portal.portfolio.model.BlogPost;
import be.stijnhooft.portal.portfolio.model.BlogPostSummary;
import be.stijnhooft.portal.portfolio.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPostSummary> findAll() {
        return blogPostRepository.findAllByOrderByPublishDateDesc()
            .stream()
            .map(BlogPost::toSummary)
            .collect(Collectors.toList());
    }

    public Optional<BlogPost> findById(String id) {
        return blogPostRepository.findById(id);
    }
}
