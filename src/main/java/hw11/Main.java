package hw11;

import hw11.controller.FamilyController;
import hw11.entity.*;


import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {



        Pet dog = new Dog(Species.DOG, "Bolt", 5, 70, new String[]{"eat", "sleep"});
        Pet cat = new Cat(Species.CAT, "Garfield", 5, 100, new String[]{"eat", "sleep"});
        Pet fish = new Fish(Species.FISH, "Nemo", 3, 20, new String[]{"eat", "sleep"});


        Man father1 = new Man("Vito", "Karlene", "11/01/1970",70);
        Woman mother1 = new Woman("Jane", "Karlene", "09/10/1972", 80);
        Man father2 = new Man("Darcy", "Bennett", "15/11/1970",70);
        Woman mother2 = new Woman("Eliza", "Bennett", "09/04/1972", 80);


        Man child1 = new Man("Jack", "Karlene", "12/03/1997", 70);
        Woman child2 = new Woman("Kitty", "Karlene", "04/08/2000", 70);

        FamilyController familyController=new FamilyController();

        familyController.createNewFamily(mother1, father1);
        familyController.createNewFamily(mother2, father2);


        familyController.bornChild(familyController.getFamilyById(0), "Harry", "Lizzy");
        familyController.bornChild(familyController.getFamilyById(1), "Tom", "Natale");

        familyController.adoptChild(familyController.getFamilyById(0), child1);
        familyController.adoptChild(familyController.getFamilyById(1), child2);

        familyController.addPet(0, dog);
        familyController.addPet(1, fish);

        familyController.displayAllFamilies();
        familyController.deleteAllChildrenOlderThen(18);




//        familyController.deleteFamilyByIndex(1);
//        familyController.getFamiliesBiggerThan(1);
//        familyController.getFamilyLessThan(3);



        System.out.println(familyController.count());
    }
}
