package com.ramn.bms;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramn.entity.LiftMvmnt;
import com.ramn.repository.LiftMvmntRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class LiftMvmntInitializer {

    @Autowired
    private LiftMvmntRepository liftMvmntRepository;

    @PostConstruct
    public void init() {
        // Create and insert LiftMvmnt entities
    	// String liftNumber, String momentNumber, int fromFloor, int toFloor

        LiftMvmnt entity1 = new LiftMvmnt(1l, 1, "1F", "3F");
        LiftMvmnt entity2 = new LiftMvmnt(2l, 1, "GF","6F");
        LiftMvmnt entity3 = new LiftMvmnt(1l, 2, "3F", "GF");
        LiftMvmnt entity4 = new LiftMvmnt(5l, 1, "GF", "5F");

        List<LiftMvmnt> entities = new ArrayList<>();
        entities.add(entity1);
        entities.add(entity2);
        entities.add(entity3);
        entities.add(entity4);

        liftMvmntRepository.saveAll(entities);

        System.out.println("LiftMvmnt table initialized with data.");
    }

    // Other methods and properties
    // ...
}
