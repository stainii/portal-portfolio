import {Component, Input} from '@angular/core';
import {Router} from "@angular/router";
import {BlogPost} from "../blog-post";
import {WindowService} from "../window.service";

@Component({
  selector: 'portfolio-blog-post-thumbnail-text-part',
  templateUrl: './blog-post-thumbnail-text-part.component.html',
  styleUrls: ['./blog-post-thumbnail-text-part.component.scss']
})
export class BlogPostThumbnailTextPartComponent {

    @Input()
    blogPost: BlogPost;

    constructor(private router: Router, private windowService: WindowService) {

    }

    goToBlogPost(blogPost: BlogPost) {
        if (blogPost.externalLink) {
            this.windowService.openNewWindow(blogPost.externalLink);
        } else {
            this.router.navigate(["/blogpost", blogPost.id]);
        }
    }

}
