package com.htm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htm.entity.Claim;
import com.htm.repo.ClaimRepository;

@Service
public class ClaimServiceImpl implements ClaimService {

	@Autowired
    private ClaimRepository claimRepo;
    @Override
    public Claim createClaim(Claim Claim) {

        return claimRepo.save(Claim);
    }

    @Override
    public Claim getClaimById(Integer ClaimID) {

        Optional<Claim> optionalClaim =claimRepo.findById(ClaimID);
        return optionalClaim.get();
    }

    @Override
    public List<Claim> getAllClaim() {
        return claimRepo.findAll();
    }

    @Override
    public Claim updateClaim(Claim claim) {
        Claim existingClaim =claimRepo.findById(claim.getClaimId()).get();
        existingClaim.setDescription(claim.getDescription());
        existingClaim.setStatus(claim.getStatus());
        existingClaim.setPolicyId(claim.getPolicyId());
        existingClaim.setClaimId(claim.getClaimId());
        existingClaim.setClaimNumber(claim.getClaimNumber());

        Claim updatedClaim = claimRepo.save(existingClaim);
        return updatedClaim;
    }


    @Override
    public void deleteClaim(Integer claimId) {

        claimRepo.deleteById(claimId);
    }


}
