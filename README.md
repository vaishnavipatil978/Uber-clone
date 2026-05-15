# Uber Backend Application

A Spring Boot based backend application that simulates the core functionality of an Uber-like ride booking platform.

The application supports:
- User Authentication using JWT
- Rider and Driver flows
- Ride booking lifecycle
- OTP based ride verification
- Wallet and payment management
- Driver/Rider rating system
- Role-based authorization
- Ride history tracking

---

# Tech Stack

- Java 17
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- PostgreSQL + PostGIS
- Docker
- Maven
- Mockito + JUnit
- H2 Database (for testing)

---

# Features

## Authentication
- User Signup
- User Login
- JWT Access Token
- Refresh Token

## Rider Features
- Request Ride
- Cancel Ride
- Rate Driver
- View Ride History
- View Current Ride

## Driver Features
- Accept Ride
- Start Ride using OTP
- End Ride
- Cancel Ride
- Rate Rider
- View Ride History
- View Current Ride

## Wallet & Payments
- Wallet creation during signup
- Add/Deduct balance
- Wallet transaction history
- Ride payment processing

## Ride Flow
1. Rider requests ride
2. Driver accepts ride
3. OTP generated
4. Driver starts ride
5. Ride ends
6. Payment processed
7. Ratings submitted

---

# Project Structure

```text
src/main/java/com/vaishnavi/uberapp
│
├── controllers
├── services
├── services/impl
├── repositories
├── entities
├── dto
├── strategies
├── security
├── exceptions
└── configs
```

---

# Database Setup

## PostgreSQL + PostGIS using Docker

Run PostgreSQL container:

```bash
docker run --name uber-postgres \
-e POSTGRES_DB=uberdb \
-e POSTGRES_USER=uberuser \
-e POSTGRES_PASSWORD=uberpass \
-p 5455:5432 \
-d postgis/postgis
```

---

# Enable PostGIS Extension

Enter container:

```bash
docker exec -it uber-postgres psql -U uberuser -d uberdb
```

Run:

```sql
CREATE EXTENSION postgis;
```

Verify:

```sql
SELECT PostGIS_Version();
```

---

# Application Configuration

## application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5455/uberdb
spring.datasource.username=uberuser
spring.datasource.password=uberpass

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# Running the Application

## Using Maven

```bash
mvn spring-boot:run
```

---

## Using IntelliJ

Run the main Spring Boot application class.

Example:

```text
UberAppApplication.java
```

---

# API Endpoints

# Authentication APIs

| Method | Endpoint | Description |
|---|---|---|
| POST | /auth/signup | Register user |
| POST | /auth/login | Login user |
| POST | /auth/refresh | Refresh JWT token |
| POST | /auth/onBoardNewDriver/{userId} | Convert rider to driver |

---

# Rider APIs

| Method | Endpoint |
|---|---|
| POST | /riders/requestRide |
| POST | /riders/cancelRide/{rideId} |
| POST | /riders/rateDriver |
| GET | /riders/getMyProfile |
| GET | /riders/getMyRides |
| GET | /riders/currentRide |

---

# Driver APIs

| Method | Endpoint |
|---|---|
| GET | /drivers/availableRideRequests |
| POST | /drivers/acceptRide/{rideRequestId} |
| POST | /drivers/startRide/{rideId} |
| POST | /drivers/endRide/{rideId} |
| POST | /drivers/cancelRide/{rideId} |
| POST | /drivers/rateRider |
| GET | /drivers/getMyProfile |
| GET | /drivers/getMyRides |
| GET | /drivers/currentRide |

---

# Wallet APIs

| Method | Endpoint |
|---|---|
| GET | /wallet/myWallet |

---

# Authentication Flow

## Signup

```http
POST /auth/signup
```

Request:

```json
{
  "name": "Vaishnavi",
  "email": "vaishnavi@test.com",
  "password": "password123"
}
```

---

## Login

```http
POST /auth/login
```

Request:

```json
{
  "email": "vaishnavi@test.com",
  "password": "password123"
}
```

Response:

```json
{
  "accessToken": "jwt-token"
}
```

---

# Ride Flow

```text
Signup/Login
    ↓
Request Ride
    ↓
Driver Accepts Ride
    ↓
Ride Confirmed
    ↓
OTP Generated
    ↓
Driver Starts Ride
    ↓
Ride Ends
    ↓
Payment Processed
    ↓
Ratings Submitted
```

---

# Testing

## Run Tests

```bash
mvn test
```

---

# Integration Testing

Integration tests use:
- SpringBootTest
- MockMvc
- H2 in-memory database

---

# Future Improvements

- WebSocket based notifications
- Live ride tracking
- Redis caching
- Kafka event streaming
- Payment gateway integration
- Surge pricing
- Driver earnings dashboard

---

# Key Concepts Used

- Layered Architecture
- DTO Pattern
- Strategy Pattern
- JWT Authentication
- Role Based Authorization
- Transaction Management
- Repository Pattern
- Service Layer Pattern

---

# Author

Vaishnavi Patil
