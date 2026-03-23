package org.prog.session4;

public class Phone {
    public String brand;
    public String color;

    public Phone(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void ring() {
        System.out.println("Phone is ringing: " + brand + "," + color);

    }
}