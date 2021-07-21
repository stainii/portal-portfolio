import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {SearchResults} from "./search-results";
import {environment} from "../environments/environment";

@Injectable({
    providedIn: 'root'
})
export class SearchService {

    public API_ROOT = environment.apiBaseUrl;

    constructor(private http: HttpClient) {
    }

    search(query: string): Observable<SearchResults> {
        return this.http
            .get<SearchResults>(this.API_ROOT + "search/?query=" + query);
    }
}
