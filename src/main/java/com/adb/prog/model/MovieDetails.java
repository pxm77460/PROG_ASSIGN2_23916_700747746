package com.adb.prog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieDetails {

    private String ids;

    private String title;

    private String description;

    private String year;

    private Integer runtime;

    private String rating;

    private String votes;

    private Integer revenue;

    private String actor;

    private String director;

    private String genre;
}
