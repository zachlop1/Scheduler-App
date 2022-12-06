package com.example.AutoSched.Calendar;

import com.example.AutoSched.Calendar.RepeatType.RepeatType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Repeat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    private long start;
    private long end;
    private RepeatType repeatType;
}
