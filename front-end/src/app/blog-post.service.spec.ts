import {async, inject, TestBed} from '@angular/core/testing';

import {BlogPostService} from './blog-post.service';
import {HttpClientModule} from "@angular/common/http";
import {HttpClientTestingModule, HttpTestingController} from "@angular/common/http/testing";

describe('BlogPostService', () => {
    beforeEach(() => {
        TestBed.configureTestingModule({
            imports: [HttpClientModule, HttpClientTestingModule],
            providers: [BlogPostService]
        });
    });
    afterEach(inject([HttpTestingController], (http: HttpTestingController) => {
        http.verify();
    }));

    it('should be created', async(inject([BlogPostService, HttpTestingController],
        (service: BlogPostService, backend: HttpTestingController) => {
            expect(service).toBeTruthy();
        })));
});
