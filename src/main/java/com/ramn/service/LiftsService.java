package com.ramn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramn.entity.Lift;
import com.ramn.entity.LiftMvmnt;
import com.ramn.repository.LiftRepository;

@Service
public class LiftsService {
    
    @Autowired
    private LiftRepository liftRepository;
    
    @Autowired
    private LiftMvmntRepository liftMvmntRepository;
    
    public List<Lift> getAllLifts() {
        return liftRepository.findAll();
    }

	public List<LiftMvmnt> getLiftHistory(Long liftId) {
		// TODO Auto-generated method stub
		return liftMvmntRepository.findById(liftId);
	}

	public List<LiftMvmnt> getLiftHistory(int liftId, LocalTime fromTime, LocalTime toTime) {
	    return liftMvmntRepository.findByLiftIdAndTimeBetween(liftId, fromTime, toTime);
	}
	  
	public String getLiftStatus(Long liftId) {
		// TODO Auto-generated method stub
		return liftRepository.findById(liftId).isGood();
	}

	public String getLiftPosition(Long liftId) {
		// TODO Auto-generated method stub
		return liftRepository.findById(liftId).getLiftNowAt();
	}
}

