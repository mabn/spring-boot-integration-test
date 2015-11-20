# Introduction

This sample project was created to discuss the correct spring-boot application configuration in combination with spring-security.

# Current status

Application can be run from STS when imported as Maven project, both as Java Application and Spring Boot App.
It fails when imported as gradle project because Spring Boot tries to load configuration from test classpath.

# Solutions

There is a workaround - to rename de.flexguse.demo package to de.flexguse.demo_test in src/test/java. This prevents classpath scanning from finding test configurations. 

# Run Application from STS

- Clone the git repository to your local machine
- import the Maven/Gradle project to your STS 3.7.0+ IDE 
- Package Explorer -> application -> right mouse click -> run as -> Spring Boot App
- browse to http://localhost:8080/helloWorld

# Run Integration Test from STS

- STS Project
- right mouse click -> run as -> JUnit test


