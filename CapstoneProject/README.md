# IMS_CAPSTONEPROJECT
# Architecture Design:
The Insurance Management System will follow a Microservices architecture, where functionalities are divided into separate,
loosely coupled microservices. These microservices will communicate with each other through APIs, and Spring Microservices and 
Spring Cloud components will facilitate communication and coordination. The system will be deployed on AWS EC2 instances, and either
Spring Cloud Load Balancer or AWS Elastic Load Balancer will be used for load balancing. The high-level architecture will consist of 
the following microservices:

1. Policy Management Microservice:Responsible for managing insurance policies. It will handle policy creation,
   updates, retrieval, and listing. This microservice will communicate with the User Management Microservice
   for authentication and authorization.

2.Claims Microservice: Manages insurance claims and their processing. It will handle claim creation, updates,
  and retrieval. The Claims Microservice will communicate with the Policy Management Microservice for claim-policy associations.

3.User Management Microservice: Handles user registration, authentication, and authorization. 
  It will manage user roles and permissions and provide access tokens for secure API access.

4.Reporting and Analytics Microservice: Generates various reports and provides analytics on policies and claims.
  This microservice will offer insights into policy trends, claim patterns, etc. It will communicate with other microservices to fetch data.

5.API Gateway (Optional): Acts as the single entry point for external clients to access the microservices.
  It will handle routing and load balancing of incoming requests, implement security, throttling, and other cross-cutting concerns.
  
# Data Model for Insurance System:
The data model will consist of several entities, representing different aspects of the insurance system. Here's an outline of the data model:
1. Policy Entity:
policyId (Primary Key): Unique identifier for each policy.
policyNumber: Unique policy number assigned to the policy.
policyHolderName: Name of the policy holder.
premiumAmount: Premium amount associated with the policy.
startDate: Effective start date of the policy.
endDate (Optional): Effective end date of the policy (null for ongoing policies).

2. Claim Entity:
claimId (Primary Key): Unique identifier for each claim.
claimNumber: Unique claim number assigned to the claim.
description: Description of the claim incident.
incidentDate: Date of the incident triggering the claim.
status: Status of the claim (e.g., open, in progress, closed).
policyId (Foreign Key): Reference to the associated policy.

3. User Entity:
userId (Primary Key): Unique identifier for each user.
username: Username for logging into the system.
password: Securely hashed password for user authentication.
roles: Set of roles assigned to the user (e.g., admin, manager, agent).

4. Role Entity:
roleId (Primary Key): Unique identifier for each role.
roleName: Name of the role (e.g., admin, manager, agent).
