import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {ProjectThumbnailComponent} from './project-thumbnail.component';
import {WindowService} from "../window.service";
import {ProjectThumbnailTextPartComponent} from "../project-thumbnail-text-part/project-thumbnail-text-part.component";
import {RouterTestingModule} from "@angular/router/testing";
import {MarkdownModule} from "ngx-markdown";

describe('ProjectThumbnailComponent', () => {
    let component: ProjectThumbnailComponent;
    let fixture: ComponentFixture<ProjectThumbnailComponent>;
    let windowService: WindowService;

    beforeEach(async(() => {
        windowService = new WindowService();
        TestBed.configureTestingModule({
            imports: [RouterTestingModule, MarkdownModule.forRoot()],
            declarations: [ProjectThumbnailComponent, ProjectThumbnailTextPartComponent],
            providers: [{provide: WindowService, useValue: windowService}]
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ProjectThumbnailComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });

    it('when resizing the screen, should allow alternative, when the screen size is greater than 800px', () => {
        //mocking
        let windowServiceGetWidth = spyOn(windowService, "getWidth").and.returnValue(900);

        //execute
        component.onResize(null);

        //verify
        expect(windowServiceGetWidth).toHaveBeenCalled();
        expect(component.allowedToBeAlternative).toBe(true);
    });

    it('when initializing, should allow alternative, when the screen size is greater than 800px', () => {
        //mocking
        let windowServiceGetWidth = spyOn(windowService, "getWidth").and.returnValue(900);

        //execute
        component.ngOnInit();

        //verify
        expect(windowServiceGetWidth).toHaveBeenCalled();
        expect(component.allowedToBeAlternative).toBe(true);
    });

    it('when resizing the screen, should not allow alternative, when the screen size is equal to 800px', () => {
        //mocking
        let windowServiceGetWidth = spyOn(windowService, "getWidth").and.returnValue(800);

        //execute
        component.onResize(null);

        //verify
        expect(windowServiceGetWidth).toHaveBeenCalled();
        expect(component.allowedToBeAlternative).toBe(false);
    });

    it('when initializing, should not allow alternative, when the screen size is equal to 800px', () => {
        //mocking
        let windowServiceGetWidth = spyOn(windowService, "getWidth").and.returnValue(800);

        //execute
        component.ngOnInit();

        //verify
        expect(windowServiceGetWidth).toHaveBeenCalled();
        expect(component.allowedToBeAlternative).toBe(false);
    });

    it('when resizing the screen, should not allow alternative, when the screen size is less than 800px', () => {
        //mocking
        let windowServiceGetWidth = spyOn(windowService, "getWidth").and.returnValue(300);

        //execute
        component.onResize(null);

        //verify
        expect(windowServiceGetWidth).toHaveBeenCalled();
        expect(component.allowedToBeAlternative).toBe(false);
    });

    it('when initializing, should not allow alternative, when the screen size is less than 800px', () => {
        //mocking
        let windowServiceGetWidth = spyOn(windowService, "getWidth").and.returnValue(300);

        //execute
        component.ngOnInit();

        //verify
        expect(windowServiceGetWidth).toHaveBeenCalled();
        expect(component.allowedToBeAlternative).toBe(false);
    });

});
