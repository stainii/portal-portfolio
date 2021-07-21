import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {ProjectComponent} from './project.component';
import {ProjectService} from "../project.service";
import {RouterTestingModule} from "@angular/router/testing";
import {MarkdownModule} from "ngx-markdown";

describe('ProjectComponent', () => {
    let component: ProjectComponent;
    let fixture: ComponentFixture<ProjectComponent>;
    let projectService;

    beforeEach(async(() => {
        projectService = jasmine.createSpyObj("ProjectService", ["findByName"]);


        TestBed.configureTestingModule({
            imports: [RouterTestingModule, MarkdownModule.forRoot()],
            declarations: [ProjectComponent],
            providers: [{provide: ProjectService, useValue: projectService}]
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ProjectComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });

    it('should show the project\'s title', () => {
        component.project = {
            id: "test-project",
            name: "test project",
            description: null,
            thumbnail: null,
            role: null,
            details: null,
            startDate: null,
            endDate: null,
            company: null,
            tags: []
        };
        fixture.detectChanges();

        expect(fixture.nativeElement.querySelector("h1").textContent).toContain("test project");
    });

    it('should show the project\'s tags', () => {
        component.project = {
            id: "test-project",
            name: "test project",
            description: null,
            thumbnail: null,
            role: null,
            details: null,
            startDate: null,
            endDate: null,
            company: null,
            tags: ["test", "karma", "angular"]
        };
        fixture.detectChanges();

        expect(fixture.nativeElement.querySelector(".tags").textContent).toContain("#test");
        expect(fixture.nativeElement.querySelector(".tags").textContent).toContain("#karma");
        expect(fixture.nativeElement.querySelector(".tags").textContent).toContain("#angular");
    });
});
