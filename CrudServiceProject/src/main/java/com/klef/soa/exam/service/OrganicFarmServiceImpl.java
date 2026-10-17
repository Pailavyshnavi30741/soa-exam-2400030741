package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.OrganicFarmEntity;
import com.klef.soa.exam.repository.OrganicFarmRepository;

@Service
public class OrganicFarmServiceImpl implements OrganicFarmService {

    @Autowired
    private OrganicFarmRepository repo;

    @Override
    public OrganicFarmEntity addOrganicFarm(OrganicFarmEntity o) {
        return repo.save(o);
    }

    @Override
    public List<OrganicFarmEntity> displayall() {
        return repo.findAll();
    }

    @Override
    public String delete(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Organic Farm deleted Successfully";
        } else {
            return "Organic Farm ID not found";
        }
    }
}