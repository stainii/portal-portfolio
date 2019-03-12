import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable, of} from "rxjs";
import {BlogPost} from "./blog-post";
import {tap} from "rxjs/operators";
import {environment} from "../environments/environment";

@Injectable({
    providedIn: 'root'
})
export class BlogPostService {

    private blogPostsCache: BlogPost[];
    public API_ROOT = environment.apiBaseUrl;

    constructor(private http: HttpClient) {
    }

    findBlogPosts(): Observable<BlogPost[]> {
        if (this.blogPostsCache) {
            return of(this.blogPostsCache);
        } else {
            return this.http
                .get<BlogPost[]>(this.API_ROOT + "blogpost/")
                .pipe(tap(blogPosts => this.blogPostsCache = blogPosts));
        }
    }

    findByName(name: string): Observable<BlogPost> {
        return this.http
            .get<BlogPost>(this.API_ROOT + "blogpost/" + name + "/");
    }
}
