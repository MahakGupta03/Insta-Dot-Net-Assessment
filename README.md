# Insta-Dot-Net-Assessment
## Introduction
Flatmate Fight Resolver is a Spring Boot-based application designed to manage disputes among flatmates efficiently. The system allows users to authenticate, register complaints, vote on resolutions, track progress, and view leaderboards.

## Features
- User authentication with JWT
- Complaint registration and management
- Voting system for dispute resolution
- Resolution tracking
- Leaderboard based on user activity and engagement

## Technologies Used
- **Backend:** Spring Boot, Java
- **Database:** MySQL
- **Authentication:** JWT (JSON Web Token)
- **API:** RESTful API
- **Build Tool:** Maven

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/MahakGupta03/Insta-Dot-Net-Assessment
   cd Insta-Dot-Net-Assessment

2. **Install dependencies:**
      ```bash
      mvn clean install

3. Set up the database (PostgreSQL/MySQL) and configure application properties.

4. **Run the application:**
   ```bash
      mvn spring-boot:run

## Configuration
Modify the application.properties or application.yml file with your database credentials:
      ```bash

            spring.application.name=flatmateFightResolver
            server.port=8080
            spring.datasource.url=jdbc:mysql://localhost:3306/flatmates
            pring.datasource.username=<your-password>
            spring.datasource.password=<your-password>
            spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
            spring.jpa.hibernate.ddl-auto=update
            spring.jpa.show-sql=true
            spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

## API Endpoints
      Method	      Endpoint	      Description
      POST	      /auth/register      Register a new user
      POST	      /auth/login	      User login (JWT)
      POST	      /complaints	      Register a complaint
      GET	      /complaints	      List all complaints
      PUT	  /complaints/vote/{id}    Vote for a complaint resolution     
