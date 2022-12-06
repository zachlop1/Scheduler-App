package com.example.AutoSched.Calendar;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    private long start;
    private long end;
    private Repeat repeat;
    private long trueEnd;

    public Event(long start, long end) {
        this.start = start;
        this.end = end;
        this.trueEnd = end;
    }

    public Event(long start, long end, Repeat repeat) {
        this.start = start;
        this.end = end;
        this.repeat = repeat;
        this.trueEnd = repeat.getEnd();
    }

    public boolean repeats() {
        return repeat != null;
    }


    public boolean equals(Event event) {
        return event.getId() == this.id;
    }


}
