package com.example.handin_2

class ProductApp {
}

fun main() {

    // creating the objects
    val shoe: Shoe = Shoe("Nike", 300.0, 20);
    val tShirt: TShirt = TShirt("Adidas", 200.0, 13);
    val book: Book = Book("Harry Potter", 200.0, 50);

    // calling the method
    shoe.identifyProductCategory()
    tShirt.identifyProductCategory()
    book.identifyProductCategory()
}