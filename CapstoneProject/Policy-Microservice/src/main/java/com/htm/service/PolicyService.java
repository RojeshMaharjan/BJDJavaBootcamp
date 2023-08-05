package com.htm.service;

import java.util.List;

import com.htm.entity.Policy;

public interface PolicyService {

	Policy createPolicy(Policy policy);

    Policy  getPolicyById(Integer policyID);

    List<Policy> getAllPolicy();

    Policy updatePolicy(Policy  policy);

    void deletePolicy(Integer policyId);
}
