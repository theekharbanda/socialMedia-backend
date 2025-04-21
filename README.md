# Social Media Backend

A comprehensive News Article system built with Spring Boot that in which users can push articles, subscribe to other users and other users can interact with post with comments,likes efficiently.

## Technologies Used
- Java 17
- Spring Boot 3.4.2
- Spring Security with JWT Authentication
- Spring Data JPA
- PostgreSQL
- Lombok
- Gradle

## Features
- User Authentication and Authorization
- Article Management & Storage
- Comment Management
- Subscription Management
- Security with JWT Implementation

## Getting Started
1. Clone the repository
2. Configure PostgreSQL database
3. Run the application using: `./gradlew bootRun`

## Prerequisites
- Java 17 or higher
- PostgreSQL
- Gradle

## Configuration
Update `application.properties` with your database configuration:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## API Documentation
API documentation will be available at `/swagger-ui.html` when the application is running.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
