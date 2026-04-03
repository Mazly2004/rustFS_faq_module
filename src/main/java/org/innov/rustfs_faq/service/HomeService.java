package org.innov.rustfs_faq.service;

import org.innov.rustfs_faq.dto.UploadRequestDTO;
import org.innov.rustfs_faq.dto.UploadResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final ValidationService validationService;
    private final FilePreprocessingService filePreprocessingService;

    public HomeService(ValidationService validationService, FilePreprocessingService filePreprocessingService) {
        this.validationService = validationService;
        this.filePreprocessingService = filePreprocessingService;
    }



    public UploadResponseDTO uploadDocument(UploadRequestDTO request) {
        validationService.validateUploadRequest(request);
        String filename = filePreprocessingService.extractFilename(request.getFile());
        System.out.println("Processing file: " + filename);
        // TODO
        return new UploadResponseDTO();
    }
}