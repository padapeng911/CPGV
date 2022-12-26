package com.pancancer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Browse2Somatic {
    private String type;
    private String number1;
    private String number2;
    private String carrier1;
    private String carrier2;
    private String tmb;
    private String signatures;
    private String comparison;
    private String pathway;
}
