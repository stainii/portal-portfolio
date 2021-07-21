import {Component, OnDestroy, OnInit} from '@angular/core';
import {BlogPost} from "../blog-post";
import {ActivatedRoute, Params} from "@angular/router";
import {BlogPostService} from "../blog-post.service";
import {Subscription} from "rxjs";

@Component({
  selector: 'portfolio-blog-post',
  templateUrl: './blog-post.component.html',
  styleUrls: ['./blog-post.component.scss']
})
export class BlogPostComponent implements OnInit, OnDestroy {

    blogPost: BlogPost;
    private blogPostSubscription$: Subscription;

    constructor(private route: ActivatedRoute,
                private blogPostService: BlogPostService) {
    }

    ngOnInit() {
        this.route.params.forEach((params: Params) => {
            if (params && params['blogPostName']) {
                let blogPostName = params['blogPostName'];
                this.blogPostSubscription$ = this.blogPostService.findByName(blogPostName)
                    .subscribe(blogPost => this.blogPost = blogPost);
            }
        });
    }

    ngOnDestroy(): void {
        if (this.blogPostSubscription$) {
            this.blogPostSubscription$.unsubscribe();
        }
    }
}
