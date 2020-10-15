package com.gsn.bbs.bean;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data      //  lombok 注解，节省getter, setter
@Table(name="tb_user")   // JPA注解,将java类关联表
public class User {
    @Id
    private  Integer uid;
    private  String uname;
    private  String upass;
    private  String head;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date regtime;
    private  Integer gender;

}
