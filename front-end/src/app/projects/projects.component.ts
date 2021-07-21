import {Component, OnInit} from '@angular/core';
import {Project} from "../project";
import {ProjectService} from "../project.service";
import {Observable} from "rxjs";

@Component({
  selector: 'portfolio-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.scss']
})
export class ProjectsComponent implements OnInit {

    projects$: Observable<Project[]>;

    constructor(private projectService: ProjectService) {
    }

    ngOnInit() {
        this.projects$ = this.projectService.findMostImportantProjects();
    }

}
