# Product Service - Spring Boot Microservice

SLIIT DevOps Lab 3 - Building a Spring Boot Microservice with In-Memory Database & Swagger

## Project Details

- **Group**: com.sliit
- **Artifact**: product-service
- **Java Version**: 21
- **Spring Boot Version**: 4.0.2

## Dependencies

- Spring Web
- Spring Data JPA
- H2 Database
- Springdoc OpenAPI UI

## Features Implemented

### Part 1: Spring Boot Microservice Setup
✓ Maven project with required dependencies
✓ Proper project structure

### Part 2: REST APIs
✓ Product entity with id, name, and price
✓ ProductRepository extending JpaRepository
✓ ProductController with CRUD endpoints:
  - POST /api/products - Create new product
  - GET /api/products - Get all products
  - GET /api/products/{id} - Get product by ID
  - DELETE /api/products/{id} - Delete product

### Part 3: H2 In-Memory Database
✓ H2 database configured (jdbc:h2:mem:productdb)
✓ Automatic table creation via Hibernate
✓ SQL logging enabled

### Part 4: Swagger/OpenAPI Documentation
✓ Springdoc OpenAPI UI integrated
✓ API documentation available at Swagger UI

## How to Run

1. Clone the repository
2. Navigate to project directory
```bash
cd product-service
```

3. Run the application
```bash
mvn spring-boot:run
```

4. The application will start on port 8080

## API Testing

### Swagger UI
Access Swagger UI at: `http://localhost:8080/swagger-ui.html`

### Manual API Testing

**Create Product:**
```bash
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Laptop","price":1299.99}'
```

**Get All Products:**
```bash
curl http://localhost:8080/api/products
```

**Get Product by ID:**
```bash
curl http://localhost:8080/api/products/1
```

**Delete Product:**
```bash
curl -X DELETE http://localhost:8080/api/products/1
```

## Database Details

- **Database Type**: H2 In-Memory
- **JDBC URL**: jdbc:h2:mem:productdb
- **Username**: sa
- **Password**: (empty)

## Project Structure

```
src/main/java/com/sliit/product_service/
├── ProductServiceApplication.java
├── controller/
│   └── ProductController.java
├── entity/
│   └── Product.java
└── repository/
    └── ProductRepository.java

src/main/resources/
└── application.properties
```

## Verification

The Product table is automatically created by Hibernate with the following structure:
- id: BIGINT (Primary Key, Auto-increment)
- name: VARCHAR(255)
- price: FLOAT(53)

## Module Information

- **Module**: Current Trends in Software Engineering (SE4010)
- **Lab**: DevOps Lab 3
- **Institution**: SLIIT - Faculty of Computing
- **Department**: Computer Science & Software Engineering
