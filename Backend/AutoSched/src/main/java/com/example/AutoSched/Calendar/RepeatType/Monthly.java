package com.example.AutoSched.Calendar.RepeatType;

import lombok.Data;

@Data
public class Monthly implements RepeatType{
    private Type type = Type.MONTHLY;
}
