package com.molinabus.molinabusapp.controller;

import com.molinabus.molinabusapp.model.Bus;
import com.molinabus.molinabusapp.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    BusService busService;

    @GetMapping("/allBuses")
    public ResponseEntity<List<Bus>> getAllBuses(){
        List<Bus> buses = busService.findAll();
        return new ResponseEntity<>(buses, HttpStatus.OK);
    }
}
