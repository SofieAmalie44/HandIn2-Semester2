package com.example.handin_2

class AppComputer {
}

fun main() {
    val smartphone1: SmartPhone = SmartPhone("IPhone", 2022, 16, true);
    val laptop1: Laptop = Laptop("Apple", 2019, 239, true);

    smartphone1.messageSentFrom()
    laptop1.messageSentFrom()

}