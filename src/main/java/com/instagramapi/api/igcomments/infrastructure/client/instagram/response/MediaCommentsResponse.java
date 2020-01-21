package com.instagramapi.api.igcomments.infrastructure.client.instagram.response;

import java.util.List;

import com.instagramapi.api.igcomments.domain.Comment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class MediaCommentsResponse {

    List<Comment> data;
}