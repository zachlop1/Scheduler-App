package com.example.AutoSched.Calendar.RepeatType;

import lombok.Data;

@Data
public class Custom implements RepeatType{
    private Type type = Type.CUSTOM;

    private Type repeat = null;
}
