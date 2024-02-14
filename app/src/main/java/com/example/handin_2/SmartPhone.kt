package com.example.handin_2

class SmartPhone(brand: String, year: Int, gb: Int, touch: Boolean) : Computer(brand, year, gb) {

    override fun messageSentFrom() {
        println("The message is sent from: Smartphone");
    }
}