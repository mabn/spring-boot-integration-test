# Introduction

This sample project was created to discuss the correct spring-boot application configuration in combination with spring-security.

# Current status

A security configuration for the application and a security configuration for the integratin test.

Thanks to Kris at Stack Overflow the application works now as expected.

# Solutions

As mentioned in http://stackoverflow.com/questions/30123790/spring-tool-suite-finds-spring-boot-integration-test-configuration-and-does-not STS 3.7.0 is required to start properly from Eclipse.

# Run Application from STS

- Clone the git repository to your local machine
- import the Maven project to your STS 3.7.0+ IDE
- Package Explorer -> application -> right mouse click -> run as -> Spring Boot Application
- browse to http://localhost:8080/helloWorld

# Run Integration Test from STS

- STS Project
- right mouse click -> run as -> JUnit test


