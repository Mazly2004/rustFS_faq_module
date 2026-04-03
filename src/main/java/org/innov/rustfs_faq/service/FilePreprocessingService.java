package org.innov.rustfs_faq.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FilePreprocessingService {

    public String extractFilename(MultipartFile file) {
        String originalFilename = file.getOriginalFilename();
        if (originalFilename == null || originalFilename.isBlank()) {
            throw new IllegalArgumentException("File name is invalid");
        }
        return originalFilename.trim();
    }
}
