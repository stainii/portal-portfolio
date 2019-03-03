package be.stijnhooft.portal.portfolio.repositories;

import be.stijnhooft.portal.portfolio.model.Project;
import be.stijnhooft.portal.portfolio.mothers.ProjectMother;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@DataMongoTest
@RunWith(SpringRunner.class)
public class ProjectRepositoryTest {

    @Autowired
    private ProjectRepository projectRepository;

    @Before
    public void init() {
        projectRepository.deleteAll();
    }

    @Test
    public void findByIdWhenSuccess() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(project, projectRepository.findById(project.getId()).get());
    }

    @Test
    public void findByIdWhenNotFound() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertFalse(projectRepository.findById("non existing").isPresent());
    }

    @Test
    public void findByTagsWhenSearchingWithASingleTagAndFindingOneProject() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(project.getTags().get(0))));
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(project.getTags().get(1))));
    }

    @Test
    public void findByTagsWhenSearchingWithMultipleTagsAndFindingOneProject() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(project.getTags().get(0), project.getTags().get(1))));
    }

    @Test
    public void findByTagsWhenSearchingWithOneTagAndFindingMultipleProject() {
        // given
        Project project1 = ProjectMother.complete();
        Project project2 = ProjectMother.completeAlternative();

        // when
        projectRepository.save(project1);
        projectRepository.save(project2);

        // then
        assertEquals(Arrays.asList(project1, project2), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("jpa")));
    }

    @Test
    public void findByTagsWhenSearchingWithMultipleTagsAndFindingMultipleProjects() {
        // given
        Project project1 = ProjectMother.complete();
        Project project2 = ProjectMother.completeAlternative();

        // when
        projectRepository.save(project1);
        projectRepository.save(project2);

        // then
        assertEquals(Arrays.asList(project2, project1), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("jpa", "docker")));
    }

    @Test
    public void findWhenNotFound() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(new ArrayList<>(), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("random")));
    }

    @Test
    public void findByTitle() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("unionvms")));
    }

    @Test
    public void findByDescription() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("[description]")));
    }

    @Test
    public void findByDetails() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("official")));
    }

    @Test
    public void findByRole() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("developer", "lead")));
    }

    @Test
    public void findByCompany() {
        // given
        Project project = ProjectMother.complete();

        // when
        projectRepository.save(project);

        // then
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("developer", "Agriculture")));
    }

}
