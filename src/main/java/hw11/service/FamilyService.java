package hw11.service;

import hw11.dao.CollectionFamilyDao;
import hw11.entity.*;


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

    public Family bornChild(Family family, String boyName, String girlName) throws ParseException {
        int random = (int) (Math.random() * 100);
        String dateofbirth = Human.millsToString((long) (Calendar.getInstance()
                .getTimeInMillis() * ((Math.random() * 0.4) + 0.6)));

        if (random > 50) {
            Man boy = new Man(boyName, family.getFather().getSurname(), dateofbirth, random);
            family.addChild(boy);
        } else {
            Woman girl = new Woman(girlName, family.getFather().getSurname(), dateofbirth, random);
            family.addChild(girl);
        }
        return family;
    }

    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        return family;
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
