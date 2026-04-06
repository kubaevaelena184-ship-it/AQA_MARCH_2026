package main.java.org.prog.session7.homework7;
import java.util.Objects;

    public class Phone {
        public String brand;
        public String number;

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Phone) {
                Phone phone = (Phone) obj;
                return Objects.equals(this.brand, phone.brand)
                        && Objects.equals(this.number, phone.number);
            }
            return false;
            }
            @Override
            public String toString() {
                return "Phone{" +
                        "brand='" + brand + '\'' +
                        ", number='" + number + '\'' +
                        '}';
            }
        }

