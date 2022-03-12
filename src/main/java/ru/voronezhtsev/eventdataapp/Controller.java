package ru.voronezhtsev.eventdataapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private EventRepository eventRepository;

    @PostMapping("insert")
    public void insert(@RequestBody Event event) {
        eventRepository.save(event);
    }

    @GetMapping("select-all")
    public List<Event> selectAll() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return events;
    }
}
