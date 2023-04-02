package com.flight.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class FLightController {
    @GetMapping("/searchFlight")
    public String getFlightResult(){

        return "test";
    }


}
