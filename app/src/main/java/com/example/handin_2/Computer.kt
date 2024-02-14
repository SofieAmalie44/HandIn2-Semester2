package com.example.handin_2;

open class Computer(brand: String, year: Int, gb: Int) {
    val brand: String = brand;
    val year: Int = year;
    val gb: Int = gb;



    // Method to create function that tels us where a message is sent from
    open fun messageSentFrom(){
        println("This is a message");
    }

    override fun toString(): String {
        return super.toString() + " " + this.brand + " " + this.year + " " + this.gb;
    }
}
