package be.stijnhooft.portal.portfolio.dtos;

import be.stijnhooft.portal.portfolio.model.BlogPost;
import be.stijnhooft.portal.portfolio.model.Project;
import lombok.Builder;
import lombok.Getter;

import java.util.Collection;

@Getter
@Builder
public class SearchResult {

    private Collection<BlogPost> blogPosts;
    private Collection<Project> projects;

}
