package com.molinabus.molinabusapp.service.implement;

import com.molinabus.molinabusapp.model.Bus;
import com.molinabus.molinabusapp.repository.BusRepository;
import com.molinabus.molinabusapp.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    BusRepository busRepository;

    @Override
    public List<Bus> findAll() {
        return busRepository.findAll();
    }

    @Override
    public Bus findByName(Long id) {
        return busRepository.findById(id).orElse(null);
    }
}
