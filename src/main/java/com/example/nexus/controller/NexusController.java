package com.example.nexus.controller;

//Generate a REST controller class NexusController in package com.example.nexus.controller
// with base URL /api/nexus. Use appropriate Spring annotations.
//create getmaping method for /status that returns "Nexus is running" message.

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nexus")
public class NexusController {

    @GetMapping("/status")
    public String getStatus() {
        return "!! Jenkins is running !!";
    }
}
