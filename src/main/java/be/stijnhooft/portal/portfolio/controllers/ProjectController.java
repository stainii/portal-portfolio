package be.stijnhooft.portal.portfolio.controllers;

import be.stijnhooft.portal.portfolio.model.Project;
import be.stijnhooft.portal.portfolio.model.ProjectSummary;
import be.stijnhooft.portal.portfolio.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/project/")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping("/")
    public List<ProjectSummary> findAll() {
        return projectService.findAll();
    }

    @RequestMapping("/{id}/")
    public ResponseEntity<Project> findById(@PathVariable("id") String id) {
        Optional<Project> project = projectService.findById(id);
        if (project.isPresent()) {
            return ResponseEntity.of(project);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
