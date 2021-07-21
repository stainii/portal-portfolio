package be.stijnhooft.portal.portfolio.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Collection;

@Getter
@Builder
@EqualsAndHashCode
@ToString
public class SearchResult {

    private Collection<BlogPostSummary> blogPosts;
    private Collection<ProjectSummary> projects;

}
