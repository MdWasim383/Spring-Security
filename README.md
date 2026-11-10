Spring Security Application
A simple Spring Boot project for managing employee records with REST
APIs and Spring Security.
Features
- Create and manage employee records
- REST API-based backend
- DTOs and mapper for handling employee data
- Centralized exception handling
- Spring Security configuration
Tech Stack
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Maven
Run the Project
1. Clone or download this repository.
2. Configure your database settings in
   src/main/resources/application.properties.
3. Run the application from your IDE, or use:
   ./mvnw spring-boot:run
   On Windows:
   mvnw.cmd spring-boot:run
Project Structure
src/main/java/com/wasim/springsecurity/
├── config
├── controller
├── dto
├── entity
├── exception
├── filter
├── logout
├── mapper
├── repository
└── service
Author
Md Wasim
