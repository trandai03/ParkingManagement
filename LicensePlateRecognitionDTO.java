package com.project.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LicensePlateRecognitionDTO {
    private String imageBase64;
    private String originalImagePath;
    private String processedImagePath;
    private String recognizedPlate;
    private Double confidence;
}