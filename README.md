```
# JavaServerPages_JSP

A beginner-friendly **JavaServer Pages (JSP)** sample project demonstrating JSP basics and best practices.

---

##  Overview

This repository contains a JSP-based web application built on **Java Servlets + JSP**.  
It showcases:

- Embedding Java code in HTML using **scriptlets, expressions, and declarations**  
- Using **JSP Expression Language (EL)** for cleaner dynamic content  
- Integrating **JSTL (JavaServer Pages Standard Tag Library)** for conditional logic and iteration  
- Following a simple **MVC-style flow**: Servlets for request processing, JSP for rendering  

---

##  Project Structure



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
├── pom.xml      # if using Maven
└── README.md




---

##  Prerequisites

- **Java Development Kit (JDK) 8+**  
- **Apache Tomcat** (or any Servlet container)  
- **Maven/Gradle** (optional, if using build tools)  

---

## ▶ Running the Project

### 1. Build (if using Maven)
```
mvn clean package
````

Run with Tomcat Maven Plugin:

```
mvn tomcat10:run
```

Or manually deploy the generated `.war` file to Tomcat’s `webapps/` directory.

---

### 2. Access the Application

* Open: [http://localhost:8080/](http://localhost:8080/) → loads `index.jsp`
* Go to: [http://localhost:8080/hello](http://localhost:8080/hello) → mapped in `web.xml`, handled by `HelloServlet`, forwarded to `hello.jsp`

---

##  What You’ll Learn

###  JSP Syntax & Structure

* **Scriptlets:** `<% ... %>` → Embed Java code
* **Expressions:** `<%= expression %>` → Outputs result
* **Declarations:** `<%! ... %>` → Define methods/variables

###  Directives

* `<%@ page ... %>` → Page-level settings
* `<%@ include file="..." %>` → Static include
* `<%@ taglib ... %>` → Import tag libraries like JSTL

###  Expression Language (EL)

* `${...}` → Access properties / evaluate expressions
* Cleaner & safer than scriptlets

###  JSTL

* `<c:if>` for conditionals
* `<c:forEach>` for looping

###  MVC Flow

* **HelloServlet.java** → Handles request, sets attributes
* **hello.jsp** → Renders data using EL/JSTL

---

## Example Screens

* **index.jsp** – Welcome page with link to servlet
* **hello.jsp** – Displays dynamic data from servlet using EL

---

## Author

* Sai Shiva Merugu
* GitHub: [https://github.com/saishivamerugu](https://github.com/saishivamerugu)

---

