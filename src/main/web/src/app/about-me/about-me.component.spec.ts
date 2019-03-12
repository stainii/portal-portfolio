import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {AboutMeComponent} from './about-me.component';
import {CompaniesComponent} from "../companies/companies.component";
import {TechnicalSkillsetComponent} from "../technical-skillset/technical-skillset.component";
import {D3CloudComponent} from "../d3-cloud/d3-cloud.component";
import {CertificationsComponent} from "../certifications/certifications.component";
import {RouterTestingModule} from "@angular/router/testing";
import {MarkdownModule} from "ngx-markdown";
import {HttpClient} from "@angular/common/http";
import {HttpClientTestingModule} from "@angular/common/http/testing";

describe('AboutMeComponent', () => {
    let component: AboutMeComponent;
    let fixture: ComponentFixture<AboutMeComponent>;

    beforeEach(async(() => {
        TestBed.configureTestingModule({
            imports: [HttpClientTestingModule, RouterTestingModule, MarkdownModule.forRoot({ loader: HttpClient })],
            declarations: [AboutMeComponent, CompaniesComponent, CertificationsComponent, TechnicalSkillsetComponent, D3CloudComponent],
        }).compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(AboutMeComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});
