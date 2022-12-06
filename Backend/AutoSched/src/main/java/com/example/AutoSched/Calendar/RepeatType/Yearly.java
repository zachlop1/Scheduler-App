package com.example.AutoSched.Calendar.RepeatType;

import lombok.Data;

@Data
public class Yearly implements RepeatType{
    private Type type = Type.YEARLY;
}
