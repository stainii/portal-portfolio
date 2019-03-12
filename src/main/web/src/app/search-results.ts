import {BlogPost} from "./blog-post";
import {Project} from "./project";

export interface SearchResults {

    projects: Project[],
    blogPosts: BlogPost[]

}
