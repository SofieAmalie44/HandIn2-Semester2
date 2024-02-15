package Optional

class Truck(speed: Int, regularPrice: Long, color: String, weight: Int): Car(speed, regularPrice, color){

    var weight: Int = weight
    override fun getSalesPrice() {
        if (weight < 2000) {
            regularPrice = (regularPrice - (regularPrice * 0.20)).toLong()
            println(regularPrice)
        }
    }

    fun discountCalculater() {
        if (weight > 2000) {
            regularPrice = (regularPrice - (regularPrice * 0.10)).toLong()
            println(regularPrice)
        }
    }
}