package com.sunglowsys.service;

import com.sunglowsys.domain.RatePlan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface RatePlanService {
    RatePlan save(RatePlan ratePlan);
    RatePlan update(RatePlan ratePlan);
    Page<RatePlan> findAll(Pageable pageable);
    Optional<RatePlan> findOne(Long id);
    void delete(Long id);
}
