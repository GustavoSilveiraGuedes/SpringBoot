package br.com.gustavo.SpringBoot.handler;

import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {

    private String message;
    private Integer status;

}
