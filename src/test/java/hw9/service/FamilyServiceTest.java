package hw9.service;

import hw9.entity.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {

    private FamilyService familyService = new FamilyService();
    private Man father;
    private Woman mother;
    private Man father2;
    private Woman mother2;
    private Man child1;
    private Woman child2;
    private Pet pet1;

    private Family family;


    @BeforeEach
    void setUp() {
        pet1= new Dog(Species.DOG, "Bolt", 5, 70, new String[]{"eat", "sleep"});


        father = new Man("Vito", "Karlene", 1970,70);
        mother = new Woman("Jane", "Karlene", 1972, 80);
        father2 = new Man("Darcy", "Bennett", 1970,70);
        mother2 = new Woman("Eliza", "Bennett", 1972, 80);

        family=new Family(mother,father);

        child1 = new Man("Jack", "Karlene", 1997, 70);
        child2 = new Woman("Kitty", "Karlene", 2000, 70);
    }

    @Test
    public void getAllFamilies() {
        familyService.createNewFamily(mother,father);
        familyService.addPet(0,pet1);
        String expect =
                "[Family{mother=name='Jane', surname='Karlene', dateOfBirth=1972, iq=80},\n" +
                "father=name='Vito', surname='Karlene', dateOfBirth=1970, iq=70},\n" +
                "children=[], count=0}]";
        String actual = familyService.getAllFamilies().toString();
        assertEquals(expect,actual);
    }

    @Test
    void getFamilyById() {
        familyService.createNewFamily(mother,father);

        String expect =
                "Family{mother=name='Jane', surname='Karlene', dateOfBirth=1972, iq=80},\n" +
                        "father=name='Vito', surname='Karlene', dateOfBirth=1970, iq=70},\n" +
                        "children=[], count=0}";
        String actual =familyService.getFamilyById(0).toString();
        assertEquals(expect,actual);
    }

    @Test
    void createNewFamily() {
        familyService.createNewFamily(mother,father);
        int expect = 1;
        int actual =familyService.getAllFamilies().size();
        assertEquals(expect,actual);
    }

    @Test
    void bornChild() {
        familyService.createNewFamily(mother,father);
        familyService.bornChild(familyService.getFamilyById(0),"Harry","Lizzy");
        int expect = 3;
        int actual = familyService.getFamilyById(0).countFamily();
        assertEquals(expect,actual);
    }


    @Test
    void adoptChild() {
        familyService.createNewFamily(mother,father);
        familyService.adoptChild(familyService.getFamilyById(0),child1);
        int expect = 3;
        int actual = familyService.getFamilyById(0).countFamily();
        assertEquals(expect,actual);
    }

    @Test
    public void deleteFamilyByIndex() {
        familyService.createNewFamily(mother,father);
        familyService.deleteFamilyByIndex(0);
        assertEquals(0,familyService.getAllFamilies().size());
    }


}