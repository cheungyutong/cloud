package com.cheungyutong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author cheungyutong
 * @Date 2020/6/25 13:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int peopleId;
    private String peopleName;
    private int peopleAge;
    private String peopleGender;
    private String peopleAddr;
}
