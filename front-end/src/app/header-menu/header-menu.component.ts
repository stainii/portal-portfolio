import {Component} from '@angular/core';

@Component({
    selector: 'portfolio-header-menu',
    templateUrl: './header-menu.component.html',
    styleUrls: ['./header-menu.component.scss']
})
export class HeaderMenuComponent {

    isMobileMenuOpen: boolean;

    toggleMobileMenu(event) {
        this.isMobileMenuOpen = !this.isMobileMenuOpen;
        event.preventDefault();
    }

    closeMobileMenu() {
        this.isMobileMenuOpen = false;
    }


}
