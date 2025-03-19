package com.example.newsmedia.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CommentRequest {
    private String message;
    private UUID user;
}
