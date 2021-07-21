package be.stijnhooft.portal.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {

    @Id
    private String id;

    @TextIndexed
    private String name;

    @TextIndexed
    private String description;

    private String thumbnail;

    @TextIndexed
    private String content;

    private LocalDate publishDate;

    @TextIndexed
    private List<String> tags;

    private String externalLink;

    public boolean isExternal() {
        return externalLink != null;
    }

    public BlogPostSummary toSummary() {
        return new BlogPostSummary(getId(), getName(), getDescription(), getThumbnail(), getPublishDate(), getExternalLink());
    }

}
