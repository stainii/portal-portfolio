package be.stijnhooft.portal.portfolio.repositories;

import be.stijnhooft.portal.portfolio.model.Project;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
    List<Project> findAllBy(TextCriteria criteria);
    List<Project> findAllByOrderByStartDateDesc();
}
