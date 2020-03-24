package Homeworks.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Family {

    private final Human mother;

    private final Human father;

    private Human[] children = new Human[5];

    private Pet pet;

    private int count = 0;

     static int temp = 0;

    public Family(Human mother, Human father) {
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }


    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {

        count++;
        children[temp] = child;
        temp++;

    }


    public void deleteChild(int i) {
        int index = 0;
        for (int j = 0; j < temp; j++) {
            if (j == i - 1) {
                continue;
            }
            children[index] = children[j];
            index++;
        }
        temp--;
        count--;


    }

    public StringBuilder showChildren() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp; i++) {
            sb.append(children[i].toString());
        }
        return sb;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                ", count=" + count +
                '}';
    }
}
