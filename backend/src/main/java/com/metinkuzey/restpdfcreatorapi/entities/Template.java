package com.metinkuzey.restpdfcreatorapi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "templates")
public class Template {
    @Id
    private String id;

    private String templateName;
    private String content;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;

    // Getters and setters
}

