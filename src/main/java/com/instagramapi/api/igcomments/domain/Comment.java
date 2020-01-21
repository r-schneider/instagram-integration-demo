package com.instagramapi.api.igcomments.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comment {
    
    private long id;
    private String username;
    private int likeCount;
    private String text;
    private String timestamp;
}