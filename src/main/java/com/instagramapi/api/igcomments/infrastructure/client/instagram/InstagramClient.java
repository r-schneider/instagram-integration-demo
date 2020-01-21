package com.instagramapi.api.igcomments.infrastructure.client.instagram;

import com.instagramapi.api.igcomments.infrastructure.client.instagram.response.CommentsResponse;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "instagramapi", url = "${app.clients.instagram-api.url}", 
                configuration = InstagramConfig.class)
public interface InstagramClient {

    @GetMapping(value = "{mediaId}/comments", consumes = MediaType.APPLICATION_JSON_VALUE)
    CommentsResponse getAllComments(@PathVariable String mediaId);
}