package com.example.handin_2

class Triangle(color: String, isTransparent: Boolean, val baseA: Double, val heightA: Double, val sideB: Double, val sideC: Double) : Shape(color, isTransparent) {

    override fun calculatePerimeter() {
        val perimeter = baseA + sideB + sideC
        println("The perimeter of the triangle is: $perimeter")
    }

    override fun calculateArea() {
        val area = 0.5 * baseA * heightA
        println("The area of the triangle is: $area")
    }

}