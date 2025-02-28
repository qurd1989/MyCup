Expense Tracker Project Documentation

1️⃣ Project Overview

A simple Expense Tracker application that allows users to add, edit, delete, and categorize expenses.

2️⃣ Technology Stack

Backend:

Spring Boot – REST API

Spring Data JPA – Database interactions

PostgreSQL – Database

Spring Security – Authentication (Optional)

Swagger – API documentation

Frontend:

React (with Vite) – UI

Axios – API communication

React Router – Navigation

Material UI – UI Components

3️⃣ API Endpoints

Method

Endpoint

Description

POST

/api/auth/signup

Register user (Optional)git 

POST

/api/auth/login

Authenticate user (Optional)

GET

/api/expenses

Get all expenses

POST

/api/expenses

Add new expense

PUT

/api/expenses/{id}

Update an expense

DELETE

/api/expenses/{id}

Delete an expense

GET

/api/expenses/filter?category=food

Filter expenses by category

GET

/api/reports/monthly

Get monthly report

4️⃣ Database Schema

Tables:

expenses

Column Name

Type

Description

id

INT (PK)

Unique identifier

title

VARCHAR

Expense title

amount

DECIMAL

Expense amount

category

ENUM

Expense category (Food, Travel, etc.)

date

DATE

Date of expense

5️⃣ UI Structure

Component Tree:

App
├── Navbar
├── HomePage
│   ├── ExpenseSummary
│   ├── ChartComponent
├── ExpensesPage
│   ├── ExpenseTable
│   ├── CategoryFilter
├── AddExpensePage
│   ├── ExpenseForm

6️⃣ Setup Instructions

Backend:

Clone the repository.

Install dependencies: ./gradlew build

Run the Spring Boot application: ./gradlew bootRun

Access API at http://localhost:8080

Frontend:

Navigate to frontend/ directory.

Install dependencies: npm install

Start React app: npm run dev

Access frontend at http://localhost:5173

