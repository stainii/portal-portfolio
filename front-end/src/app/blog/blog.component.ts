import {Component, OnInit} from '@angular/core';
import {BlogPost} from "../blog-post";
import {BlogPostService} from "../blog-post.service";
import {Observable} from "rxjs";

@Component({
  selector: 'portfolio-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.scss']
})
export class BlogComponent implements OnInit {

    blogPosts$: Observable<BlogPost[]>;

    constructor(private blogPostService: BlogPostService) {
    }

    ngOnInit() {
        this.blogPosts$ = this.blogPostService.findBlogPosts();
    }

}
