package com.hq.future.service;

import com.hq.future.model.GuestComment;

import java.util.List;

public interface CommonApiService {
    List<GuestComment> getGuestComment();

    void saveGuestComment(GuestComment guestComment);
}
