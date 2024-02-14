package com.example.handin_2

open class Shape(color: String, isTransparent: Boolean) {
    val color: String = color;
    val isTransparent: Boolean = isTransparent;

    open fun calculatePerimeter() {
        println("ready to calculate perimeter");
    }

    open fun calculateArea() {
        println("ready to calculate area");
    }

    override fun toString(): String {
        return super.toString() + " " + this.color + " " + this.isTransparent;
    }

}