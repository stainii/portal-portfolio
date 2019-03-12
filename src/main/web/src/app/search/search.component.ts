import {Component, OnDestroy, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {SearchResults} from "../search-results";
import {SearchService} from "../search.service";
import {Subscription} from "rxjs";

@Component({
  selector: 'portfolio-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit, OnDestroy {

    query: string = "";
    searchResults: SearchResults;

    private routeSubscription$: Subscription;
    private searchSubscription$: Subscription;

    constructor(private activatedRoute: ActivatedRoute,
                private searchService: SearchService) {}

    ngOnInit() {
        this.routeSubscription$ = this.activatedRoute.queryParams.subscribe((param: any) => {
            this.query = param['query'];

            if (this.query) {
                this.search(this.query);
            }
        });
    }

    search(query: string) {
        this.searchSubscription$ = this.searchService.search(query)
            .subscribe((searchResults: SearchResults) => {
                this.searchResults = searchResults;
            });
    }

    ngOnDestroy(): void {
        this.routeSubscription$.unsubscribe();
        if (this.searchSubscription$) {
            this.searchSubscription$.unsubscribe();
        }
    }

}
