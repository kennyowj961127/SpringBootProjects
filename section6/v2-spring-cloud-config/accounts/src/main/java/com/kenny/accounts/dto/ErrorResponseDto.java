package com.kenny.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(name = "ErrorResponse", description = "Schema to hold Error Response information")
public class ErrorResponseDto {
    @Schema(description = "API path", example = "/api/create")
    private String apiPath;
    @Schema(description = "HTTP status code", example = "500")
    private HttpStatus errorCode;
    @Schema(description = "Error message", example = "Internal Server Error")
    private String errorMessage;
    @Schema(description = "Error time", example = "2021-09-12T12:00:00")
    private LocalDateTime errorTime;

}
