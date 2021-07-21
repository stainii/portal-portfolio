import {Component, OnDestroy} from '@angular/core';
import {Router} from "@angular/router";
import {Subscription} from "rxjs";

@Component({
  selector: 'portfolio-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnDestroy {

    onWelcomePage: boolean;
    private routerSubscription$: Subscription;

    constructor(private router: Router) {
        this.routerSubscription$ = this.router.events.subscribe(() => {
            this.onWelcomePage = this.router.url == "/";
        });
    }

    ngOnDestroy(): void {
        this.routerSubscription$.unsubscribe();
    }

}
