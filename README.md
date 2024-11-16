TaskManager-BasicAPI-SpringBoot
This project is a basic Task Manager API built using Spring Boot. It provides endpoints to perform CRUD (Create, Read, Update, Delete) operations on tasks, with data stored in a MongoDB database. Endpoints are tested using Postman.

Features
GET: Fetch all tasks.
POST: Add a new task.
PUT: Update an existing task.
DELETE: Remove a task.
GET by ID: Retrieve a task by its unique ID.

Technologies Used
Spring Boot: For building the API backend.
MongoDB: To store and manage task data.
Postman: For testing the API endpoints.

Project Structure
src  
├── main  
│   ├── java  
│   │   └── com.example.taskmanager  
│   │       ├── controller   # REST API Controllers  
│   │       ├── model        # Task Entity  
│   │       ├── repository   # MongoDB Repository Interface  
│   │       └── service      # Service Layer for Business Logic  
│   └── resources  
│       └── application.properties  # MongoDB configuration  
