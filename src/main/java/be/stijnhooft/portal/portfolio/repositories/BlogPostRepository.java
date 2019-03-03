package be.stijnhooft.portal.portfolio.repositories;

import be.stijnhooft.portal.portfolio.model.BlogPost;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogPostRepository extends MongoRepository<BlogPost, String> {
    List<BlogPost> findAllBy(TextCriteria criteria);
}
