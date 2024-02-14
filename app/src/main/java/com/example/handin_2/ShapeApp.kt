package com.example.handin_2

import androidx.core.R

class ShapeApp {
}

fun main() {

    // creating objects
    val circle: Circle = Circle("Pink", true, 3.14, 5.5);
    val rectangle: Rectangle = Rectangle("Blue", false, 6.6, 3.5);
    val triangle: Triangle = Triangle("Green", true, 4.2, 3.5, 3.0, 3.0);

    // calling the methods
    circle.calculatePerimeter()
    circle.calculateArea()

    rectangle.calculatePerimeter()
    rectangle.calculateArea()

    triangle.calculatePerimeter()
    triangle.calculateArea()

}