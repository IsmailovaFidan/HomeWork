package hw6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    String[] habits = {"eating,drinking,sleeping"};


    Pet garfield = new Pet(Species.CAT, "Garfield", 5, 75, habits);
    Pet bolt = new Pet(Species.DOG, "Bolt", 5, 80, habits);
    Human vito = new Human("Vito", "Karlene", 1977,70,1,"go to courses ",bolt);//Father
    Human jane = new Human("Jane", "Karlene", 1977,80,2,"go to courses ",garfield);//Mother
    Family family=new Family(jane,vito);
    Human child1 = new Human("Kitty", "Karleone", 2000, 75,4,"go to courses ",garfield);
    Human child2 = new Human("Jack", "Karleone", 2002, 60,3,"to go for a walk",bolt);


    @BeforeEach
    public void setUp() throws Exception{
        family.addChild(child1);
    }

    @Test
    void addChild() {
        family.addChild(child2);
        int expect = 2;
        int actual = family.temp;
        assertEquals(expect,actual);
    }

    @Test
    void deleteChild() {
        family.addChild(child2);
        family.deleteChild(1);
        int expect = 3;
        int actual = family.temp;
        assertEquals(expect, actual);
    }

    @Test
    void showChildren() {
    }
}