package com.example.autoopendingdinglogsui.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LogsMapper {
    public List queryList();
    public List queryPhone();

}
