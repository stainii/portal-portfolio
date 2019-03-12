import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {BlogPostComponent} from './blog-post.component';
import {BlogPostService} from "../blog-post.service";
import {RouterTestingModule} from "@angular/router/testing";
import {MarkdownModule} from "ngx-markdown";

describe('BlogPostComponent', () => {
    let component: BlogPostComponent;
    let fixture: ComponentFixture<BlogPostComponent>;
    let blogPostService;

    beforeEach(async(() => {
        blogPostService = jasmine.createSpyObj("BlogPostService", ["findByName"]);
        TestBed.configureTestingModule({
            imports: [RouterTestingModule, MarkdownModule.forRoot()],
            declarations: [BlogPostComponent],
            providers: [{provide: BlogPostService, useValue: blogPostService}]
        })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(BlogPostComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});
