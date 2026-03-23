package org.prog.session4;

public class PhoneShop {
    public Phone buyPhone(String brand,String color){
        if (color.equalsIgnoreCase("Black")){
            System.out.println("Sorry, black phones are not available.");
            return null;
        }
        if (brand.equalsIgnoreCase("iPhone")) {
            System.out.println("Sorry, iPhone is not available.");
            return null;
        }
        return new Phone(brand,color);
    }
}
