package com.gsn.bbs.service;

import com.gsn.bbs.bean.Reply;
import com.gsn.bbs.dao.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public List<Reply> findAll() {
        return replyMapper.selectAll();
    }
}
