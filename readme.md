## Employee Department Organization Microservices using Spring Boot with Spring Cloud Functionality

## About the project

## API Resource

```
https://github.com/MohosinMiah/Employee_Department_Organization_Microservices/blob/main/necessary_resource/Microservices%20(Employee_Department).postman_collection.json
```
This project consists of three microservices: Employee, Department, and Organization. It showcases the implementation of various Spring Cloud features like API Gateway, Config Server, Service Registry, Zipkin for distributed tracing, and Circuit Breaker using Resilience4J.

## Microservices

### 1. Employee Microservice

This microservice is responsible for managing employee-related data, including CRUD operations for employees.

### 2. Department Microservice

The Department microservice handles department-related operations, such as managing departments and their details.

### 3. Organization Microservice

The Organization microservice focuses on organizational aspects, such as organization details and related functionalities.

## Spring Cloud Features Implemented

### 1. API Gateway

The API Gateway acts as a single entry point for all incoming requests from external clients. It routes requests to appropriate microservices, providing a unified API for the client-side application.

### 2. Config Server

The Config Server centralizes the configuration management for all microservices. It ensures that each microservice fetches its configuration from a common repository, making it easier to manage and update configurations.

### 3. Service Registry

The Service Registry enables microservices to register themselves automatically. It allows other microservices to discover and communicate with them without hardcoding service port .

### 4. Zipkin for Distributed Tracing

Zipkin is used for distributed tracing, providing insights into the communication flow and performance metrics among microservices.

### 5. Circuit Breaker using Resilience4J

Resilience4J provides circuit breaking functionality to handle and prevent cascading failures. It helps in maintaining system stability by isolating failing services.

## Tech Stack

- Spring Boot
- Spring Cloud (API Gateway, Config Server, Service Registry, Zipkin)
- Resilience4J for Circuit Breaking
- MySQL (or any other database of your choice)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/your-username/spring-microservices.git
```

2. Configure the database connection and other properties in each microservice's `application.properties`

3. Build the microservices:

```bash
mvn clean install
```


5. Run other Spring Cloud components like Config Server, Service Registry, and Zipkin.

## Usage

1. Access the API Gateway to interact with the microservices:

   ```
   http://localhost:api-gateway-port/
   ```

2. Use Postman or any API client to perform operations on Employees, Departments, and Organizations.

3. Monitor distributed tracing using Zipkin:

   ```
   http://localhost:zipkin-port/
   ```


## User RabitMQ using Docker

1) docker pull rabbitmq


2) docker run --rm -it -p 5672:5672 rabbitmq