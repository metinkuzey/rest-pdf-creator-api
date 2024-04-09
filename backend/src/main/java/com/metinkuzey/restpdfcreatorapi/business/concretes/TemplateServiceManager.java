package com.metinkuzey.restpdfcreatorapi.business.concretes;

import com.metinkuzey.restpdfcreatorapi.business.abstracts.TemplateService;
import com.metinkuzey.restpdfcreatorapi.entities.Template;
import com.metinkuzey.restpdfcreatorapi.exceptions.ResourceNotFoundException;
import com.metinkuzey.restpdfcreatorapi.repositories.abstracts.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateServiceManager implements TemplateService {
    @Autowired
    private TemplateRepository templateRepository;

    public Template createTemplate(Template template) {
        // Gerekli iş mantığını ve doğrulamaları burada gerçekleştirin
        return templateRepository.save(template);
    }

    public Template getTemplateById(String id) {
        // Template'ı id'ye göre getir
        return templateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Template not found with id " + id));
    }

    // Diğer CRUD işlemleri için gerekli servis metodlarını buraya ekleyebilirsiniz.
}
