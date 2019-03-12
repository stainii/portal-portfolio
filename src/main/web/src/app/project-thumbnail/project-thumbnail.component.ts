import {Component, HostListener, Input, OnInit} from '@angular/core';
import {Project} from "../project";
import {WindowService} from "../window.service";

@Component({
  selector: 'portfolio-project-thumbnail',
  templateUrl: './project-thumbnail.component.html',
  styleUrls: ['./project-thumbnail.component.scss']
})
export class ProjectThumbnailComponent implements OnInit {

    @Input()
    project: Project;

    @Input()
    alternative: boolean;

    allowedToBeAlternative: boolean;

    constructor(private windowService: WindowService) {

    }

    ngOnInit() {
        this.checkIfAlternativePositioningIsAllowed();
    }

    @HostListener('window:resize', ['$event'])
    onResize(event) {
        this.checkIfAlternativePositioningIsAllowed();
    }

    checkIfAlternativePositioningIsAllowed() {
        this.allowedToBeAlternative = this.windowService.getWidth() > 800;
    }

}
