package com.cheungyutong.service;

import com.cheungyutong.entity.CommonResult;
import com.cheungyutong.entity.Person;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cheungyutong
 * @Date 2020/6/25 13:27
 */
@Component
public interface TimeJobProviderService {

    Person getDataByTime(int peopleId);

}
