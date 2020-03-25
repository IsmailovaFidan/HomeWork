package hw8;

import java.util.HashMap;
import java.util.Map;

public final class Woman extends Human {
    Woman(String name, String surname, int dateOfBirth, int iq, HashMap<DayOfWeek,String> schedule){
        super(name, surname, dateOfBirth, iq,schedule);
    }

    @Override
    void greetPet() {
        System.out.println("Hello from Woman class");
    }

    void makeUp(){
        System.out.println("Woman do makeup");
    }
}
