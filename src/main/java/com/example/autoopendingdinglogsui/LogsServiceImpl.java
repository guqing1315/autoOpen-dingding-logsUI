package com.example.autoopendingdinglogsui;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LogsServiceImpl implements LogsService {
    @Autowired
    LogsMapper logsMapper;
    @Override
    public List queryList() {
        return  logsMapper.queryList();
    }
}
