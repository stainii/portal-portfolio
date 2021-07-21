import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {HeaderMenuComponent} from './header-menu.component';

describe('HeaderMenuComponent', () => {
    let component: HeaderMenuComponent;
    let fixture: ComponentFixture<HeaderMenuComponent>;

    beforeEach(async(() => {
        TestBed.configureTestingModule({
            declarations: [HeaderMenuComponent]
        })
            .compileComponents();
    }));

    beforeEach(() => {
        fixture = TestBed.createComponent(HeaderMenuComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it('should open when it is closed an we toggle it', () => {
        //dataset
        component.isMobileMenuOpen = false;

        //mocking
        let event = {
            preventDefault: () => {

            }
        };
        let preventDefaultMethod = spyOn(event, "preventDefault");

        //execute
        component.toggleMobileMenu(event);

        //assertions
        expect(component.isMobileMenuOpen).toBe(true);
        expect(preventDefaultMethod).toHaveBeenCalled();
    });

    it('should close when it is open an we toggle it', () => {
        //dataset
        component.isMobileMenuOpen = true;

        //mocking
        let event = {
            preventDefault: () => {

            }
        };
        let preventDefaultMethod = spyOn(event, "preventDefault");

        //execute
        component.toggleMobileMenu(event);

        //assertions
        expect(component.isMobileMenuOpen).toBe(false);
        expect(preventDefaultMethod).toHaveBeenCalled();
    });

    it('should close when it is open an we close it', () => {
        //dataset
        component.isMobileMenuOpen = true;

        //execute
        component.closeMobileMenu();

        //assertions
        expect(component.isMobileMenuOpen).toBe(false);
    });

    it('should stay closed when it is closed already and we close it again', () => {
        //dataset
        component.isMobileMenuOpen = false;

        //execute
        component.closeMobileMenu();

        //assertions
        expect(component.isMobileMenuOpen).toBe(false);
    });

});
