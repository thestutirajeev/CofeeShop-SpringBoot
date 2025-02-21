# ☕ Coffee Shop Menu - Spring Boot Project  

## **📝 Project Overview**  
The **Coffee Shop Menu** project is a **full-stack web application** built using **Spring Boot**, designed to manage a dynamic menu for a coffee shop. 
Initially, we started with **JSP (Java Server Pages)** for rendering views, then transitioned to **Thymeleaf** for better integration with Spring Boot, 
and finally integrated **Spring Data JPA** for dynamic data management using a database.  

---

## **🔧 Technologies Used**  
- **Backend:** Spring Boot, Spring MVC, Spring Data JPA  
- **Frontend:** JSP (initially) → Thymeleaf  
- **Database:** H2 (for development) / MySQL (for production)  
- **ORM:** Hibernate (via JPA)  
- **Build Tool:** Maven  
- **Server:** Embedded Tomcat  

---

## **📌 Evolution of the Project**  

### **🛠️ Phase 1: Static Menu with JSP**  
Initially, we built the project using **JSP (Java Server Pages)** for rendering views. In this phase:  
✅ **Hardcoded menu items** in JSP pages  
✅ **Controllers handled basic navigation** (`@RequestMapping`)  
✅ **No database integration**, all data was static  

💡 **Why We Shifted Away from JSP?**  
- JSP requires **a lot of boilerplate code**  
- Mixing Java logic inside JSP leads to **poor maintainability**  
- **Spring Boot prefers Thymeleaf** for better integration  

---

### **✨ Phase 2: Migration to Thymeleaf**  
To improve integration with Spring Boot and simplify UI rendering, we switched to **Thymeleaf**, which allows embedding **dynamic data** directly in HTML.  

✅ **Better HTML & Spring Boot integration**  
✅ **No need for JSP Servlet configurations**  
✅ **More readable and maintainable UI templates**  

💡 **Why Thymeleaf?**  
- Works **seamlessly with Spring Boot**  
- Supports **dynamic data binding** without Java code in HTML  
- More **modern and maintainable**  

---

### **🚀 Phase 3: Making the Application Dynamic with JPA**  
To move from a **static menu** to a **fully dynamic system**, we integrated **Spring Data JPA** with Hibernate. Now, all menu items are **stored in a database**, allowing CRUD operations.  

✅ **Menu items stored in the database**  
✅ **Spring Data JPA used for persistence**  
✅ **Users can add, update, and delete menu items**  

#### **1️⃣ Creating the Product Entity**
#### **2️⃣ Defining the Repository Interface**
#### **3️⃣ Creating a Service Layer**
#### **4️⃣ Using JPA Data in Thymeleaf**

## **📌 Features Implemented**  
✅ Display a **dynamic menu** with items stored in the database  
✅ **CRUD operations** (Add, Update, Delete) for menu items  
✅ **Thymeleaf templates** for rendering dynamic views  
✅ **Spring Boot & Hibernate integration**  
✅ **H2 database for development**, MySQL for production  

---

## **⚡ How to Run the Project**  

1️⃣ **Clone the Repository:**  
```sh
git clone https://github.com/your-username/coffee-shop-menu.git
cd coffee-shop-menu
```

2️⃣ **Run the Spring Boot Application:**  
```sh
mvn spring-boot:run
```

3️⃣ **Access the App in Browser:**  
```
http://localhost:8082
```
---

## **📜 Conclusion**  
This project showcases the evolution of a Spring Boot web application:  
✅ **Started with JSP for static content**  
✅ **Migrated to Thymeleaf for better templating**  
✅ **Integrated JPA for full database-driven functionality**  

This transition **made the project more scalable, maintainable, and dynamic**. 🚀  
