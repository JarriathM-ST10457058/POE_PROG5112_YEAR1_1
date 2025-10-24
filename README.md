Overview

The Contract Monthly Claims System is a web-based platform built using ASP.NET Core MVC and SQL Server LocalDB.
It enables lecturers to submit, review, and manage monthly contract claims securely and efficiently.

The system includes:
User authentication and registration
Claim submission and management
Role-based access control (Lecturer / Admin)
Reliable data storage using SQL
Integrated unit testing using xUnit for system reliability

Project Structure

Contract_Monthly_Claims_System/
│
├── Controllers/
│   └── HomeController.cs
│
├── Models/
│   └── User.cs
│   └── ClaimModel.cs
│
├── Database/
│   └── DatabaseService.cs
│
├── Views/
│   └── Home/
│       ├── Index.cshtml
│       ├── Login.cshtml
│       ├── Register.cshtml
│       └── Claim.cshtml
│
├── wwwroot/
│
├── appsettings.json
├── Program.cs
├── Startup.cs
│
└── Contract_Monthly_Claims_System.Tests/
    ├── Controllers/
    │   └── HomeControllerTests.cs
    ├── Database/
    │   └── DatabaseServiceTests.cs
    └── Models/
        └── UserTests.cs

Technologies Used

Frontend:	HTML5, CSS3, Razor Views (CSHTML)
Backend:	ASP.NET Core MVC (.NET 8 / .NET 6)
Database:	SQL Server (LocalDB)
Testing:	xUnit, Moq
IDE:	Visual Studio 2022
Version Control:	Git & GitHub

Error Handling & Reliability

The system includes:
Try-Catch blocks around all data access methods
User-friendly error messages
Null checks for database queries
Unit tests ensuring functions return correct results and handle exceptions gracefully
