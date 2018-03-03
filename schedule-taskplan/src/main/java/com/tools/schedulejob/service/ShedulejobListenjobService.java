package com.tools.schedulejob.service;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.stereotype.Service;

//保留任务执行后的数据，例如操作JobDataMap
@PersistJobDataAfterExecution 
//不允许并非执行任务
@DisallowConcurrentExecution
@Service
public class ShedulejobListenjobService implements Job{

//实现Job接口的方法
public void execute(JobExecutionContext content) throws JobExecutionException {

  /*任务执行内容在这里编写*/
  System.out.println("这个是我的任务.");

  }
}