package com.pancancer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Browse2Germline {
    private String type;
    private String number1;
    private String number2;
    private String pathogenicity;
    private String distribution;
    private String ratio;
    private String comparison1;
    private String comparison2;
}
