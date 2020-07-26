package com.hq.future.service.impl;

import com.hq.future.dao.GuestCommentMapper;
import com.hq.future.model.GuestComment;
import com.hq.future.service.CommonApiService;
import com.hq.future.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
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
        Date d = new Date();
        int time = (int) (d.getTime() / 1000);
        guestComment.setId(UUIDUtil.getUUID());
        guestComment.setName("光子");
        guestComment.setCreateTime(time);
        guestCommentMapper.insert(guestComment);
    }
}
