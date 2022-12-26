package com.pancancer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Browsetmb {
    private String type;
    private String number;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type =type;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number =number;
    }

}
