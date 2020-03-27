package hw13.service;

import hw13.entity.pets.Pet;
import hw13.dao.CollectionFamilyDao;
import hw13.entity.Family;
import hw13.entity.human.Human;
import hw13.entity.human.Man;
import hw13.entity.human.Woman;
import hw13.exceptions.FamilyOverflowException;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    CollectionFamilyDao db = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return db.getAllFamilies();
    }

    public void displayAllFamilies() {
        db.getAllFamilies().forEach(System.out::println);
    }

    public void getFamiliesBiggerThan(int amount) {
        db.getAllFamilies().stream().filter(family -> family.countFamily() > amount).collect(Collectors.toList())
                .forEach(fam -> System.out.printf(fam.toString()));
    }

    public void getFamilyLessThan(int amount) {
        db.getAllFamilies().stream().filter(family -> family.countFamily() < amount).collect(Collectors.toList())
                .forEach(fam -> System.out.printf(fam.toString()));
    }

    public int countFamiliesWithMemberNumber(int amount) {
        return (int) db.getAllFamilies().stream().filter(family ->
                family.countFamily() == amount).count();
    }

    public void createNewFamily(Human human1, Human human2) {
        db.saveFamily(new Family(human1, human2));
    }

    public void deleteFamilyByIndex(int index) {
        db.deleteFamily(index);
    }

    public void bornChild(int index, String manName, String womanName) throws ParseException {
        int random = (int) (Math.random() * 100);
        Family family = db.getFamilyByIndex(index - 1);
        if (family.countFamily() >= 4) throw new FamilyOverflowException
                ("Family overflow, number of member must be no more than 4");
        int iq = (family.getFather().getIq() + family.getMother().getIq()) / 2;
        String year = Human.millsToString((long) (Calendar.getInstance().
                getTimeInMillis() * ((Math.random() * 0.4) + 0.6)));
        if (random <= 50) {
            Man childMan = new Man(manName, family.getFather().getSurname(), year, iq);
            family.addChild(childMan);
        } else {
            Woman childWoman = new Woman(womanName, family.getFather().getSurname(), year, iq);
            family.addChild(childWoman);
        }
        db.saveFamily(family);
    }

    public void adoptChild(int index, Human child) {
        Family family = db.getFamilyByIndex(index - 1);
        if (family.countFamily() >= 4) throw new FamilyOverflowException
                ("Family overflow, number of member must be no more than 4");
        family.addChild(child);
        child.setSurname(family.getFather().getSurname());
        db.saveFamily(family);
    }

    public void deleteAllChildrenOlderThen(int age) {
        for (Family family : db.getAllFamilies()) {
            family.getChildren().removeIf(c -> (LocalDate.now().getYear() - c.getDateOfBirth()) > age);
        }
    }



    public int count() {
        return db.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return db.getFamilyByIndex(index);
    }

    public ArrayList<Pet> getPets(int index) {
        return db.getAllFamilies().get(index).getPets();
    }

    public void addPet(int index, Pet pet) {
        db.getAllFamilies().get(index).getPets().add(pet);
    }

}
