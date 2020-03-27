package hw12.controller;

import hw12.entity.Family;
import hw12.entity.human.Human;
import hw12.entity.pets.Pet;
import hw12.exceptions.FamilyOverflowException;
import hw12.service.FamilyService;

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

    public void bornChild(int index, String manName, String womanName) throws ParseException {
        try {
            familyService.bornChild(index, manName, womanName);
        } catch (FamilyOverflowException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void adoptChild(int index, Human child) {
        try {
            familyService.adoptChild(index, child);
        } catch (FamilyOverflowException ex) {
            System.out.println(ex.getMessage());
        }
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
