package be.stijnhooft.portal.portfolio.model;

import be.stijnhooft.portal.portfolio.mothers.ProjectMother;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectTest {

    @Test
    public void toSummary() {
        Project project = ProjectMother.complete();
        ProjectSummary summary = project.toSummary();
        assertEquals(project.getId(), summary.getId());
        assertEquals(project.getName(), summary.getName());
        assertEquals(project.getDescription(), summary.getDescription());
        assertEquals(project.getThumbnail(), summary.getThumbnail());
        assertEquals(project.getRole(), summary.getRole());
    }

}
