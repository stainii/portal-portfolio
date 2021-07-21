import {Component, OnDestroy, OnInit} from '@angular/core';
import {ActivatedRoute, Params, Router} from "@angular/router";
import {ProjectService} from "../project.service";
import {Project} from "../project";
import {Subscription} from "rxjs";

@Component({
  selector: 'portfolio-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.scss']
})
export class ProjectComponent implements OnInit, OnDestroy {

    project: Project;
    private projectSubscription$: Subscription;

    constructor(private route: ActivatedRoute, private router: Router,
                private projectService: ProjectService) {
    }

    ngOnInit() {
        this.route.params.forEach((params: Params) => {
            if (params && params['projectName']) {
                let projectName = params['projectName'];
                this.projectSubscription$ = this.projectService.findByName(projectName)
                    .subscribe((project : Project) => {
                        this.project = project;
                    });
            }

        });
    }

    ngOnDestroy(): void {
        this.projectSubscription$.unsubscribe();
    }
}
