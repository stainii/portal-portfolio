import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {TechnicalSkillsetComponent} from './technical-skillset.component';
import {D3CloudComponent} from "../d3-cloud/d3-cloud.component";
import {RouterTestingModule} from "@angular/router/testing";

describe('TechnicalSkillsetComponent', () => {
    let component: TechnicalSkillsetComponent;
    let fixture: ComponentFixture<TechnicalSkillsetComponent>;

    beforeEach(async(() => {
        TestBed.configureTestingModule({
            imports: [RouterTestingModule],
            declarations: [TechnicalSkillsetComponent, D3CloudComponent]
        })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(TechnicalSkillsetComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should create', () => {
        expect(component).toBeTruthy();
    });
});
