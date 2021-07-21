import {Component, HostListener, Input, OnInit} from '@angular/core';
import {BlogPost} from "../blog-post";
import {WindowService} from "../window.service";

@Component({
  selector: 'portfolio-blog-post-thumbnail',
  templateUrl: './blog-post-thumbnail.component.html',
  styleUrls: ['./blog-post-thumbnail.component.scss']
})
export class BlogPostThumbnailComponent implements OnInit {

    @Input()
    blogPost: BlogPost;

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
