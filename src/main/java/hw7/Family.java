package hw7;

import java.util.Arrays;

public class Family {

    Woman mother;
    Man father;
    private Human[] children = new Human[5];

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private Pet pet;
    private int count = 0;
    static int temp = 0;

    public Family(Woman mother, Man father) {
        count = 2;
        this.mother = mother;
        this.father = father;
    }

    public Family(Woman mother, Man father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
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
    protected void finalize() throws Throwable {
        System.out.println("Object has been removed");
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
