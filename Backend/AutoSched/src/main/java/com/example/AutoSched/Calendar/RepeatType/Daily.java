package com.example.AutoSched.Calendar.RepeatType;

import lombok.Data;

@Data
public class Daily implements RepeatType{
    private Type type = Type.DAILY;
}
