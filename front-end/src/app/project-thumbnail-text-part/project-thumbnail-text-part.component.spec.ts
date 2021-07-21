import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {ProjectThumbnailTextPartComponent} from './project-thumbnail-text-part.component';
import {RouterTestingModule} from "@angular/router/testing";
import {MarkdownModule} from "ngx-markdown";

describe('ProjectThumbnailTextPartComponent', () => {
    let component: ProjectThumbnailTextPartComponent;
    let fixture: ComponentFixture<ProjectThumbnailTextPartComponent>;

    beforeEach(async(() => {
        TestBed.configureTestingModule({
            imports: [RouterTestingModule, MarkdownModule.forRoot()],
            declarations: [ProjectThumbnailTextPartComponent]
        })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(ProjectThumbnailTextPartComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});
