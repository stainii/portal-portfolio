import {async, inject, TestBed} from '@angular/core/testing';

import {ProjectService} from './project.service';
import {HttpClientModule} from "@angular/common/http";
import {HttpClientTestingModule, HttpTestingController} from "@angular/common/http/testing";

describe('ProjectService', () => {
    beforeEach(() => TestBed.configureTestingModule({
        imports: [HttpClientModule, HttpClientTestingModule],
        providers: [ProjectService]
    }));

    afterEach(inject([HttpTestingController], (http: HttpTestingController) => {
        http.verify();
    }));

    it('should be created', async(inject([ProjectService, HttpTestingController],
        (service: ProjectService, backend: HttpTestingController) => {
            expect(service).toBeTruthy();
        })));
});
