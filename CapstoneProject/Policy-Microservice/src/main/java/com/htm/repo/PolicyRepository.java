package com.htm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htm.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

}
