package com.example.handin_2

class Circle(color: String, isTransparent: Boolean, val pi: Double, val radius: Double) : Shape(color, isTransparent) {

    override fun calculatePerimeter() {
        val perimeter = 2 * pi * radius
        println("The perimeter of the circle is: $perimeter")
    }

    override fun calculateArea() {
        val area = pi * radius * radius
        println("The area of the circle is: $area")
    }

}