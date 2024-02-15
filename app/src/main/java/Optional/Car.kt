package Optional

open class Car(speed: Int, regularPrice: Long, color: String) {
    val speed: Int = speed;
    var regularPrice: Long = regularPrice;
    val color: String = color;
    open fun getSalesPrice() {
        println(regularPrice);
    }
}