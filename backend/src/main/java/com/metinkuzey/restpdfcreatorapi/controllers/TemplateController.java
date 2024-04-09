package com.metinkuzey.restpdfcreatorapi.controllers;

import com.metinkuzey.restpdfcreatorapi.business.abstracts.TemplateService;
import com.metinkuzey.restpdfcreatorapi.entities.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/templates")
public class TemplateController {
    @Autowired
    private TemplateService templateService;

    @PostMapping
    public ResponseEntity<Template> createTemplate(@RequestBody Template template) {
        Template createdTemplate = templateService.createTemplate(template);
        return ResponseEntity.ok(createdTemplate);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Template> getTemplateById(@PathVariable String id) {
        Template template = templateService.getTemplateById(id);
        return ResponseEntity.ok(template);
    }

    // Diğer CRUD işlemleri için gerekli endpoint'leri buraya ekleyebilirsiniz.
}

