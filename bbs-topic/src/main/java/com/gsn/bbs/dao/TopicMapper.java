package com.gsn.bbs.dao;


import com.gsn.bbs.bean.Topic;
import com.gsn.bbs.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TopicMapper extends   MisBaseMapper<Topic>{
}
