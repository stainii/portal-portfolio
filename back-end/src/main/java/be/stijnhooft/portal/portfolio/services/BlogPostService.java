package be.stijnhooft.portal.portfolio.services;

import be.stijnhooft.portal.portfolio.model.BlogPost;
import be.stijnhooft.portal.portfolio.model.BlogPostSummary;
import be.stijnhooft.portal.portfolio.repositories.BlogPostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    @Value("${spring.profiles.active:production}")
    protected String profile;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPostSummary> findAll() {
        return blogPostRepository.findAllByOrderByPublishDateDesc()
            .stream()
            .filter(blogPost -> profile.equals("dev") || !blogPost.getPublishDate().isAfter(LocalDate.now()))
            .map(BlogPost::toSummary)
            .collect(Collectors.toList());
    }

    public Optional<BlogPost> findById(String id) {
        return blogPostRepository.findById(id);
    }
}
