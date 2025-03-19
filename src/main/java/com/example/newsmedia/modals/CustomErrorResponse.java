package com.example.newsmedia.modals;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomErrorResponse {
    private String message;
    private Integer internalStatusCode;
}
