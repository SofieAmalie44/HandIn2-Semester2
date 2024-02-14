package com.example.handin_2

open class Product(name: String, price: Double, quantity: Int) {
    val name: String = name;
    val price: Double = price;
    val quantity: Int = quantity;


    open fun identifyProductCategory() {
            println("I am a product");
    }

    override fun toString(): String {
        return super.toString() + " " + this.name + " " + this.price + " " + this.quantity;
    }

}