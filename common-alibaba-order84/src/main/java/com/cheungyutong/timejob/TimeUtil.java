package com.cheungyutong.timejob;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Person;
import com.cheungyutong.service.TimeJobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author cheungyutong
 * @Date 2020/6/25 13:01
 * @deprecation springboot注解定时器@Scheduled,每五秒查询一次数据
 */
@Component
@Slf4j
public class TimeUtil {

    @Autowired
    private TimeJobService timeJobService;

    @Scheduled(fixedRate = 5000)
    public void timeTask(){
        int peopleId = 1;
        Person person = this.timeJobService.getDataByTime(peopleId);
//        log.info(dataByTime);
        log.info("【现在时间是"+ new Date()+",每间隔5秒执行查询任务】");
        log.info(""+person);
//        System.out.println(person);
    }
}
