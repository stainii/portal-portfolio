package be.stijnhooft.portal.portfolio.repositories;

import be.stijnhooft.portal.portfolio.model.Project;
import be.stijnhooft.portal.portfolio.mothers.ProjectMother;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@DataMongoTest
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:application-test.properties")
public class ProjectRepositoryTest {

    @Autowired
    private ProjectRepository projectRepository;

    @Before
    public void init() {
        projectRepository.deleteAll();
    }

    @Test
    public void findByIdWhenSuccess() {
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        Optional<Project> result = projectRepository.findById(project.getId());

        assertTrue(result.isPresent());
        assertEquals(project, result.get());
    }

    @Test
    public void findByIdWhenNotFound() {
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        assertFalse(projectRepository.findById("non existing").isPresent());
    }

    @Test
    public void findByTagsWhenSearchingWithASingleTagAndFindingOneProject() {
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(project.getTags().get(0))));
        assertEquals(Arrays.asList(project), projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(project.getTags().get(1))));
    }

    @Test
    public void findByTagsWhenSearchingWithMultipleTagsAndFindingOneProject() {
        // given
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny(project.getTags().get(0), project.getTags().get(1)));

        // then
        assertEquals(Arrays.asList(project), result);
    }

    @Test
    public void findByTagsWhenSearchingWithOneTagAndFindingMultipleProject() {
        // given
        Project project1 = ProjectMother.complete();
        Project project2 = ProjectMother.completeAlternative();
        projectRepository.save(project1);
        projectRepository.save(project2);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("jpa"));

        // then
        assertEquals(Arrays.asList(project1, project2), result);
    }

    @Test
    public void findByTagsWhenSearchingWithMultipleTagsAndFindingMultipleProjects() {
        // given
        Project project1 = ProjectMother.complete();
        Project project2 = ProjectMother.completeAlternative();
        projectRepository.save(project1);
        projectRepository.save(project2);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("jpa", "docker"));

        // then
        assertEquals(Arrays.asList(project2, project1), result);
    }

    @Test
    public void findWhenNotFound() {
        // given
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("random"));

        // then
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void findByTitle() {
        // given
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("unionvms"));

        // then
        assertEquals(Arrays.asList(project), result);
    }

    @Test
    public void findByDescription() {
        // given
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("[description]"));

        // then
        assertEquals(Arrays.asList(project), result);
    }

    @Test
    public void findByDetails() {
        // given
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("official"));

        // then
        assertEquals(Arrays.asList(project), result);
    }

    @Test
    public void findByRole() {
        // given
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("developer", "lead"));

        // then
        assertEquals(Arrays.asList(project), result);
    }

    @Test
    public void findByCompany() {
        // given
        Project project = ProjectMother.complete();
        projectRepository.save(project);

        // when
        List<Project> result = projectRepository.findAllBy(TextCriteria.forDefaultLanguage().matchingAny("developer", "Agriculture"));

        // then
        assertEquals(Arrays.asList(project), result);
    }

    @Test
    public void findAllOrderByStartDateDesc() {
        // given
        Project project1 = ProjectMother.complete();
        Project project2 = ProjectMother.completeAlternative();
        projectRepository.save(project1);
        projectRepository.save(project2);

        // when
        List<Project> result = projectRepository.findAllByOrderByStartDateDesc();

        // then
        assertEquals(Arrays.asList(project1, project2), result);
    }

}
