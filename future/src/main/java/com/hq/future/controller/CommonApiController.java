package com.hq.future.controller;

import com.hq.future.model.GuestComment;
import com.hq.future.service.CommonApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommonApiController {
    @Autowired
    CommonApiService commonApiService;

    @PostMapping
    void saveComment(GuestComment guestComment){
        commonApiService.saveGuestComment(guestComment);
    }

    @GetMapping
    List<GuestComment> selectComment(){
        return commonApiService.getGuestComment();
    }

}
