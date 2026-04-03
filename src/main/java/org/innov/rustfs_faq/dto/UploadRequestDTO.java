package org.innov.rustfs_faq.dto;

import jakarta.annotation.Nullable;
import org.springframework.web.multipart.MultipartFile;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UploadRequestDTO {

    @NotNull(message = "File is required")
    private MultipartFile file;

    @NotBlank(message = "Category is required")
    private String category;

    @NotBlank(message = "Language is required")
    private String language;

    @NotBlank(message = "Version is required")
    private String version;

    @Nullable
    private String documentId;
}
