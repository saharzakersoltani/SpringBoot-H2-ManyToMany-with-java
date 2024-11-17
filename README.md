# SpringBoot H2 Many-to-Many Demo

A simple Spring Boot application demonstrating a **many-to-many relationship** between two entities (`Student` and `Course`) using **JPA** with an in-memory **H2 database**. The project is built with **Java 17** and **Maven**.

---

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)

----------

## Features

- Demonstrates a **many-to-many relationship** using a join table (`student_course`).
- Uses **Spring Data JPA** for seamless database interaction.
- Embedded **H2 Database** with a web console for viewing and interacting with tables.
- **Preloaded data** using `CommandLineRunner` to showcase relationships.
- Compatible with **JDK 17** and **Spring Boot 3.x**.

---

## Technologies Used

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (in-memory)
- **Maven** for build and dependency management

---

## Getting Started

### Prerequisites

- **JDK 17** installed on your machine.
- **Maven** for managing dependencies and building the project.

---

## Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/SpringBoot-H2-ManyToMany-Demo.git

2. Navigate to the project directory:
   ```bash
   cd SpringBoot-H2-ManyToMany-Demo

3. Build the project:
   ```bash
   mvn clean install

4. Run the application:
   ```bash
   mvn spring-boot:run

5. Access the H2 database web console:

  * URL: http://localhost:8080/h2-console

  * JDBC URL: jdbc:h2:mem:testdb

  * Username: sa

  * Password: (leave blank)

-----
## Project Structure
The following is the structure of the project:
```bash
SpringBoot-H2-ManyToMany-Demo/
├── pom.xml                  # Maven configuration
├── README.md                # Project description
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.demo/
│   │   │       ├── Application.java       # Main Spring Boot application
│   │   │       ├── model/
│   │   │       │   ├── Student.java       # Student entity
│   │   │       │   ├── Course.java        # Course entity
│   │   │       │   └── StudentCourse.java # Join table representation
│   │   │       ├── repository/
│   │   │       │   ├── StudentRepository.java # Student repository
│   │   │       │   └── CourseRepository.java  # Course repository
│   │   │       └── runner/
│   │   │           └── DataLoader.java    # Preloads test data
│   │   ├── resources/
│   │       ├── application.properties     # Spring configuration
│   │       └── data.sql                   # Sample data
│   └── test/
│       └── java/                          # Test source files
├── target/                  # Compiled files (after build)
```
----
## Database Tables
- student: Stores student information (id, name, email).
- course: Stores course information (id, title, description).
- student_course: Join table for managing the many-to-many relationship between students and courses.
----
## Example Data
Upon running the application, sample data will be loaded into the database:
- Students:
  * John Doe
  * Jane Smith
- Courses:
  * Math
  * Science
- Relationships:
  * John Doe is enrolled in Math and Science.
  * Jane Smith is enrolled in Science.
-----
## Future Improvements
- Add RESTful APIs to manage Student and Course entities.
- Add unit and integration tests.
- Extend the project to use a production-grade database like MySQL or PostgreSQL.
- Add validation and error handling for data input.
