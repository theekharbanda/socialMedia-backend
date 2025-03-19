package com.example.newsmedia.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ArticleRequest {
    private String title;
    private String content;
    private UUID category; // Accept category ID instead of Category object
    private UUID user;
    private int likes;
}
