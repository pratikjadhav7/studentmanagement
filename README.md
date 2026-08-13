# 🎓 Student Management System

A **full-stack Student Management System** developed using **Spring Boot, Spring Data JPA, Hibernate, MySQL, HTML, CSS and JavaScript**.

The project provides complete **CRUD operations** for managing student records and is deployed on the cloud using **Render** and **Aiven MySQL**. 🚀

---

## 🌐 Live Application

🔗 **Frontend:**
https://studentmanagementdeployed.netlify.app/

🔗 **Backend API:**
https://studentmanagement-2-6a8o.onrender.com

---

## ✨ Features

* ➕ Add Student
* 📋 Display All Students
* 🔍 Search Student by FRN
* ✏️ Update Student
* 🗑️ Delete Student
* 🚫 Duplicate FRN validation
* 🔄 REST API based communication
* 🗄️ MySQL database integration
* ☁️ Aiven cloud database
* 🚀 Render deployment
* 🐳 Docker support

---

## 🛠️ Technologies Used

### 💻 Backend

* ☕ Java
* 🌱 Spring Boot
* 📦 Spring Data JPA
* 🛡️ Hibernate
* 🔗 REST API
* 🧰 Maven

### 🎨 Frontend

* 🌐 HTML5
* 🎨 CSS3
* ⚡ JavaScript
* 🔄 Fetch API

### 🗄️ Database

* 🐬 MySQL
* ☁️ Aiven MySQL

### 🚀 Deployment

* ▲ Render
* ☁️ Aiven

### 🔧 Tools

* 🐙 Git
* 🐱 GitHub
* 🐳 Docker
* 🖥️ MySQL Workbench

---

## 🏗️ Project Architecture

```text
                    👤 USER
                       │
                       ▼
              ┌──────────────────┐
              │    FRONTEND      │
              │ HTML/CSS/JS      │
              │     Render       │
              └────────┬─────────┘
                       │
                    REST API
                       │
                       ▼
              ┌──────────────────┐
              │     BACKEND      │
              │   Spring Boot   │
              │     Render       │
              └────────┬─────────┘
                       │
                 Spring Data JPA
                       │
                    Hibernate
                       │
                       ▼
              ┌──────────────────┐
              │    AIVEN MYSQL   │
              │   CLOUD DATABASE │
              └──────────────────┘
```

---

## 👨‍🎓 Student Details

The Student entity contains the following fields:

| Field       | Description           |
| ----------- | --------------------- |
| `frn`       | 🔑 Unique student FRN |
| `name`      | 👤 Student name       |
| `batchName` | 📚 Student batch      |
| `address`   | 🏠 Student address    |
| `dob`       | 🎂 Date of birth      |

---

## 🔗 REST API

### ➕ Add Student

```http
POST /studentapi/addstudent
```

Example request:

```json
{
  "frn": "FRN101",
  "name": "Rahul",
  "batchName": "Java",
  "address": "Pune",
  "dob": "2002-05-10"
}
```

---

### 📋 Get All Students

```http
GET /studentapi/getallstudents
```

Returns all student records from the database.

---

### 🔍 Get Student

```http
GET /studentapi/getstudent/{frn}
```

Example:

```http
GET /studentapi/getstudent/FRN101
```

---

### ✏️ Update Student

```http
PUT /studentapi/updatestudent
```

Updates the details of an existing student.

---

### 🗑️ Delete Student

```http
DELETE /studentapi/deletebyfrn/{frn}
```

Example:

```http
DELETE /studentapi/deletebyfrn/FRN101
```

---

## 🗄️ Database Configuration

The application uses **Aiven MySQL** for the production database.

Database configuration is managed using environment variables:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

### 🔐 Environment Variables

```text
DB_URL
DB_USERNAME
DB_PASSWORD
```

⚠️ **Never commit database credentials, passwords or sensitive environment variables to GitHub.**

---

## 💻 Run Locally

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/pratikjadhav7/studentmanagement.git
```

### 2️⃣ Open Project

```bash
cd studentmanagement
```

### 3️⃣ Configure Database

For local MySQL, configure your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentmanagement
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4️⃣ Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or Maven Wrapper on Windows:

```bash
mvnw.cmd spring-boot:run
```

---

## 🐳 Docker

This project also includes Docker support.

### Build Docker Image

```bash
docker build -t studentmanagement .
```

### Run Docker Container

```bash
docker run -p 8080:8080 studentmanagement
```

Application:

```text
http://localhost:8080
```

---

## 🔄 CRUD Flow

### ➕ Create

```text
👤 User
   ↓
Add Student Form
   ↓
JavaScript Fetch API
   ↓
Spring Boot Controller
   ↓
Service
   ↓
Repository
   ↓
Aiven MySQL
```

### 📖 Read

```text
👤 User
   ↓
Display / Search
   ↓
GET Request
   ↓
Spring Boot
   ↓
Repository
   ↓
Aiven MySQL
   ↓
JSON Response
   ↓
Frontend
```

### ✏️ Update

```text
🔍 Search by FRN
       ↓
Student Data Loaded
       ↓
Edit Details
       ↓
PUT Request
       ↓
Spring Boot
       ↓
Aiven MySQL
```

### 🗑️ Delete

```text
🔑 Enter FRN
      ↓
DELETE Request
      ↓
Spring Boot
      ↓
Check Student Exists
      ↓
Delete Student
      ↓
Aiven MySQL
```

---

## 📂 Project Structure

```text
studentmanagement/
│
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/
│   │   │   └── 📁 com/sm/studentmanagement/
│   │   │
│   │   └── 📁 resources/
│   │       └── application.properties
│   │
│   └── 📁 test/
│
├── 📄 pom.xml
├── 📄 Dockerfile
├── 📄 mvnw
├── 📄 mvnw.cmd
├── 📄 .gitignore
└── 📄 README.md
```

---

## 🚀 Deployment

### Frontend

The frontend is deployed using:

**Render** ▲

### Backend

The Spring Boot REST API is deployed using:

**Render** ▲

### Database

The production database is hosted on:

**Aiven MySQL** ☁️

---

## 🔐 Data Flow in Production

```text
🌍 User
   ↓
🌐 Render Frontend
   ↓
🚀 Render Spring Boot Backend
   ↓
🔗 REST API
   ↓
☁️ Aiven MySQL
   ↓
🗄️ Student Data
```

---

## 🎯 Project Objective

The main objective of this project is to build a practical and scalable **Student Management System** using modern Java backend technologies and REST APIs.

This project demonstrates:

* ☕ Java programming
* 🌱 Spring Boot development
* 🔗 REST API creation
* 🗄️ Database connectivity
* 📦 Spring Data JPA
* 🛡️ Hibernate ORM
* ⚡ Frontend-backend integration
* ☁️ Cloud database integration
* 🚀 Cloud deployment
* 🐳 Docker containerization

---

## 🔮 Future Enhancements

* 🔐 User Authentication
* 👨‍💼 Admin Dashboard
* 👥 Role-Based Access
* 📄 Pagination
* 🔎 Advanced Search
* 📊 Student Reports
* 🖼️ Student Profile Images
* 📧 Email Notifications
* 📱 Responsive UI

---

## 👨‍💻 Author

### **Pratik Jadhav**

🐙 GitHub:
https://github.com/pratikjadhav7

---

## ⭐ Show Your Support

If you like this project, please give the repository a ⭐ on GitHub.

**Made with ❤️ using Java & Spring Boot**
