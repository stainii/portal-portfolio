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
public class Project {

    @Id
    private String id;

    @TextIndexed
    private String name;

    @TextIndexed
    private String description;

    private String thumbnail;

    @TextIndexed
    private String role;

    @TextIndexed
    private String details;

    private LocalDate startDate;

    private LocalDate endDate;

    @TextIndexed
    private String company;

    @TextIndexed
    private List<String> tags;

    public ProjectSummary toSummary() {
        return new ProjectSummary(getName(), getDescription(), getThumbnail(), getRole());
    }
}
