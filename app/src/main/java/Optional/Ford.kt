package Optional

class Ford(speed: Int, regularPrice: Long, color: String, year: Int, manufacturerDiscount: String): Car(speed, regularPrice, color) {
    var manufacturerDiscount: String = manufacturerDiscount;

    override fun getSalesPrice() {
        // could be done faster by just making manufacturerDiscount a Int
        val splitString = manufacturerDiscount.split("")
        val discountAmount = splitString[1].toString() + splitString[2].toString()

        regularPrice -= (regularPrice * discountAmount.toInt() / 100)
        println(regularPrice);
    }

}