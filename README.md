# Decodelabs-Task-2-AryanT
Designed Student Grade Calculator using Java
# Student Grade Calculator 📊
A robust console-based Java application built as part of the *Industrial Training Program (Project 2)*. This application takes marks obtained in various subjects, calculates total marks, computes the average percentage, and dynamically assigns a letter grade based on predefined performance metrics.
---
## 🎯 Project Goal & Overview
The primary objective of this project is to build an interactive, user-friendly utility that helps automate academic result computations. It serves as a practical implementation to showcase core programming workflows in Java.

### 🔑 Key Requirements Addressed:
* *Dynamic Inputs:* Captures marks (out of 100) for an arbitrary number of user-defined subjects.
* *Data Aggregation:* Computes the cumulative Total Marks.
* *Statistical Logic:* Computes the exact Average Percentage.
* *Conditional Grading:* Evaluates performance thresholds to dynamically allocate letter grades.
* *Clear Presentation:* Outputs structured reports with validation status metrics.
---
## 🧠 Key Concepts Used

This project implements fundamental software engineering principles and core Java concepts:
* *Variables & Arrays:* Dynamic memory allocation via integer arrays to manage multi-subject marks records.
* *Input Validation & Exception Handling:* Loop-based input shielding using Scanner.hasNextInt() to protect against alphanumeric crashing, negative numbers, or scale overflow (> 100).
* *Loops:* Multi-layered control flows (while and for loops) for user prompts and data gathering.
* *Arithmetic Operations:* Precision float casting (double) to maintain mathematically precise average evaluations.
* *Conditional Statements:* Clean if-else-if chains mapping out structured grade distributions.
---
## 📉 Grading Scale Reference

The application applies grading tiers based on the following average percentage bounds:

| Average Percentage Bound | Assigned Letter Grade |
| :--- | :---: |
| $\ge$ 90% | *A* |
| $\ge$ 80% and < 90% | *B* |
| $\ge$ 70% and < 80% | *C* |
| $\ge$ 60% and < 70% | *D* |
| $\ge$ 50% and < 60% | *E* |
| < 50% | *F* |

---
## 💻 How To Run
### Prerequisites
Make sure you have the Java Development Kit (JDK) installed on your system (JDK 8 or higher is recommended).

### Steps
1. *Clone the repository:*
   ```bash
   git clone [https://github.com/YOUR_USERNAME/student-grade-calculator.git](https://github.com/YOUR_USERNAME/student-grade-calculator.git)
   cd student-grade-calculator
  1.Compile the Java File:
  ```bash
javac use esc StudentGradeCalculator.java
```
2. Run the Application:
```bash
java StudentGradeCalculator
```
#🖥️ Sample Terminal Execution

========================================
       STUDENT GRADE CALCULATOR         
========================================

Enter the total number of subjects: 3

Enter marks obtained out of 100 for each subject:
Subject 1: 85
Subject 2: 92
Subject 3: 78

========================================
             FINAL REPORT               
========================================
Total Marks Obtained : 255 / 300
Average Percentage   : 85.00%
Assigned Grade       : B
========================================
