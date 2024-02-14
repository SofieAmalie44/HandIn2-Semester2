package com.example.handin_2

class Rectangle(color: String, isTransparent: Boolean, val height: Double, val width: Double) : Shape(color, isTransparent) {

    override fun calculatePerimeter() {
        val perimeter = 2 * (height * width)
        println("The perimeter of the rectangle is: $perimeter");
    }

    override fun calculateArea() {
        val area = height * width
        println("The area of the rectangle is: $area");
    }

}