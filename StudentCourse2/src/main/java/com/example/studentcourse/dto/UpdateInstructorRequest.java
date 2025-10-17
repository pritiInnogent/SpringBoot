package com.example.studentcourse.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateInstructorRequest {
    @NotBlank
    private String instructor;
}
