package com.example.handin_2


class App {
}

fun main() {
    // two employee objects
    val employee1: Employee = Employee("Sofie", "Thorlund", -5.0);
    val employee2: Employee = Employee("Emil", "Thorlund", 40000.00);

    // the monthly salary
    println("Employee nr: 1 monthly salary: ${employee1.monthlySalary}. Employee nr: 2 monthly salary: ${employee2.monthlySalary}");
    // the yearly salary
    employee1.yearlySalary();
    employee2.yearlySalary();
    // the raised yearly salary
    employee1.giveRaise(0.10)
    employee2.giveRaise(0.10)
}