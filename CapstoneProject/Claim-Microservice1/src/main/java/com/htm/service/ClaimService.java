package com.htm.service;

import java.util.List;

import com.htm.entity.Claim;

public interface ClaimService {

	Claim createClaim(Claim Claim);

    Claim  getClaimById(Integer ClaimID);

    List<Claim> getAllClaim();

    Claim updateClaim(Claim  Claim);

    void deleteClaim(Integer ClaimId);

}
