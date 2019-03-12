import {async, inject, TestBed} from '@angular/core/testing';

import {SearchService} from './search.service';
import {HttpClientTestingModule, HttpTestingController} from "@angular/common/http/testing";
import {HttpClientModule} from "@angular/common/http";

describe('SearchService', () => {

    beforeEach(() => {
        TestBed.configureTestingModule({
            imports: [HttpClientModule, HttpClientTestingModule],
            providers: [SearchService]
        });
    });

    afterEach(inject([HttpTestingController], (http: HttpTestingController) => {
        http.verify();
    }));

    it('should be created', async(inject([SearchService, HttpTestingController],
        (service: SearchService, backend: HttpTestingController) => {
        expect(service).toBeTruthy();
    })));
});
