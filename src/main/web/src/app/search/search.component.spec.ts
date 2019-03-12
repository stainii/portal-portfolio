import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {SearchComponent} from './search.component';
import {FormsModule} from "@angular/forms";
import {BlogPostThumbnailComponent} from "../blog-post-thumbnail/blog-post-thumbnail.component";
import {ProjectThumbnailComponent} from "../project-thumbnail/project-thumbnail.component";
import {BlogPostThumbnailTextPartComponent} from "../blog-post-thumbnail-text-part/blog-post-thumbnail-text-part.component";
import {ProjectThumbnailTextPartComponent} from "../project-thumbnail-text-part/project-thumbnail-text-part.component";
import {RouterTestingModule} from "@angular/router/testing";
import {SearchService} from "../search.service";
import {MarkdownModule} from "ngx-markdown";

describe('SearchComponent', () => {
    let component: SearchComponent;
    let fixture: ComponentFixture<SearchComponent>;
    let searchService;

    beforeEach(async(() => {
        searchService = jasmine.createSpyObj("SearchService", ["search"]);
        TestBed.configureTestingModule({
            imports: [FormsModule, RouterTestingModule, MarkdownModule.forRoot()],
            declarations: [SearchComponent, BlogPostThumbnailComponent, ProjectThumbnailComponent, BlogPostThumbnailTextPartComponent, ProjectThumbnailTextPartComponent],
            providers: [{provide: SearchService, useValue: searchService}]
        })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(SearchComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});
