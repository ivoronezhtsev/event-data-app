package ru.voronezhtsev.eventdataapp;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "event")
@Getter
@Setter
public class Event {
    @Id
    private Long id;
    private Date date;
    private Integer latitude;
    private Integer longitude;
    private String location;
    private Integer owner;
}
