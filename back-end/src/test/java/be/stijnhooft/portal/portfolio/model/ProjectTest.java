package be.stijnhooft.portal.portfolio.model;

import be.stijnhooft.portal.portfolio.mothers.ProjectMother;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
