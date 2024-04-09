package com.metinkuzey.restpdfcreatorapi.business.abstracts;

import com.metinkuzey.restpdfcreatorapi.entities.Template;

public interface TemplateService {
    Template createTemplate(Template template);

    Template getTemplateById(String id);
}
