# Ex No: 01 – Simple Web Server Using Spring Boot

### Name: Harish Gowtham E
### Register Number: 2305002009
### Reg No: 2305002001

## AIM

To develop a Simple Web Server using Spring Boot that can handle basic HTTP requests and return appropriate responses through RESTful endpoints.

## ALGORITHM

1. Create a new Spring Boot project using Spring Initializr.
2. Add the required dependency: **Spring Web**.
3. Create the main application class with the `@SpringBootApplication` annotation.
4. Create a controller class using the `@RestController` annotation.
5. Define HTTP request handler methods using annotations such as `@GetMapping`.
6. Implement a method to handle GET requests and return a simple response.
7. Run the Spring Boot application.
8. Test the endpoint using a web browser or Postman.
9. Verify the output.
10. Stop the server after successful testing.

---

## PROJECT STRUCTURE

```text
simple-web-server/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.example.demo/
│       │       ├── DemoApplication.java
│       │       └── HelloController.java
│       └── resources/
│           └── application.properties
├── pom.xml
```

---

## PROGRAM

### pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>simple-web-server</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>Simple Web Server</name>
    <description>Demo project for Spring Boot Web Server</description>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.1.2</version>
        <relativePath/>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```

### DemoApplication.java

```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

### HelloController.java

```java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
```

### application.properties

```properties
server.port=8081
```

---

## OUTPUT

 <img width="657" height="444" alt="image" src="https://github.com/user-attachments/assets/95e9b9db-009e-43e3-b82a-7740153a00b6" />

## RESULT

Thus, a Simple Web Server using Spring Boot that can handle basic HTTP requests and return appropriate responses through RESTful endpoints was developed and executed successfully.
