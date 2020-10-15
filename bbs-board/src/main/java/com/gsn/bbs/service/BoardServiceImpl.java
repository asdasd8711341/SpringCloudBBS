package com.gsn.bbs.service;

import com.gsn.bbs.bean.Board;
import com.gsn.bbs.dao.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    public BoardMapper boardMapper;

    @Override
    public List<Board> findAll() {
        return boardMapper.selectAll();
    }
}
