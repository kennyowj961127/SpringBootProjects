package com.kenny.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(name = "Response", description = "Schema to hold Response information")
public class ResponseDto {
    @Schema(description = "Status of the response")
    private String statusCode;

    @Schema(description = "Message of the response")
    private String statusMsg;
}
