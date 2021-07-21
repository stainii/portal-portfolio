import {Component, Input} from '@angular/core';
import {Project} from "../project";
import {Router} from "@angular/router";

@Component({
  selector: 'portfolio-project-thumbnail-text-part',
  templateUrl: './project-thumbnail-text-part.component.html',
  styleUrls: ['./project-thumbnail-text-part.component.scss']
})
export class ProjectThumbnailTextPartComponent {

    @Input()
    project: Project;

    constructor(private router: Router) {

    }

    goToProject(project: Project) {
        this.router.navigate(["/projects", project.id]);
    }

}
