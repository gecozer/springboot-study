package com.hq.future.service.impl;

import com.hq.future.dao.GuestCommentMapper;
import com.hq.future.model.GuestComment;
import com.hq.future.service.CommonApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonApiServiceImpl implements CommonApiService {
    @Autowired
    GuestCommentMapper guestCommentMapper;

    @Override
    public List<GuestComment> getGuestComment() {
        return guestCommentMapper.getGuestComment();
    }

    @Override
    public void saveGuestComment(GuestComment guestComment) {
        guestCommentMapper.insert(guestComment);
    }
}
