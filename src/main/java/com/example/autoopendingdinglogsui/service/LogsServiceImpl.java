package com.example.autoopendingdinglogsui.service;

import com.example.autoopendingdinglogsui.mapper.LogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogsServiceImpl implements LogsService {
    @Autowired
    LogsMapper logsMapper;
    @Override
    public List queryList() {
        return  logsMapper.queryList();
    }
    @Override
    public List queryPhone() {
        return  logsMapper.queryPhone();
    }
}
