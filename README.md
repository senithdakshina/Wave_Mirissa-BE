# Wave Mirissa - E-Commerce Jewelry Platform

<div align="center">

[![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-green?style=flat-square&logo=spring)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-336791?style=flat-square&logo=postgresql)](https://www.postgresql.org/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)

**A modern, feature-rich e-commerce platform specializing in jewelry with AI-powered personalization and virtual try-on capabilities.**

[Frontend Repository](#related-repositories) • [Features](#features) • [Technology Stack](#technology-stack) • [Installation](#installation) • [API Documentation](#api-documentation)

</div>

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Installation & Setup](#installation--setup)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Database Schema](#database-schema)
- [Authentication](#authentication)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [Related Repositories](#related-repositories)
- [Support](#support)

---

## 🎯 Overview

**Wave Mirissa** is a comprehensive e-commerce backend solution for a luxury jewelry business. Built with Spring Boot and modern Java technologies, it provides a robust API for managing jewelry products, customer orders, payments, and personalized shopping experiences.

The platform features AI-powered recommendations, virtual try-on capabilities, and personality-based customization suggestions to enhance the customer shopping experience.

---

## ✨ Features

### 🛍️ Core E-Commerce

- **Product Management**: Browse and manage jewelry items (Necklaces, Rings, Bracelets, Anklets, Earrings, Wristbands)
- **Shopping Cart**: Add, update, and manage items in cart
- **Wishlist**: Save favorite items for later purchase
- **Order Management**: Complete order lifecycle from creation to delivery
- **Payment Integration**: Secure payment processing
- **Order Tracking**: Real-time order status updates

### 👤 User Management

- **User Authentication**: JWT-based secure authentication
- **User Registration**: Self-service user account creation
- **User Profiles**: Manage personal information and addresses
- **Address Management**: Multiple delivery addresses support
- **Admin Panel**: User management and monitoring

### 🎨 Personalization & AI

- **Personality Analysis**: AI-driven personality assessment for jewelry matching
- **Smart Recommendations**: AI-powered jewelry recommendations based on user preferences and personality
- **Customization Services**: Personalized jewelry customization options
- **Customization Recommendations**: AI suggestions for jewelry modifications

### 🎭 Virtual & Augmented Features

- **Virtual Try-On**: Visualize jewelry on models before purchase
- **Try-On Module**: Interactive jewelry try-on experience
- **Product Visualization**: Enhanced product imagery and details

### 📊 Reviews & Feedback

- **Product Reviews**: Customer reviews and ratings
- **Review Management**: Admin control over review content

### 🎪 Marketing & Promotions

- **Banner Management**: Dynamic promotional banners
- **Featured Products**: Highlight bestsellers and new arrivals

### 👨‍💼 Admin Controls

- **Order Administration**: Full order management for administrators
- **User Administration**: Manage user accounts and roles
- **Product Management**: Add, update, delete jewelry items
- **Analytics**: Revenue and sales analytics
- **Access Control**: Role-based authorization (Admin, User)

---

## 🛠️ Technology Stack

### Backend Framework

- **Spring Boot**: 3.4.5 - Modern Java web framework
- **Java**: 17 - Latest stable JDK version
- **Maven**: 3.x - Dependency and build management

### Database

- **PostgreSQL**: Primary relational database (via Supabase)
- **JPA/Hibernate**: ORM (Object-Relational Mapping)
- **H2**: In-memory database for testing

### Security & Authentication

- **Spring Security**: 6.x - Security framework
- **JWT (JJWT)**: 0.11.5 - Token-based authentication
- **Spring Boot WebFlux**: Reactive web support

### AI & Advanced Features

- **Spring AI**: 1.0.1 - AI integration capabilities
- **OpenAI API**: External AI services

### Additional Libraries

- **Lombok**: 1.18.38 - Reduce boilerplate code
- **MySQL Connector**: Alternative database support
- **Jackson**: JSON processing

### External Services

- **Supabase**: PostgreSQL database hosting
- **Python Service**: ML/AI processing (virtual try-on, analysis)

---

## 📁 Project Structure

```
wave-Mirissa/
├── src/
│   ├── main/
│   │   ├── java/com/wave/Mirissa/
│   │   │   ├── WaveMirissaApplication.java          # Main application entry point
│   │   │   ├── Configurations/
│   │   │   │   └── WebSecurityConfiguration.java    # Security configuration
│   │   │   ├── controllers/                          # REST API endpoints
│   │   │   │   ├── AddressController.java
│   │   │   │   ├── AuthentictionController.java
│   │   │   │   ├── AdminOrderController.java
│   │   │   │   ├── CartController.java
│   │   │   │   ├── ProductController.java
│   │   │   │   ├── OrderController.java
│   │   │   │   ├── PaymentController.java
│   │   │   │   ├── ReviewController.java
│   │   │   │   ├── JewelryRecommendationController.java
│   │   │   │   ├── VirtualTryOnController.java
│   │   │   │   ├── CustomizationController.java
│   │   │   │   └── (... other controllers)
│   │   │   ├── models/                               # Entity models
│   │   │   │   ├── User.java
│   │   │   │   ├── Products.java
│   │   │   │   ├── Order.java
│   │   │   │   ├── Cart.java
│   │   │   │   ├── Review.java
│   │   │   │   ├── Customization.java
│   │   │   │   └── (... other entities)
│   │   │   ├── dtos/                                 # Data Transfer Objects
│   │   │   │   ├── AuthenticationRequest.java
│   │   │   │   ├── AuthenticationResponse.java
│   │   │   │   ├── OrderDTO.java
│   │   │   │   ├── CartPaymentResponse.java
│   │   │   │   └── (... other DTOs)
│   │   │   ├── repositories/                         # Data access layer
│   │   │   │   ├── UserRepository.java
│   │   │   │   ├── ProductRepository.java
│   │   │   │   ├── OrderRepository.java
│   │   │   │   └── (... other repositories)
│   │   │   ├── services/                             # Business logic layer
│   │   │   │   ├── AuthService.java / AuthServiceImpl.java
│   │   │   │   ├── ProductService.java
│   │   │   │   ├── OrderService.java
│   │   │   │   ├── CartService.java
│   │   │   │   ├── JewelryRecommendationService.java
│   │   │   │   ├── PersonalityAnalysisService.java
│   │   │   │   ├── CustomizationService.java
│   │   │   │   ├── PythonTryOnClient.java
│   │   │   │   └── (... other services)
│   │   │   ├── exception/                            # Custom exceptions
│   │   │   └── utils/                                # Utility classes
│   │   └── resources/
│   │       └── application.properties                # Application configuration
│   └── test/                                         # Unit & integration tests
├── pom.xml                                           # Maven configuration
├── mvnw / mvnw.cmd                                   # Maven wrapper scripts
└── README.md                                         # This file
```

---

## 🚀 Installation & Setup

### Prerequisites

- **Java JDK 17** or higher
- **Maven 3.6** or higher
- **PostgreSQL 12** or higher (or Supabase account)
- **Python 3.8+** (for AI/ML services)
- **Git**

### Step 1: Clone the Repository

```bash
git clone https://github.com/shehanchathu2/WaveMirissa-backend.git
cd wave-Mirissa
```

### Step 2: Configure Database

Update `src/main/resources/application.properties` with your database credentials:

```properties
spring.datasource.url=jdbc:postgresql://your-host:5432/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
```

**For Supabase Users:**

```properties
spring.datasource.url=jdbc:postgresql://your-supabase-host:5432/postgres
spring.datasource.username=postgres.your-project-ref
spring.datasource.password=your-password
```

### Step 3: Configure JWT Secret

Add your JWT secret to `application.properties`:

```properties
jwt.secret=your-secret-key-here-min-32-characters
```

### Step 4: Configure OpenAI API (Optional for AI features)

```properties
spring.ai.openai.api-key=sk-your-api-key-here
```

### Step 5: Configure Python Service URL (Optional for virtual try-on)

```properties
python.service.url=http://localhost:5000
```

### Step 6: Build the Project

```bash
# Using Maven wrapper (Unix/Linux/macOS)
./mvnw clean install

# Using Maven wrapper (Windows)
mvnw.cmd clean install

# Or using system Maven
mvn clean install
```

### Step 7: Run the Application

```bash
# Using Maven wrapper
./mvnw spring-boot:run

# Or using Java
java -jar target/wave-Mirissa-0.0.1-SNAPSHOT.jar
```

The application will start on `http://localhost:8080`

---

## ⚙️ Configuration

### Application Properties

| Property                                 | Description             | Default               |
| ---------------------------------------- | ----------------------- | --------------------- |
| `spring.application.name`                | Application name        | test1                 |
| `spring.datasource.url`                  | Database connection URL | -                     |
| `spring.datasource.username`             | Database username       | -                     |
| `spring.datasource.password`             | Database password       | -                     |
| `spring.jpa.hibernate.ddl-auto`          | Hibernate DDL strategy  | update                |
| `server.address`                         | Server bind address     | 0.0.0.0               |
| `jwt.secret`                             | JWT signing secret      | -                     |
| `spring.ai.openai.api-key`               | OpenAI API key          | -                     |
| `python.service.url`                     | Python ML service URL   | http://localhost:5000 |
| `spring.servlet.multipart.max-file-size` | Max file upload size    | 10MB                  |

### Security Configuration

- JWT tokens expire after a configured duration
- Password encoding using Spring Security's default encoder
- CORS enabled for frontend communication
- Role-based access control (RBAC)

---

## 📡 API Endpoints

### Authentication

- `POST /api/auth/signup` - User registration
- `POST /api/auth/login` - User login
- `POST /api/auth/refresh` - Refresh JWT token

### Products

- `GET /api/products` - Get all products
- `GET /api/products/{id}` - Get product details
- `POST /api/products` - Create product (Admin)
- `PUT /api/products/{id}` - Update product (Admin)
- `DELETE /api/products/{id}` - Delete product (Admin)

### Cart

- `GET /api/cart` - Get cart items
- `POST /api/cart/add` - Add item to cart
- `PUT /api/cart/update` - Update cart item
- `DELETE /api/cart/{itemId}` - Remove from cart
- `POST /api/cart/checkout` - Checkout cart

### Orders

- `POST /api/orders` - Create order
- `GET /api/orders` - Get user orders
- `GET /api/orders/{id}` - Get order details
- `PUT /api/orders/{id}/status` - Update order status (Admin)

### Wishlist

- `GET /api/wishlist` - Get wishlist items
- `POST /api/wishlist/add` - Add to wishlist
- `DELETE /api/wishlist/{productId}` - Remove from wishlist

### Reviews

- `GET /api/reviews` - Get product reviews
- `POST /api/reviews` - Create review
- `PUT /api/reviews/{id}` - Update review
- `DELETE /api/reviews/{id}` - Delete review

### Recommendations

- `GET /api/recommendations` - Get AI recommendations
- `POST /api/recommendations/analyze` - Personality analysis

### Virtual Try-On

- `POST /api/tryon/upload` - Upload image for try-on
- `POST /api/tryon/analyze` - Get try-on analysis

### Payment

- `POST /api/payments/process` - Process payment
- `GET /api/payments/status/{id}` - Get payment status

### Admin

- `GET /api/admin/orders` - View all orders
- `GET /api/admin/users` - View all users
- `POST /api/admin/banners` - Create banner

---

## 🗄️ Database Schema

### Core Entities

**User**

- Unique identifier, email, password (hashed), roles
- Contact information, addresses
- Account creation and update timestamps

**Products** (Jewelry Items)

- Product details: name, description, price
- Categories: Necklace, Ring, Bracelet, Anklet, Earring, WristBand
- Inventory tracking, images, ratings

**Order**

- Order ID, user reference, total price
- Order status tracking (PENDING, PROCESSING, SHIPPED, DELIVERED)
- Order date and delivery information

**CartItem**

- Product reference, quantity, price
- Cart association

**Review**

- Product reference, user feedback, rating
- Review timestamps

**Customization**

- Product customization options
- Custom specifications and preferences

**Wishlist**

- User's saved favorite products

**Payments**

- Payment tracking and status
- Transaction details

---

## 🔐 Authentication

The application uses **JWT (JSON Web Tokens)** for stateless authentication:

1. **Login**: User sends credentials → Server returns JWT token
2. **Token Usage**: Include token in `Authorization: Bearer <token>` header
3. **Token Verification**: Server validates token on each request
4. **Token Expiration**: Tokens expire after configured duration

### Security Features

- Password hashing using BCrypt
- Secure token generation
- Token refresh mechanism
- Role-based access control
- CORS protection
- CSRF protection via tokens

---

## 🌐 Environment Variables

Create a `.env` file or set environment variables:

```env
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/wave_mirissa
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=your-password
JWT_SECRET=your-32-character-secret-key
SPRING_AI_OPENAI_API_KEY=sk-your-key
PYTHON_SERVICE_URL=http://localhost:5000
```

---

## 📊 Deployment

### Docker Deployment

```dockerfile
FROM openjdk:17-jdk-slim
COPY target/wave-Mirissa-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### Cloud Deployment Options

**Heroku**

```bash
heroku login
heroku create wave-mirissa
git push heroku main
```

**AWS/Azure/Google Cloud**

- Use container orchestration (Docker, Kubernetes)
- Configure managed database services
- Set environment variables in cloud console

### Database Backup

```bash
pg_dump -h host -U username dbname > backup.sql
psql -h host -U username dbname < backup.sql
```

---

## 🧪 Testing

### Run Tests

```bash
# Run all tests
./mvnw test

# Run specific test class
./mvnw test -Dtest=YourTestClass

# Run with coverage
./mvnw test jacoco:report
```

### Test Categories

- Unit tests for services and utilities
- Integration tests for API endpoints
- Repository tests for database operations

---

## 🐛 Troubleshooting

### Common Issues

**Connection Refused**

- Verify PostgreSQL is running
- Check database URL and credentials
- Ensure network connectivity

**JWT Token Expired**

- Use refresh token endpoint
- Check token expiration settings

**CORS Errors**

- Verify WebSecurityConfiguration
- Check frontend URL in allowed origins

**File Upload Failures**

- Check `max-file-size` property
- Verify storage permissions

---

## 📦 Dependencies

Key dependencies and their versions:

- Spring Boot: 3.4.5
- Spring Security: 6.x
- Spring Data JPA: 3.4.5
- JWT (JJWT): 0.11.5
- Spring AI: 1.0.1
- Lombok: 1.18.38
- PostgreSQL Driver: Latest
- MySQL Connector: Latest

---

## 📝 Logging

Logging configuration in `application.properties`:

```properties
logging.level.root=INFO
logging.level.com.wave.Mirissa=DEBUG
logging.level.org.springframework.security=DEBUG
logging.pattern.console=%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n
```

---

## 📚 Related Repositories

- **Frontend Repository**: [WaveMirissa-frontend](https://github.com/shehanchathu2/WaveMirissa-frontend.git)
  - React-based user interface for the jewelry platform
  - Virtual try-on UI components
  - Product browsing and checkout flow

- **Python ML Service**: Companion AI/ML service for:
  - Personality analysis
  - Jewelry recommendations
  - Virtual try-on image processing

---

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/your-feature`
3. Commit changes: `git commit -m 'Add your feature'`
4. Push to branch: `git push origin feature/your-feature`
5. Submit a Pull Request

### Code Style

- Follow Google Java Style Guide
- Use meaningful variable and method names
- Add JavaDoc for public methods
- Write unit tests for new features

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 💬 Support

For support and questions:

- Create an issue on GitHub
- Contact the development team
- Check existing issues and discussions

---

## 🎉 Acknowledgments

- Spring Boot and Spring Security communities
- PostgreSQL and database community
- Open source contributors
- Team members and stakeholders

---

## 📈 Project Status

- **Current Version**: 0.0.1-SNAPSHOT
- **Status**: Active Development
- **Last Updated**: March 2026

---

## 🔗 Quick Links

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [JWT Documentation](https://github.com/jwtk/jjwt)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)
- [Spring Security Documentation](https://spring.io/projects/spring-security)

---

<div align="center">

Made with ❤️ by the Wave Mirissa Team

</div>
