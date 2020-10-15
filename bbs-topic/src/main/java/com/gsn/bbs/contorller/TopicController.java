package com.gsn.bbs.contorller;


import com.gsn.bbs.bean.Topic;
import com.gsn.bbs.bean.User;
import com.gsn.bbs.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("findAll")
    public List<Topic> findAll(){
        return topicService.findAll();
    }

}
