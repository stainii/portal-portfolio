import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {BlogPostThumbnailTextPartComponent} from './blog-post-thumbnail-text-part.component';
import {RouterTestingModule} from "@angular/router/testing";
import {WindowService} from "../window.service";
import {MarkdownModule} from "ngx-markdown";

describe('BlogPostThumbnailTextPartComponent', () => {
    let component: BlogPostThumbnailTextPartComponent;
    let fixture: ComponentFixture<BlogPostThumbnailTextPartComponent>;
    let windowService;

    beforeEach(async(() => {
        windowService = jasmine.createSpyObj("WindowService", ["openNewWindow"]);
        TestBed.configureTestingModule({
            imports: [RouterTestingModule, MarkdownModule.forRoot()],
            declarations: [BlogPostThumbnailTextPartComponent],
            providers: [{provide: WindowService, useValue: windowService}]
        })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(BlogPostThumbnailTextPartComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});
