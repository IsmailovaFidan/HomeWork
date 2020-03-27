package hw10.controller;

import hw10.entity.Family;
import hw10.entity.Human;
import hw10.entity.Pet;
import hw10.service.FamilyService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FamilyController {

    private FamilyService familyService=new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public ArrayList<Family> getFamiliesBiggerThan(int amount) {
     return familyService.getFamiliesBiggerThan(amount);
    }

    public ArrayList<Family> getFamilyLessThan(int amount) {
        return familyService.getFamilyLessThan(amount);
    }

    public int countFamiliesWithMemberNumber(int amount) {
        return familyService.countFamiliesWithMemberNumber(amount);
    }

    public void createNewFamily(Human human1, Human human2) {
        familyService.createNewFamily(human1,human2);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String boyName, String girlName) throws ParseException {
        return familyService.bornChild(family,boyName,girlName);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
       familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int index){
        return familyService.getFamilyById(index);
    }

    public ArrayList<Pet> getPets(int index){
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet){
        familyService.addPet(index,pet);
    }
}
