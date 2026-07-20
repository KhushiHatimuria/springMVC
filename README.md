# 💼 Job Portal

A simple Job Portal web application built using **Spring Boot 4**, **Spring MVC**, and **Thymeleaf**. This project demonstrates the MVC architecture by allowing users to add job listings and view all available jobs. Currently, jobs are stored in memory using an `ArrayList`, with plans to integrate PostgreSQL in a future version.

---

## 🚀 Features

- 🏠 Home page with easy navigation
- ➕ Add new job postings
- 📋 View all available jobs
- 🎨 Responsive UI with custom CSS
- 🌿 Built using Spring MVC and Thymeleaf
- 📝 Form handling using Spring Boot
- 🔄 Redirect after successful job submission

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 4.x
- Spring MVC
- Thymeleaf
- Lombok
- Maven
- HTML5
- CSS3

---

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.khushi.jobapp
│   │       ├── controller
│   │       ├── model
│   │       ├── service
│   │       └── JobappApplication.java
│   │
│   └── resources
│       ├── templates
│       │   ├── home.html
│       │   ├── addjob.html
│       │   ├── viewalljobs.html
│       │   └── success.html
│       │
│       └── static
│           ├── css
│           └── images
```

---

## 📸 Screenshots

### Home Page

> Add a screenshot here

### Add Job

> Add a screenshot here

### View All Jobs

> Add a screenshot here

---

## ▶️ Running the Project

### Clone the repository

```bash
git clone https://github.com/<your-username>/JobPortal.git
```

### Navigate to the project

```bash
cd JobPortal
```

### Run the application

```bash
mvn spring-boot:run
```

or run the `JobappApplication` class directly from your IDE.

Open your browser and visit:

```
http://localhost:8082/
```

*(Replace the port if you have configured a different one.)*

---

## 📖 How It Works

1. Open the Home page.
2. Click **Add Job**.
3. Enter the job details.
4. Submit the form.
5. The application stores the job in an in-memory list.
6. View all jobs on the **View All Jobs** page.

---

## 📌 Current Limitations

- Data is stored in an `ArrayList`, so it is lost when the application restarts.
- No search, edit, or delete functionality yet.
- No user authentication.

---

## 🔮 Future Improvements

- ✅ PostgreSQL integration using Spring Data JPA
- 🔍 Search jobs by title or company
- ✏️ Update existing job postings
- 🗑️ Delete jobs
- 📄 Pagination and sorting
- 👤 User authentication and authorization
- 📱 Improved responsive UI with Bootstrap

---

 👩‍💻 Author

**Khushi Hatimuria**



---

## 📄 License

This project is developed for learning Spring Boot, Spring MVC, and Thymeleaf.
