# JavaServerPages_JSP

# JavaServerPages_JSP

A beginner-friendly JavaServer Pages (JSP) sample project demonstrating basic JSP concepts and functionality with best practices.

##  Overview

This repository contains a JSP-based web application built on Java Servlets and JSP. It showcases:

- Embedding Java code in HTML using scriptlets, expressions, and declarations  
- JSP Expression Language (EL) for cleaner dynamic content  
- JSTL (JavaServer Pages Standard Tag Library) integration for conditional logic and iteration  
- Simple MVC-style flow: Servlets for request processing, JSP for rendering

##  Project Structure

|-- src/
| |-- main/
| |-- java/
| |-- com.example.servlet/
| |-- HelloServlet.java
| |-- webapp/
| |-- WEB-INF/
| |-- web.xml
| |-- index.jsp
| |-- hello.jsp
|-- README.md
|-- pom.xml (if using Maven)

### Prerequisites

- Java Development Kit (JDK) 8+  
- Apache Tomcat (or other servlet container)  
- Maven or Gradle (optional, if using build tool)

### Running the Project

1. **Build (if using Maven)**  
   mvn clean package

mvn tomcat10:run
Or manually copy the .war into Tomcat's webapps/ directory and start Tomcat.

Access the Application

Open your browser at http://localhost:8080/ — loads index.jsp

Navigate to http://localhost:8080/hello (mapped in web.xml) to reach the servlet and forwarded JSP.

What You'll Learn
JSP Syntax & Structure
Scriptlets: <% ... %> — embed Java code

Expressions: <%= expression %> — evaluates and outputs result

Declarations: <%! ... %> — define page-level methods or variables

Directives:

<%@ page ... %> — page-level settings (e.g., content type, imports)

<%@ include file="..." %> — includes content at translation time

<%@ taglib ... %> — import tag libraries like JSTL

Expression Language (EL)
Use ${...} to access properties or evaluate expressions — cleaner, safer alternative to scriptlets

MVC Concept Flow
HelloServlet.java: handles GET requests, sets request attributes (e.g., name), and forwards to hello.jsp

hello.jsp: uses EL and potentially JSTL to render dynamic data
