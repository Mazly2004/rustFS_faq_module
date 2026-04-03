package org.innov.rustfs_faq.controller;

import org.innov.rustfs_faq.dto.UploadRequestDTO;
import org.innov.rustfs_faq.dto.UploadResponseDTO;
import org.innov.rustfs_faq.service.HomeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/faq")
public class FaqController {

    private final HomeService homeService;

    public FaqController(HomeService homeService) {
        this.homeService = homeService;
    }

    @PostMapping(value="/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<UploadResponseDTO> uploadDocument(
            @RequestPart("file")MultipartFile file,
            @RequestPart("category")String category,
            @RequestPart("language")String language,
            @RequestPart("version")String version,
            @RequestPart(value = "documentId", required = false) String documentId
            ){

        UploadRequestDTO request = new UploadRequestDTO();
        request.setFile(file);
        request.setCategory(category);
        request.setLanguage(language);
        request.setVersion(version);
        request.setDocumentId(documentId);

        UploadResponseDTO response = homeService.uploadDocument(request);
        return ResponseEntity.ok(response);
    }
}
