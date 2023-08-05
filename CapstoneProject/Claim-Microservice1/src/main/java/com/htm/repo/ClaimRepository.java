package com.htm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htm.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}
