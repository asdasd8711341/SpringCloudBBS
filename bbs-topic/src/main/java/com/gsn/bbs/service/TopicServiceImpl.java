package com.gsn.bbs.service;

import com.gsn.bbs.bean.Topic;
import com.gsn.bbs.dao.TopicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicMapper topicMapper;

    @Override
    public List<Topic> findAll() {
        return topicMapper.selectAll();
    }
}
