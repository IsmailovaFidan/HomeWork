package hw10.entity;

import java.text.ParseException;

public class Man extends Human {

       public Man(String name, String surname, String dateOfBirth, int iq) throws ParseException {
            super(name, surname, dateOfBirth, iq);
        }

        @Override
        public void greetPet() {
            System.out.println("Hello from Man class");
        }

        public void repairCar(){
            System.out.println("A Man repair his can");
        }
}
