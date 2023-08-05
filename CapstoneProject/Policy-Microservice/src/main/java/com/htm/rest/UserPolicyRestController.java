package com.htm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htm.entity.Policy;
import com.htm.service.PolicyServiceImpl;
@RestController
@RequestMapping("/user/api/policy_mght")
public class UserPolicyRestController {
     @Autowired

        private PolicyServiceImpl policyService;

        // build get user by id REST API
        // http://localhost:8083/user/api/view/policy_mght/1
        @GetMapping("/view/{policyID}")
        public ResponseEntity<Policy> getPolicyById(@PathVariable("policyID") int  policyID){
            Policy policy =policyService.getPolicyById(policyID);
            return new ResponseEntity<>(policy, HttpStatus.OK);
        }

}
