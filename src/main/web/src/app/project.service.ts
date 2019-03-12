import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable, of} from "rxjs";
import {Project} from "./project";
import {tap} from "rxjs/operators";
import {environment} from "../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

    private mostImportantProjectsCache: Project[];
    public API_ROOT = environment.apiBaseUrl;

    constructor(private http: HttpClient) {}

    findMostImportantProjects(): Observable<Project[]> {
        if (this.mostImportantProjectsCache) {
            return of(this.mostImportantProjectsCache);
        } else {
            return this.http
                .get<Project[]>(this.API_ROOT + "project/")
                .pipe(tap(projects => this.mostImportantProjectsCache = projects));
        }
    }

    findByName(name: string): Observable<Project> {
        return this.http
            .get<Project>(this.API_ROOT + "project/" + name + "/");
    }

}
