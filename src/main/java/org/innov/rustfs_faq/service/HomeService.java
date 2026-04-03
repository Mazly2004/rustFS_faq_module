package org.innov.rustfs_faq.service;

import org.innov.rustfs_faq.dto.UploadRequestDTO;
import org.innov.rustfs_faq.dto.UploadResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final ValidationService validationService;

    public HomeService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public UploadResponseDTO uploadDocument(UploadRequestDTO request) {
        validationService.validateUploadRequest(request);
        // TODO
        return new UploadResponseDTO();
    }
}