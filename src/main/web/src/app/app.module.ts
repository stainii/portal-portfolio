import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {RouterModule, Routes} from "@angular/router";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {ClickOutsideModule} from 'ng-click-outside';
import {BigHeaderComponent} from './big-header/big-header.component';
import {NormalHeaderComponent} from './normal-header/normal-header.component';
import {HeaderMenuComponent} from './header-menu/header-menu.component';
import {FooterComponent} from './footer/footer.component';
import {AboutMeComponent} from './about-me/about-me.component';
import {CompaniesComponent} from './companies/companies.component';
import {CertificationsComponent} from './certifications/certifications.component';
import {TechnicalSkillsetComponent} from './technical-skillset/technical-skillset.component';
import {D3CloudComponent} from './d3-cloud/d3-cloud.component';
import {BlogComponent} from './blog/blog.component';
import {BlogPostThumbnailComponent} from './blog-post-thumbnail/blog-post-thumbnail.component';
import {BlogPostThumbnailTextPartComponent} from './blog-post-thumbnail-text-part/blog-post-thumbnail-text-part.component';
import {ProjectComponent} from './project/project.component';
import {BlogPostComponent} from './blog-post/blog-post.component';
import {ProjectThumbnailComponent} from './project-thumbnail/project-thumbnail.component';
import {ProjectThumbnailTextPartComponent} from './project-thumbnail-text-part/project-thumbnail-text-part.component';
import {ProjectsComponent} from './projects/projects.component';
import {SearchComponent} from './search/search.component';
import {WelcomeComponent} from './welcome/welcome.component';
import {MarkdownModule} from "ngx-markdown";

export const routes: Routes = [
    {path: '', component: WelcomeComponent},
    {path: 'about-me', component: AboutMeComponent},
    {path: 'projects', component: ProjectsComponent},
    {path: 'projects/:projectName', component: ProjectComponent},
    {path: 'blog', component: BlogComponent},
    {path: 'blogpost/:blogPostName', component: BlogPostComponent},
    {path: 'search', component: SearchComponent},
];

@NgModule({
    declarations: [
        AppComponent,
        BigHeaderComponent,
        NormalHeaderComponent,
        HeaderMenuComponent,
        FooterComponent,
        AboutMeComponent,
        CompaniesComponent,
        CertificationsComponent,
        TechnicalSkillsetComponent,
        D3CloudComponent,
        BlogComponent,
        BlogPostThumbnailComponent,
        BlogPostThumbnailTextPartComponent,
        ProjectComponent,
        BlogPostComponent,
        ProjectThumbnailComponent,
        ProjectThumbnailTextPartComponent,
        ProjectsComponent,
        SearchComponent,
        WelcomeComponent
    ],
    imports: [
        BrowserModule,
        RouterModule.forRoot(routes),
        ClickOutsideModule,
        HttpClientModule,
        FormsModule,
        MarkdownModule.forRoot({ loader: HttpClient }),
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
