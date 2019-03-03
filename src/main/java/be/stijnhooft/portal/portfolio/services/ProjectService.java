package be.stijnhooft.portal.portfolio.services;

import be.stijnhooft.portal.portfolio.model.Project;
import be.stijnhooft.portal.portfolio.model.ProjectSummary;
import be.stijnhooft.portal.portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectSummary> findAll() {
        return projectRepository.findAllByOrderByStartDateDesc()
            .stream()
            .map(Project::toSummary)
            .collect(Collectors.toList());
    }

    public Optional<Project> findById(String id) {
        return projectRepository.findById(id);
    }
}
