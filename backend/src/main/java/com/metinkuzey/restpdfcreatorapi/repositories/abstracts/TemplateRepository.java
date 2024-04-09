package com.metinkuzey.restpdfcreatorapi.repositories.abstracts;

import com.metinkuzey.restpdfcreatorapi.entities.Template;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TemplateRepository extends MongoRepository<Template, String> {
}
