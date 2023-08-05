package com.htm.rest;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htm.entity.Claim;
import com.htm.service.ClaimServiceImpl;

@RestController
@RequestMapping("/admin/api/claim_mght")
public class AdminClaimRestController {
    @Autowired

    private ClaimServiceImpl claimService;
     // build get user by id REST API
    // http://localhost:8083/Admin/api/Claim_mght/1
    @GetMapping("/{claimID}")
    public ResponseEntity<Claim> getClaimById(@PathVariable("claimID") int  claimID){
        Claim Claim =claimService.getClaimById(claimID);
        return new ResponseEntity<>(Claim, HttpStatus.OK);
    }

    // Build Get All Users REST API
    // http://localhost:8083/Admin/api/Claim_mght/getAll
    @GetMapping("/getAll")
    public ResponseEntity<List<Claim>> getAllClaim() {
        List<Claim> claim = claimService.getAllClaim();
        return new ResponseEntity<>(claim, HttpStatus.OK);

    }
    // Build Update User REST API
    @PutMapping("/update/{claimId}")
    // http://localhost:8083/Admin/api/Claim_mght/update/2
    public ResponseEntity<Claim> updateClaim(@PathVariable("claimId") int claimId,
                                           @RequestBody Claim claim){
        claim.setClaimId(claimId);
        Claim updateClaim =claimService.updateClaim(claim);
        return new ResponseEntity<>(updateClaim, HttpStatus.OK);
    }

    // Build Delete User REST API
    // http://localhost:8083/Admin/api/Claim_mght/Delete/2
    @DeleteMapping("/Delete/{claimId}")
    public ResponseEntity<String> deleteClaim(@PathVariable("claimId") int claimId){
        claimService.deleteClaim(claimId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
}
