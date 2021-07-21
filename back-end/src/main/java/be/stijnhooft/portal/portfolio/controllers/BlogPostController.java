package be.stijnhooft.portal.portfolio.controllers;

import be.stijnhooft.portal.portfolio.model.BlogPost;
import be.stijnhooft.portal.portfolio.model.BlogPostSummary;
import be.stijnhooft.portal.portfolio.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blogpost/")
public class BlogPostController {

    private final BlogPostService blogPostService;

    @Autowired
    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @RequestMapping("/")
    public List<BlogPostSummary> findAll() {
        return blogPostService.findAll();
    }

    @RequestMapping("/{id}/")
    public ResponseEntity<BlogPost> findById(@PathVariable("id") String id) {
        Optional<BlogPost> blogPost = blogPostService.findById(id);
        if (blogPost.isPresent()) {
            return ResponseEntity.of(blogPost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
