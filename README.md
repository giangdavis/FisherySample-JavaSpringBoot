# Fishery Management System

The **Fishery Management System** is a Java Spring Boot application designed to manage fishing permits and vessels. 
It provides RESTful APIs for interacting with entities like permits and fishing vessels, with data persisted in a PostgreSQL database.

## Features

- **Manage Permits**: Create, update, retrieve, and delete fishing permits.
- **Manage Fishing Vessels**: Create, update, retrieve, and delete fishing vessel records.
- RESTful API endpoints for each entity.
- Data validation using `@NotNull` and other annotations.
- Backend implementation using Spring Boot with Java.
- Persistence using Spring Data JPA with PostgreSQL.


## Technologies Used

- **Backend**: Java 23 with Spring Boot
- **Database**: PostgreSQL
- **Build Tool**: Maven
- **Persistence**: Spring Data JPA
  
## How to Run the Project
Clone the repository,

Set up PostgreSQL:
Create a database named fisheries.
Update src/main/resources/application.properties with your database connection details.

Build the project with Maven,
Run the Spring Boot application,

Access the APIs:

Permits API: http://localhost:8080/api/v1/permits
Fishing Vessels API: http://localhost:8080/api/v1/vessels

API Endpoints
Permit Endpoints
GET /api/v1/permits: Retrieve all permits.
GET /api/v1/permits/{id}: Retrieve a specific permit.
POST /api/v1/permits: Create a new permit.
DELETE /api/v1/permits/{id}: Remove a permit.
Fishing Vessel Endpoints
GET /api/v1/vessels: Retrieve all vessels.
GET /api/v1/vessels/{id}: Retrieve a specific vessel.
POST /api/v1/vessels: Create a new fishing vessel.
DELETE /api/v1/vessels/{id}: Remove a fishing vessel.

