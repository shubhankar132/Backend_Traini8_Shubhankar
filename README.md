# traini8
The project deals with SpringBoot API requests. 

GET and POST request, Validation and Exception Handling have been covered in this project. 
# Spring Boot REST API

**Project Structure**

com.restapi.springboot - Main application package
com.restapi.springboot.entities - Contains the Trains and Address entity classes
com.restapi.springboot.exceptions - Contains the GlobalExceptionHandler class for custom exception handling
com.restapi.springboot.controllers - Contains REST controllers
com.restapi.springboot.repositories - Contains Spring Data JPA repositories


## Features

- Create and manage training centers
- Validation for input data
- Custom exception handling
- In-memory H2 database with a web console

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Jakarta Validation

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-repo/spring-boot-rest-api.git
    cd spring-boot-rest-api
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

### Configuration

The application is configured to use an in-memory H2 database. The database console can be accessed at `/h2-console`.

#### `application.properties`

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```


**API Endpoints
Create Training Center**
```sh
URL: /api/trains
Method: POST
Request Body:
{
  "centerName": "Example Training Center 2",
  "centerCode": "DEF123456784",
  "address": {
    "detailedAddress": "456 Another Street",
    "city": "Gotham",
    "state": "Another State",
    "pincode": "654321"
  },
  "studentCapacity": 150,
  "coursesOffered": [
    "Course A",
    "Course B"
  ],
  "contactEmail": "contact2@example.com",
  "contactPhone": "0987654321"
}
```
![image](https://github.com/shubhankar132/traini8/assets/94240750/34195a9e-4af1-4d47-947a-07865464104f)



URL: /api/trains
Method: POST
Request Body:
```sh
{
  "centerName": "XYZ",
  "centerCode": "1234",
  "address": {
    "detailedAddress": "456 Another Street",
    "city": "Gotham",
    "state": "Another State",
    "pincode": "654321"
  },
  "studentCapacity": 150,
  "coursesOffered": [
    "Course A",
    "Course B"
  ],
  "contactEmail": "contact2@example.com",
  "contactPhone": "0987654321"
}
![image](https://github.com/shubhankar132/traini8/assets/94240750/06e085ef-b092-4ca8-a10a-18daf827fb54)
```
**Get All Training Centers

URL: /api/trains
Method: GET**
![image](https://github.com/shubhankar132/traini8/assets/94240750/3ca4c6f3-011d-4a58-9aab-669860c478f4)


**H2 Database Console**
The H2 database console can be accessed at: http://localhost:8080/h2-console

![image](https://github.com/shubhankar132/traini8/assets/94240750/f98b0aaa-8a5e-4f9c-ac53-b3c52a3d2ea9)

Notice that the "CENTER_CODE" in both of these records are different


**Exception Handling**

The project uses a global exception handler to manage validation and database errors.

![image](https://github.com/shubhankar132/traini8/assets/94240750/fd3b91a1-ff8e-4d68-98c6-a7f5bee17838)
