package be.stijnhooft.portal.portfolio.services;

import be.stijnhooft.portal.portfolio.model.Project;
import be.stijnhooft.portal.portfolio.model.ProjectSummary;
import be.stijnhooft.portal.portfolio.mothers.ProjectMother;
import be.stijnhooft.portal.portfolio.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
public class ProjectServiceTest {

    @InjectMocks
    private ProjectService projectService;

    @Mock
    private ProjectRepository projectRepository;

    @Test
    public void findAll() {
        Project project1 = ProjectMother.complete();
        ProjectSummary projectSummary1 = project1.toSummary();

        Project project2 = ProjectMother.completeAlternative();
        ProjectSummary projectSummary2 = project2.toSummary();

        doReturn(Arrays.asList(project1, project2)).when(projectRepository).findAllByOrderByStartDateDesc();

        List<ProjectSummary> result = projectService.findAll();

        verify(projectRepository).findAllByOrderByStartDateDesc();
        verifyNoMoreInteractions(projectRepository);

        assertEquals(Arrays.asList(projectSummary1, projectSummary2), result);
    }

    @Test
    public void findById() {
        Project project = ProjectMother.complete();
        String id = project.getId();

        doReturn(Optional.of(project)).when(projectRepository).findById(id);

        Optional<Project> result = projectService.findById(id);

        verify(projectRepository).findById(id);
        verifyNoMoreInteractions(projectRepository);

        assertTrue(result.isPresent());
        assertEquals(project, result.get());
    }
}
