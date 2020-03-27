package hw11.controller;

import hw11.entity.Family;
import hw11.entity.Human;
import hw11.entity.Pet;
import hw11.service.FamilyService;

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

    public void getFamiliesBiggerThan(int amount) { familyService.getFamiliesBiggerThan(amount);
    }

    public void getFamilyLessThan(int amount) {
         familyService.getFamilyLessThan(amount);
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
