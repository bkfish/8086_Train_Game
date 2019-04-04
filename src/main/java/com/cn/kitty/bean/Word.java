package com.cn.kitty.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Word implements Serializable {
    private Integer Id;
    private String name;
    private String times;
    private String frequency;

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getTimes() {
        return times;
    }
}
