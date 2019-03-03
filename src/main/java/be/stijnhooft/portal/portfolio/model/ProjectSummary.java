package be.stijnhooft.portal.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class ProjectSummary {
    private String name;
    private String description;
    private String thumbnail;
    private String role;
}
