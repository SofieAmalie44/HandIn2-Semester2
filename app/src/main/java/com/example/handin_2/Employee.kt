package com.example.handin_2

open class Employee(firstName: String, lastName: String, monthlySalary: Double) {
    val firstName: String = firstName;
    val lastName: String = lastName;
    var monthlySalary: Double = monthlySalary;

   init {
       if (monthlySalary < 0) {
           this.monthlySalary = 0.0
       }
   }

    private val yearlySalary = monthlySalary * 12

    open fun yearlySalary() {
        println(yearlySalary)
    }

    fun giveRaise(raiseAmount: Double) {
        val raisedAmount = yearlySalary * raiseAmount
        println(yearlySalary + raisedAmount)
    }

    override fun toString(): String {
        return super.toString() + " " + this.firstName + " " + this.lastName + " " + this.monthlySalary;
    }

}