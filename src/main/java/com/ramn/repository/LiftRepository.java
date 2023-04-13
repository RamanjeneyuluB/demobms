package com.ramn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramn.entity.Lift;

@Repository
public interface LiftRepository extends JpaRepository<Lift, Long> {
}
