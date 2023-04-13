package com.ramn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramn.entity.Lift;
import com.ramn.entity.LiftMvmnt;
import com.ramn.service.LiftsService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LiftController {

    @Autowired
    private LiftsService liftsService;

    // Get lift position by liftId
    @GetMapping("/liftPosition/{liftId}")
    public String getLiftPosition(@PathVariable Long liftId) {
        return liftsService.getLiftPosition(liftId);
    }

    // Get lift status by liftId
    @GetMapping("/liftStatus/{liftId}")
    public String getLiftStatus(@PathVariable Long liftId) {
        return liftsService.getLiftStatus(liftId);
    }

    // Get all lifts
    @GetMapping("/allLifts")
    public List<Lift> getAllLifts() {
        return liftsService.getAllLifts();
    }

    @GetMapping("/lifthistory/{liftId}")
    public List<LiftMvmnt> getLiftHistoryByTime(@PathVariable Long liftId) {
        return liftsService.getLiftHistory(liftId);
    }
    
    @GetMapping("/lifthistory/{liftId}/{fromTime}/{toTime}")
    public List<Lift> getLiftsByTimeRange(@PathVariable int liftId,
                                          @PathVariable LocalTime fromTime,
                                          @PathVariable LocalTime toTime) {
        return liftService.getLiftHistory(liftId, fromTime, toTime);
    }

    // Get lift history by liftId
    @GetMapping("/lifthistory/{liftId}")
    public List<LiftMvmnt> getLiftHistory(@PathVariable Long liftId) {
        return liftsService.getLiftHistory(liftId);
    }
}
