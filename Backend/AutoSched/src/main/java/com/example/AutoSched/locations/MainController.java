package com.example.AutoSched.locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/locations")

public class MainController {
    @Autowired
    private com.example.AutoSched.locations.LocationRepository locationRepository;

    @GetMapping(path = "/getAllLocations")
    public @ResponseBody Iterable<com.example.AutoSched.locations.Locations> getAllLocations() {return locationRepository.findAll();}

    @GetMapping(path = "/getLocation/{id}")
    @ResponseBody
    com.example.AutoSched.locations.Locations getLocationFromID(@PathVariable int id) {
        return locationRepository.findById(id);
    }
}
