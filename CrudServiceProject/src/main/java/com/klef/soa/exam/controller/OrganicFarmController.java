package com.klef.soa.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.service.OrganicFarmService;
import com.klef.soa.exam.entity.OrganicFarmEntity;

import java.util.List;

@RestController
@RequestMapping("/organicfarm")
public class OrganicFarmController {

    @Autowired
    private OrganicFarmService service;

    @GetMapping("/")
    public String Home() {
        return "Organic Farm is Running";
    }

    @PostMapping("/Add")
    public OrganicFarmEntity addOrganicFarm(
            @RequestBody OrganicFarmEntity o) {
        return service.addOrganicFarm(o);
    }

    @GetMapping("/DisplayAll")
    public List<OrganicFarmEntity> getAllOrganicFarms() {
        return service.displayall();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteOrganicFarm(@PathVariable Long id) {
        return service.delete(id);
    }
}