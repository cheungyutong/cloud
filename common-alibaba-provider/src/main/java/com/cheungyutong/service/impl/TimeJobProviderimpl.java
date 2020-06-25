package com.cheungyutong.service.impl;

import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Person;
import com.cheungyutong.mapper.TimeMapper;
import com.cheungyutong.service.TimeJobProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author cheungyutong
 * @Date 2020/6/25 13:31
 */
@Service
public class TimeJobProviderimpl implements TimeJobProviderService {

    @Resource
    private TimeMapper timeMapper;

    @Override
    public Person getDataByTime(int peopleId) {
        return timeMapper.getDataByTime(peopleId);
    }

    @Scheduled(fixedRate = 5000)
    public void timeTask(){
        int peopleId = 1;
        Person person = this.timeMapper.getDataByTime(peopleId);
//        log.info(dataByTime);
        System.out.println(person);
    }
}
