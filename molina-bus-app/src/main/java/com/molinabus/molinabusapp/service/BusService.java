package com.molinabus.molinabusapp.service;


import com.molinabus.molinabusapp.model.Bus;

import java.util.List;

public interface BusService {

    public List<Bus> findAll();
    public Bus findByName(Long id);
}
