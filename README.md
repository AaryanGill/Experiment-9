# JWT-DEMO

A Spring Boot application demonstrating JWT (JSON Web Token) authentication and authorization with user registration, login, and retrieval of user details.

## Overview

This project is a hands-on demo of JWT-based authentication in Spring Boot. It showcases:

- User registration and login
- JWT token generation and validation
- Secure password handling using bcrypt
- Role-based access control
- RESTful API endpoints secured by Spring Security

---

## Technology Stack

- **Framework:** Spring Boot 4.0.5  
- **Language:** Java 25  
- **Authentication:** JWT (JJWT library v0.11.5)  
- **Build Tool:** Maven  
- **Database:** H2 (embedded) / MySQL (optional)  

---

## Project Structure

```
src/
├── main/java/com/AML2B/JWT_DEMO/
│ ├── JwtDemoApplication.java # Main Spring Boot application
│ ├── Config/
│ │ └── SecurityConfig.java # Security configuration with JWT filter
│ ├── Controller/
│ │ └── AuthController.java # REST endpoints for auth & user retrieval
│ ├── Model/
│ │ └── User.java # User entity
│ ├── Repository/
│ │ └── UserRepository.java # Repository interface for database access
│ ├── Security/
│ │ └── JwtUtil.java # JWT token creation and validation
│ ├── Service/
│ │ └── AuthService.java # Business logic for authentication
│ └── resources/
│ └── application.properties # Application configuration
└── test/
```


---

## Features

- ✅ User registration and login  
- ✅ JWT token generation and validation  
- ✅ Secure password encryption with bcrypt  
- ✅ Protected API endpoints  
- ✅ Fetch all registered users  
- ✅ Stateless authentication with Spring Security  

---

## Getting Started

### Prerequisites

- Java 25 or higher  
- Maven 3.6+  
- Optional: MySQL database if using persistent storage  

### Installation & Running

1. **Clone the repository:**

```bash
git clone <repository-url>
cd JWT-DEMO

2. **Build the project:**
mvn clean install

3. **Run the application:**
mvn spring-boot:run

The application will start on http://localhost:8083.

**API Endpoints**
**Authentication**
**Method	Endpoint	Description**
---
-- **POST**	/api/register	Register a new user with username & password
-- **POST**	/api/login	Login and receive JWT token
-- **GET**	/api/hello	Protected endpoint (requires JWT in header)
-- **GET**	/api/users	Fetch all registered users (requires JWT)

## **Request Example for Registration:**

POST http://localhost:8083/api/register?username=aaryan&password=1234

## **Request Example for Getting Users:**

GET http://localhost:8083/api/users
Authorization: Bearer <JWT_TOKEN>

## **Configuration**

Update application.properties for your environment:

-- server.port=8083
-- spring.datasource.url=jdbc:mysql://localhost:3306/jwt_demo
-- spring.datasource.username=root
-- spring.datasource.password=root
-- jwt.secret=your-secret-key
-- jwt.expiration=3600000
-- Security
Passwords are encrypted with bcrypt
-- JWT tokens are signed using a secret key
-- Protected endpoints require a valid JWT token in the Authorization header
-- Stateless authentication (SessionCreationPolicy.STATELESS)

### Screenshots

#### 1️⃣ Register API (POST)

_The register endpoint executed successfully from Postman._  

<img width="942" height="613" alt="image" src="https://github.com/user-attachments/assets/046cf123-f008-47ac-b674-3166e49f022d" />


---

#### 2️⃣ Login API (POST)

_Login successful and JWT token received._  

<img width="946" height="657" alt="image" src="https://github.com/user-attachments/assets/edbf0b28-08c8-4875-9190-394295512b72" />


---

#### 3️⃣ Get Users API (GET)

_Fetch all registered users using JWT token for authorization._  

<img width="944" height="659" alt="image" src="https://github.com/user-attachments/assets/07623c0a-7b5d-4388-9fa8-ca0cc8497fc8" />


---

#### 4️⃣ Hello API (GET)

_Access a protected endpoint to verify JWT authentication. Requires Authorization header with token._  

<img width="944" height="620" alt="image" src="https://github.com/user-attachments/assets/144a0349-d473-45d2-8d9d-3d9ca242e534" />


---

#### 5️⃣ Application Running in Eclipse IDE

_Spring Boot application started successfully on port 8083._  

<img width="1018" height="551" alt="image" src="https://github.com/user-attachments/assets/43c9b3d5-0395-4a20-99b5-bce0ece593b3" />
<img width="1021" height="420" alt="image" src="https://github.com/user-attachments/assets/1ca6d592-fcfb-4796-b4c4-74c5b3e8e575" />



## 👨‍💻 Author

**Aaryan Gill** – 23BAI70473  

- **Email:** [23BAI70473@cuchd.in](mailto:23BAI70473@cuchd.in)  
- **GitHub:** [https://github.com/aaryangill](https://github.com/aaryangill)  
