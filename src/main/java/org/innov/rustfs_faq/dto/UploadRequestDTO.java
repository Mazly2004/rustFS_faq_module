package org.innov.rustfs_faq.dto;

import jakarta.annotation.Nullable;
import org.springframework.web.multipart.MultipartFile;
import lombok.Data;

@Data
public class UploadRequestDTO {

    private MultipartFile file;
    private String category;
    private String language;
    private String version;

    @Nullable
    private String documentId;

}
