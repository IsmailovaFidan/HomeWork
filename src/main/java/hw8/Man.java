package hw8;

import java.util.HashMap;
import java.util.Map;

public class Man extends Human {

        Man(String name, String surname, int dateOfBirth, int iq, HashMap<DayOfWeek,String> schedule){
            super(name, surname, dateOfBirth, iq, schedule);
        }

        @Override
        void greetPet() {
            System.out.println("Hello from Man class");
        }

        void repairCar(){
            System.out.println("A Man repair his can");
        }
}
