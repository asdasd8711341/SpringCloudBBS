package com.gsn.bbs.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "tb_topic")
public class Topic {
    @Id
    Integer topicid;
    String  title;
    String  content;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date publishtime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    Date modifytime;
    Integer uid;
    Integer boardid;
}
