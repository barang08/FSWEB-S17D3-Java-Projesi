package com.workintech.zoo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Kangroo {

    private long id;
    private String name;
    private double height;
    private double weight;
    private String gender;
    private boolean isAggresive;
}
