package hw9.entity;

import java.util.HashMap;

public final class Woman extends Human {
    public Woman(String name, String surname, int dateOfBirth, int iq){
        super(name, surname, dateOfBirth, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello from Woman class");
    }

    public void makeUp(){
        System.out.println("Woman do makeup");
    }
}
