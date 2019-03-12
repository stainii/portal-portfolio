package be.stijnhooft.portal.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class BlogPostSummary {
    private String id;
    private String name;
    private String description;
    private String thumbnail;
    private LocalDate publishDate;
    private String externalLink;

    public boolean isExternal() {
        return externalLink != null;
    }
}
