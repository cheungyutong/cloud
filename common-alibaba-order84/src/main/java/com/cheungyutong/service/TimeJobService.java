package com.cheungyutong.service;

import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author cheungyutong
 * @Date 2020/6/25 13:10
 */
@Component
@FeignClient(name = "nacos-payment-provider")
public interface TimeJobService {

    @GetMapping("/getDataByTime/{peopleId}")
    Person getDataByTime(@PathVariable(value = "peopleId") int peopleId);
}
