package hw9.entity;

import java.util.HashMap;

public class Man extends Human {

       public Man(String name, String surname, int dateOfBirth, int iq){
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
