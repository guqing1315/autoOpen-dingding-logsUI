package com.example.autoopendingdinglogsui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("logs")
public class LogsController {

    @Resource
    private LogsService logsService;

    @GetMapping("queryList")
    public List queryList(){
        return  logsService.queryList();
    }
}
