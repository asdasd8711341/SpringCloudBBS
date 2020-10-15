package com.gsn.bbs.bean;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "tb_board")
public class Board {
    @Id
    Integer boardid;
    String boardname;
    Integer parentid;
}
