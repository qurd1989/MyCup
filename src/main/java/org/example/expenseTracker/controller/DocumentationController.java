package org.example.expenseTracker.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/docs")
public class DocumentationController {

    @GetMapping("/expense-tracker")
    public ResponseEntity<Resource> getDocumentation() {
        try {
            Path filePath = Paths.get("docs/expense-tracker-docs.md").toAbsolutePath().normalize();
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists()) {
                return ResponseEntity.ok()
                        .contentType(MediaType.TEXT_MARKDOWN)
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"expense-tracker-docs.md\"")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
