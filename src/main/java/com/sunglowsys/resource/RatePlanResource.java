package com.sunglowsys.resource;

import com.sunglowsys.domain.RatePlan;
import com.sunglowsys.service.RatePlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RatePlanResource {
    private final Logger logger = LoggerFactory.getLogger(RatePlanResource.class);
    private final RatePlanService ratePlanService;

    public RatePlanResource(RatePlanService ratePlanService) {
        this.ratePlanService = ratePlanService;
    }
    @PostMapping("/rate-plans")
    public ResponseEntity<RatePlan> createRatePlan(@RequestBody RatePlan ratePlan) {
        logger.debug("request to create ratePlane:{}",ratePlan);
        RatePlan result = ratePlanService.save(ratePlan);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);

    }
    @PutMapping("/rate-plans")
    public ResponseEntity<RatePlan> updateRatePlan(@RequestBody RatePlan ratePlan) {
        logger.debug("request to update ratePlan:{}",ratePlan);
        RatePlan result = ratePlanService.update(ratePlan);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/rate-plans")
    public ResponseEntity<Page<RatePlan>> findAllRatePlan(Pageable pageable) {
        logger.debug(" request to findAll hotel:{}",pageable);
        Page<RatePlan> result = ratePlanService.findAll(pageable);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/rate-plans/{id}")
    public ResponseEntity<Optional> findOneRatePlan(@PathVariable Long id) {
        logger.debug("request to findOne rate plan:{}",id);
        Optional<RatePlan> result = ratePlanService.findOne(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/rate-plans/{id}")
    public ResponseEntity<Void> deleteRatePlan(@PathVariable Long id) {
        logger.debug("request to delete ratePlan:{}",id);
        ratePlanService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
