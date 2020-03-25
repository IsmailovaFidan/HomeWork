package hw8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    HashMap<DayOfWeek, String> schedule = new HashMap<>();
    private Woman mother;
    private Man father;
    private Human child;
    private Family family;


    @BeforeEach
    void setUp() {
        List<Human> children = new ArrayList<>();
        father = new Man("Vito", "Karlene", 1970,70,schedule);
        mother = new Woman("Jane", "Karlene", 1972, 80, schedule);
        family = new Family(mother, father);
        child = new Man("Jack", "Karlene", 1997, 70,schedule);

    }

    @Test
    void addChild() {
        family.addChild(child);
        int expect = 3;
        int actual =family.count;
        assertEquals(expect,actual);
    }

    @Test
    void deleteChild() {

        family.addChild(child);
        family.deleteChild(0);
        int expect = 2;
        int actual = family.count;
        assertEquals(expect, actual);
    }

    @Test
    void showChildren() {
    }
}