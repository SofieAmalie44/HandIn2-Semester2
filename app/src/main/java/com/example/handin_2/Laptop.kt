package com.example.handin_2

class Laptop(brand: String, year: Int, gb: Int, retinaScreen: Boolean) : Computer(brand, year, gb) {
    override fun messageSentFrom() {
        println("The message is sent from: Laptop");
    }
}