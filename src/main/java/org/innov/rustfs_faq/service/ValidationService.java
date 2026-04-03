package org.innov.rustfs_faq.service;

import org.innov.rustfs_faq.dto.UploadRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidationService {

    private static final List<String> LANGUAGES = List.of("ENGLISH", "SHONA");
    private static final List<String> CATEGORIES = List.of("ECOCASH", "MAISHA", "ECOSURE");

    public void validateUploadRequest(UploadRequestDTO request) {
        if (!LANGUAGES.contains(request.getLanguage().toUpperCase())) {
            throw new IllegalArgumentException("Invalid language: " + request.getLanguage());
        }
        if (!CATEGORIES.contains(request.getCategory().toUpperCase())) {
            throw new IllegalArgumentException("Invalid category: " + request.getCategory());
        }
    }
}