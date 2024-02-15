package Optional

class AutoShop {
}
    fun main() {

        val truck: Truck = Truck(250, 2000000, "Pink", 2500);
        truck.getSalesPrice()
        truck.discountCalculater()

        val ford: Ford = Ford(300, 1500000, "Green", 2010, "20%");
        ford.getSalesPrice()
        val ford2: Ford = Ford(200,300000, "Blue", 2000, "10$");
        ford2.getSalesPrice()

        val car: Car = Car(250, 500000, "White");
        car.getSalesPrice()
    }


