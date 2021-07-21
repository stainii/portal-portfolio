import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {ProjectsComponent} from './projects.component';
import {ProjectThumbnailComponent} from "../project-thumbnail/project-thumbnail.component";
import {ProjectThumbnailTextPartComponent} from "../project-thumbnail-text-part/project-thumbnail-text-part.component";
import {ProjectService} from "../project.service";
import {MarkdownModule} from "ngx-markdown";
import {Project} from "../project";
import {of} from "rxjs";
import {RouterTestingModule} from "@angular/router/testing";

describe('ProjectsComponent', () => {
    let component: ProjectsComponent;
    let fixture: ComponentFixture<ProjectsComponent>;
    let projectService;

    let projects: Project[] = [ {
        id: "test",
        name: "test",
        description: "test",
        thumbnail: "test.jpg",
        role: "tester",
        details: "test",
        startDate: null,
        endDate: null,
        company: "test",
        tags: [ "test" ]
    }];

    beforeEach(async(() => {
        projectService = jasmine.createSpyObj("ProjectService", ["findMostImportantProjects"]);

        projectService.findMostImportantProjects.and.returnValue(of(projects));

        TestBed.configureTestingModule({
            imports: [ RouterTestingModule, MarkdownModule.forRoot() ],
            declarations: [ProjectsComponent, ProjectThumbnailComponent, ProjectThumbnailTextPartComponent],
            providers: [ {provide: ProjectService, useValue: projectService} ]
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ProjectsComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
        expect(component.projects$).toBeTruthy();
    });

});
