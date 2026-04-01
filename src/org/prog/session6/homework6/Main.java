package org.prog.session6.homework6;



    public class Main {
        public static void main(String[] args) {
            Phone phone1 = new Phone();
            Phone phone2 = new Phone();

            phone1.brand = "Apple";
            phone1.color = "black";

            phone2.brand = "Apple";
            phone2.color = null;

            try {
                System.out.println(phone1.equals(phone2));
                System.out.println(phone1.hashCode());
                System.out.println(phone2.hashCode());
            } catch (RuntimeException e) {
                System.out.println("oops, phone has no brand or color!");
            }
        }
    }

