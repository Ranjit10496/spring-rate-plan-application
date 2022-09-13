package com.sunglowsys.service;

import com.sunglowsys.domain.RatePlan;
import com.sunglowsys.repository.RatePlanRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@Transactional

public class RatePlanServiceImpl implements RatePlanService{
    private final Logger logger = LoggerFactory.getLogger(RatePlanServiceImpl.class);
    private final RatePlanRepository ratePlanRepository;

    public RatePlanServiceImpl(RatePlanRepository ratePlanRepository) {
        this.ratePlanRepository = ratePlanRepository;
    }

    @Override
    public RatePlan save(RatePlan ratePlan) {
        logger.debug("request to save ratePlan:{}",ratePlan);
        return ratePlanRepository.save(ratePlan);
    }

    @Override
    public RatePlan update(RatePlan ratePlan) {
        logger.debug("request to update ratePlan:{}",ratePlan);
        return ratePlanRepository.save(ratePlan);
    }

    @Override
    public Page<RatePlan> findAll(Pageable pageable) {
        logger.debug("request to findAll ratePlan:{}",pageable);
        return ratePlanRepository.findAll(pageable);
    }

    @Override
    public Optional<RatePlan> findOne(Long id) {
        logger.debug("request to findOne ratePlan:{}",id);
        return ratePlanRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        logger.debug("request to delete ratePlan:{}",id);
        ratePlanRepository.deleteById(id);

    }
}
