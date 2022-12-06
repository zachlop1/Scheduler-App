package com.example.AutoSched.Calendar.RepeatType;

import lombok.Data;

@Data
public class Weekly implements RepeatType{

    private Type type = Type.WEEKLY;
}
