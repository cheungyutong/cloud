package com.cheungyutong;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author cheungyutong
 * @Date 2020/6/25 17:49
 */
@SpringBootTest(classes = AlibabaOrder84Application.class)
@RunWith(SpringRunner.class)
@EnableScheduling
@Slf4j
public class ScheduledTimeTask {

    @Scheduled(fixedRate = 5000)
    @Test
    public void task(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd-hh:mm:ss");
        String formatDate = simpleDateFormat.format(new Date());
        log.debug("【时间是：" + formatDate + ",每隔5秒进行一次查询】");
        System.out.println("【时间是：" + formatDate + ",每隔5秒进行一次查询】");
    }

    @Test
    public void task02(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd-hh:mm:ss");
        String formatDate = simpleDateFormat.format(new Date());
        log.debug("【时间是：" + formatDate + ",每隔5秒进行一次查询】");
        System.out.println("【时间是：" + formatDate + ",每隔5秒进行一次查询】");
    }
}
