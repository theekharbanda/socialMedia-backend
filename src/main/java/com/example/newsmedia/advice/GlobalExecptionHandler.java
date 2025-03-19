package com.example.newsmedia.advice;

import com.example.newsmedia.exceptions.ResourceNotFoundException;
import com.example.newsmedia.modals.CustomErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@ControllerAdvice
public class GlobalExecptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public CustomErrorResponse handleResourceNotFoundException(ResourceNotFoundException e) {
        return CustomErrorResponse.builder()
                .message(e.getMessage())
                .internalStatusCode(404)
                .build();
    }

}
