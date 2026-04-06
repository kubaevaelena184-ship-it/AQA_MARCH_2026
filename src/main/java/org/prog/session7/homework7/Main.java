package main.java.org.prog.session7.homework7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class Main {

        public static void main(String[] args) {
            Map<Phone, List<String>> phoneContacts = new HashMap<>();

            Phone phone1 = generatePhone("Samsung", "11111");
            Phone phone2 = generatePhone("iPhone", "22222");

            phoneContacts.put(phone1, new ArrayList<>());
            phoneContacts.put(phone2, new ArrayList<>());

            phoneContacts.get(phone1).add("Mama");
            phoneContacts.get(phone1).add("Mama");
            phoneContacts.get(phone1).add("Boss");

            phoneContacts.get(phone2).add("Taxi");
            phoneContacts.get(phone2).add("Doctor");
            phoneContacts.get(phone2).add("Taxi");

            System.out.println(phoneContacts);
        }

        public static Phone generatePhone(String brand, String number) {
            Phone phone = new Phone();
            phone.brand = brand;
            phone.number = number;
            return phone;
        }
    }

