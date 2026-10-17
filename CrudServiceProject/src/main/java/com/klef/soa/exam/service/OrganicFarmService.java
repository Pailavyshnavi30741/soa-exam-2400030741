package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.OrganicFarmEntity;

public interface OrganicFarmService {

    OrganicFarmEntity addOrganicFarm(OrganicFarmEntity o);

    List<OrganicFarmEntity> displayall();

    String delete(Long id);
}