package org.prog.session5.phone;

public class Main {
    public static void usePhone(IPhone phone){
        phone.unlock();
        phone.call();
    }
    public static void main(String[] args){
        IPhone android = new Android();
        IPhone apple = new Apple();

        usePhone((android));
        System.out.println("-----");
        usePhone(apple);
    }
}
