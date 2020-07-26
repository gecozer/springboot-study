package com.hq.future.controller;

import com.hq.future.model.GuestComment;
import com.hq.future.service.CommonApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommonApiController {
    @Autowired
    CommonApiService commonApiService;

    @PostMapping("/save")
    void saveComment(HttpServletRequest request,@RequestBody GuestComment guestComment){
        commonApiService.saveGuestComment(guestComment);
    }

    @GetMapping("/get")
    List<GuestComment> getGuestComment(){
        List<GuestComment> list = commonApiService.getGuestComment();
        return list;
    }

}
