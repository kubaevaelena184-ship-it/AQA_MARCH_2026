package org.prog.session6.homework6;
import java.util.Objects;

    public class Phone {
        public String brand;
        public String color;

        @Override
        public boolean equals(Object obj) {
            if (brand == null || color == null) {
                throw new RuntimeException();
            }

            if (obj instanceof Phone) {
                Phone phone = (Phone) obj;

                if (phone.brand == null || phone.color == null) {
                    throw new RuntimeException();
                }

                return Objects.equals(this.brand, phone.brand)
                        && Objects.equals(this.color, phone.color);
            }

            return false;
        }

        @Override
        public int hashCode() {
            if (brand == null || color == null) {
                throw new RuntimeException();
            }

            return Objects.hash(brand, color);
        }
    }

