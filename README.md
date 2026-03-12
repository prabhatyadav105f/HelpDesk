

# 🤖 AI Powered Help Desk System

An **AI-powered Help Desk Management System** built with **Spring Boot and modern web technologies**.
The system allows users to **create, manage, and respond to support tickets**, while integrating **AI to assist in generating responses and improving support efficiency**.

This project demonstrates **REST API design, layered architecture, and AI integration in backend systems**.

---

# 🚀 Features

* 🎫 Ticket creation and management
* 🤖 AI-assisted ticket responses
* 📊 Organized help desk workflow
* 🔐 Clean layered backend architecture
* 🌐 RESTful API services
* ⚡ Frontend integration for user interaction

---

# 🏗 System Architecture

```text
User
 │
 ▼
Frontend (HelpDesk UI)
 │
 ▼
Spring Boot Backend
 │
 ├── Controller Layer
 │
 ├── Service Layer
 │
 ├── Repository Layer
 │
 ▼
Database
 │
 ▼
AI Response Generator
```

---

# 🧰 Tech Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA
* REST APIs
* Maven

### Frontend

* JavaScript
* HTML / CSS
* React (helpdesk-frontend)

### AI Integration

* AI Text Generation API

### Tools

* IntelliJ IDEA
* Git
* GitHub

---

# 📂 Project Structure

```text
HelpDesk
│
├── controller          # REST API controllers
├── service             # Business logic
├── Repository          # Database access layer
├── entity              # Database entities
├── config              # Configuration classes
├── tools               # Utility classes
│
├── HelpDeskApplication.java
│
└── resources
     └── application.properties
```

Frontend:

```text
helpdesk-frontend
```

Handles UI interaction and communicates with backend APIs.

---

# ⚙️ Running the Project

## 1️⃣ Clone the repository

```bash
git clone https://github.com/prabhatyadav105f/HelpDesk.git
```

---

# ▶️ Run Backend

Navigate to backend folder:

```bash
cd HelpDesk
```

Run Spring Boot application:

```bash
mvn spring-boot:run
```

Backend will start on:

```
http://localhost:8080
```

---

# ▶️ Run Frontend

Navigate to frontend folder:

```bash
cd helpdesk-frontend
```

Install dependencies:

```bash
npm install
```

Run frontend:

```bash
npm start
```

Frontend runs on:

```
http://localhost:3000
```

---

# 📬 Example API Endpoints

### Create Ticket

```
POST /tickets
```

Example request

```json
{
  "title": "Login Issue",
  "description": "Unable to login to account"
}
```

---

### Get All Tickets

```
GET /tickets
```

---

### Generate AI Response

```
POST /tickets/ai-response
```

Example request

```json
{
  "ticketText": "Customer cannot reset password"
}
```

---

# 🔮 Future Improvements

* AI ticket summarization
* Ticket priority prediction
* Authentication using JWT
* Docker containerization
* Admin dashboard
* Notification system

---

# 👨‍💻 Author

**Prabhat Yadav**
Information Technology Student

GitHub
[https://github.com/prabhatyadav105f](https://github.com/prabhatyadav105f)

---

# ⭐ Contribution

Contributions are welcome. Feel free to fork the repository and improve the project.

---
