import {async, TestBed} from '@angular/core/testing';
import {AppComponent} from './app.component';
import {RouterTestingModule} from "@angular/router/testing";
import {BigHeaderComponent} from "./big-header/big-header.component";
import {NormalHeaderComponent} from "./normal-header/normal-header.component";
import {FooterComponent} from "./footer/footer.component";
import {HeaderMenuComponent} from "./header-menu/header-menu.component";

describe('AppComponent', () => {
    beforeEach(async(() => {
        TestBed.configureTestingModule({
            imports: [RouterTestingModule],
            declarations: [
                AppComponent, BigHeaderComponent, NormalHeaderComponent, FooterComponent, HeaderMenuComponent
            ],
        }).compileComponents();
    }));

    it('should create the app', () => {
        const fixture = TestBed.createComponent(AppComponent);
        const app = fixture.debugElement.componentInstance;
        expect(app).toBeTruthy();
    });
});
