package com.hq.future.dao;

import com.hq.future.model.GuestComment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(GuestComment record);

    int insertSelective(GuestComment record);

    GuestComment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GuestComment record);

    int updateByPrimaryKey(GuestComment record);

    List<GuestComment> getGuestComment();
}