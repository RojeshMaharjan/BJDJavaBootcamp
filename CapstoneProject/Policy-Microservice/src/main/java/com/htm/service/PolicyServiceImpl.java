package com.htm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htm.entity.Policy;
import com.htm.repo.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
    private PolicyRepository policyRepo;
    @Override
    public Policy createPolicy(Policy policy) {

        return policyRepo.save(policy);
    }

    @Override
    public Policy getPolicyById(Integer policyID) {

        Optional<Policy> optionalPolicy =policyRepo.findById(policyID);
        return optionalPolicy.get();
    }

    @Override
    public List<Policy> getAllPolicy() {
        return policyRepo.findAll();
    }

    @Override
    public Policy updatePolicy(Policy policy) {
        Policy existingPolicy =policyRepo.findById(policy.getPolicyID()).get();
        existingPolicy.setPolicyNumber(policy.getPolicyNumber());
        existingPolicy.setPolicyHolderName(policy.getPolicyHolderName());
        existingPolicy.setPremiumAmount(policy.getPremiumAmount());
        existingPolicy.setStartDate(policy.getStartDate());
        existingPolicy.setEndDate(policy.getEndDate());

        Policy updatedPolicy = policyRepo.save(existingPolicy);
        return updatedPolicy;
    }


    @Override
    public void deletePolicy(Integer policyId) {

        policyRepo.deleteById(policyId);
    }


}
