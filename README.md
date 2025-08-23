# JavaServerPages_JSP  

A beginner-friendly **JavaServer Pages (JSP)** sample project that demonstrates JSP basics and best practices.  

***

## Overview  

This project is a JSP-based web application built on **Java Servlets + JSP**. It shows how to:  

- Embed Java code directly in HTML using scriptlets, expressions, and declarations  
- Use **JSP Expression Language (EL)** for cleaner and safer dynamic content  
- Integrate **JSTL (JavaServer Pages Standard Tag Library)** for conditional logic and iteration  
- Follow a simple **MVC-style flow** where Servlets process requests, and JSP pages handle the presentation  

***

## Project Structure  

```
JavaServerPages_JSP/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── servlet/
│       │               └── HelloServlet.java
│       │
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml
│           ├── index.jsp
│           └── hello.jsp
│
├── pom.xml         (if using Maven)
└── README.md
```

***

## Prerequisites  

- JDK 8 or above  
- Apache Tomcat (or any compatible servlet container)  
- Maven or Gradle (optional, if using build tools)  

***

## Running the Project  

### 1. Build (if using Maven)  

```
mvn clean package
```

To run with the Tomcat Maven plugin:  

```
mvn tomcat10:run
```

Or manually deploy the generated `war` file into Tomcat’s `webapps/` directory.  

***

### 2. Access the Application  

- Open in browser:  
  ```
  http://localhost:8080/
  ```
  Loads `index.jsp`  

- Visit:  
  ```
  http://localhost:8080/hello
  ```
  Request is handled by `HelloServlet`, then forwarded to `hello.jsp`  

***

## What You Will Learn  

### JSP Syntax and Structure  

- Scriptlets: `<% ... %>` → Embed Java code  
- Expressions: `<%= expression %>` → Output result into page  
- Declarations: `<%! ... %>` → Define methods or member variables  

### Directives  

- `<%@ page ... %>` → Page-level settings  
- `<%@ include file="..." %>` → Include static content  
- `<%@ taglib ... %>` → Import and use libraries like JSTL  

### Expression Language (EL)  

- Syntax: `${...}`  
- Access data, object properties, and evaluate conditions  
- Safer and cleaner alternative to embedding Java directly in JSP  

### MVC Flow  

- `HelloServlet.java` → Handles the request and sets attributes  
- `hello.jsp` → Reads attributes using EL and JSTL to render output  

***

## Example Screens  

- `index.jsp` → Welcome page with a link to the servlet  
- `hello.jsp` → Displays dynamic data coming from `HelloServlet` using EL and JSTL  

***

## Author  

Sai Shiva Merugu  
GitHub: [https://github.com/saishivamerugu](https://github.com/saishivamerugu)  

