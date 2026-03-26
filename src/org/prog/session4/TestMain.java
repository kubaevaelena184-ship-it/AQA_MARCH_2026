package org.prog.session4;

public class TestMain {
    public static void testMain(String[] args) {
        PhoneShop shop = new PhoneShop();
        Phone phone1 = shop.buyPhone("Samsung", "Blue");
        if (phone1 != null) {
            phone1.ring();
        }
        Phone phone2 = shop.buyPhone("iPhone", "White");
        if (phone2 != null) {
            phone2.ring();
        }
        Phone phone3 = shop.buyPhone("Nokia", "Black");
        if (phone3 != null) {
            phone3.ring();
        }
    }
}