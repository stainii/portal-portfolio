import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {BlogComponent} from './blog.component';
import {BlogPostThumbnailComponent} from "../blog-post-thumbnail/blog-post-thumbnail.component";
import {BlogPostThumbnailTextPartComponent} from "../blog-post-thumbnail-text-part/blog-post-thumbnail-text-part.component";
import {BlogPostService} from "../blog-post.service";
import {BlogPost} from "../blog-post";
import {of} from "rxjs";
import {RouterTestingModule} from "@angular/router/testing";
import {MarkdownModule} from "ngx-markdown";

describe('BlogComponent', () => {
    let component: BlogComponent;
    let fixture: ComponentFixture<BlogComponent>;
    let blogPostService;
    let blogPosts: BlogPost[] = [{
        id: "test",
        name: "test",
        description: "test description",
        content: "test content",
        thumbnail: "test",
        publishDate: new Date("2019-02-02 10:22:00"),
        externalLink: null,
        tags: ["test", "web"]
    }];

    beforeEach(async(() => {
        blogPostService = jasmine.createSpyObj("BlogPostService", ["findBlogPosts"]);
        blogPostService.findBlogPosts.and.returnValue(of(blogPosts));

        TestBed.configureTestingModule({
            imports: [RouterTestingModule, MarkdownModule.forRoot()],
            declarations: [BlogComponent, BlogPostThumbnailComponent, BlogPostThumbnailTextPartComponent],
            providers: [{provide: BlogPostService, useValue: blogPostService}]
        })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(BlogComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
        expect(component.blogPosts$).toBeTruthy();
    });

});
