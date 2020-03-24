package hw5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Human vito = new Human("Vito", "Karlene", 1977);//Father
    Human jane = new Human("Jane", "Karlene", 1977);//Mother
    Family family=new Family(vito,jane);
    Human child1 = new Human("Kitty", "Karleone", 2000, 75,4);
    Human child2 = new Human("Jack", "Karleone", 2002, 60,3);

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


}