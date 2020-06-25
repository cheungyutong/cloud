package com.cheungyutong.controller;

import com.cheungyutong.entity.Person;
import com.cheungyutong.service.TimeJobProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author cheungyutong
 * @Date 2020/6/25 14:34
 */
@RestController
public class TimeJobController {

    @Resource
    private TimeJobProviderService timeJobProviderService;

    @GetMapping("/getDataByTime/{peopleId}")
    Person getDataByTime(@PathVariable(value = "peopleId") int peopleId){
       return timeJobProviderService.getDataByTime(peopleId);
    }
}
