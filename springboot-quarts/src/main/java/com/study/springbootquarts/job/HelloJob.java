package com.study.springbootquarts.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

@Slf4j
public class HelloJob implements BaseJob {

    public HelloJob() {

    }

    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        log.error("Hello Job执行时间: " + new Date());

    }
}  
