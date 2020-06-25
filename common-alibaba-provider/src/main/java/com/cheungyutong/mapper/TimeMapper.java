package com.cheungyutong.mapper;

import com.cheungyutong.entity.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author cheungyutong
 * @Date 2020/6/25 13:32
 */
@Mapper
public interface TimeMapper {
    Person getDataByTime(int peopleId);
}
