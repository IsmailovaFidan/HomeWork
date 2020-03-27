package hw12.entity;

import hw12.controller.FamilyController;
import hw12.entity.human.Human;
import hw12.entity.human.Man;
import hw12.entity.human.Woman;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    FamilyController familyController = new FamilyController();

    public void console() throws ParseException {


        while (true) {
            message(listOfCommand());
            switch (inputId("Enter the command")) {
                case 1:
                    fillWithTestData();
                    message("Test data created");
                    break;
                case 2:
                    familyController.displayAllFamilies();
                    break;
                case 3:
                    familyController.getFamiliesBiggerThan(inputId("Enter number of member: "));
                    break;
                case 4:
                    familyController.getFamilyLessThan(inputId("Enter number of member: "));
                    break;
                case 5:
                    System.out.println(familyController.countFamiliesWithMemberNumber
                            (inputId("Enter number of people in family: ")));
                    break;
                case 6:
                    try {
                        familyController.createNewFamily(dataAboutFather(), dataAboutMother());
                        message("Family created successfully");
                    } catch (Exception ex) {
                        message("Incorrect input");
                    }
                    break;
                case 7:
                    familyController.deleteFamilyByIndex(inputId("Enter family Id to delete"));
                    message("Family deleted successfully");
                    break;
                case 8:
                    int c = inputId("Enter next command.\n'1' - born child\n'2' - adopt child\n'3' - back to menu\n");
                    switch (c) {
                        case 1:
                            try {
                                familyController.bornChild(inputId("Enter family id"),
                                        inputString("Enter name for boy "),
                                        inputString("Enter name for girl "));

                            } catch (NullPointerException ex) {
                                message("Wrong family index");
                            }
                            break;
                        case 2:
                            try {
                                familyController.adoptChild(inputId("Enter family id "), dataAboutChild());
                            } catch (NullPointerException ex) {
                                message("Wrong family index");
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 9:
                    int ageFilter = inputId("Enter age filter");
                    familyController.deleteAllChildrenOlderThen(ageFilter);
                    break;
                case -1:
                    message("Incorrect input");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }


    private static String listOfCommand() {
        final StringBuilder sb = new StringBuilder("Main\n");
        sb.append("1 - Fill with test data\n");
        sb.append("2 - Display the entire list of families\n");
        sb.append("3 - Display a list of families where the number of people is greater than the specified number\n");
        sb.append("4 - Display a list of families where the number of people is less than the specified number\n");
        sb.append("5 - Calculate the number of families where the number of members is \n");
        sb.append("6 - Create a new family\n");
        sb.append("7 - Delete a family by its index in the general list\n");
        sb.append("8 - Edit a family by its index in the general list\n");
        sb.append("9 - Remove all children over the age of majority\n");
        sb.append("0 - Exit\n");
        return sb.toString();
    }

public void fillWithTestData() throws ParseException {
    Human father1=new Human("Father1Name","Father1Surname","11/11/1970");
    Human mother1=new Human("Mother1Name","Mother1Surname","11/11/1970");
    Human father2=new Human("Father2Name","Father2Surname","11/11/1970");
    Human mother2=new Human("Mother2Name","Mother2Surname","11/11/1970");
    Human father3=new Human("Father3Name","Father3Surname","11/11/1970");
    Human mother3=new Human("Mother3Name","Mother3Surname","11/11/1970");
    Human father4=new Human("Father4Name","Father4Surname","11/11/1970");
    Human mother4=new Human("Mother4Name","Mother4Surname","11/11/1970");

    Human child1=new Human("child1Name","child1Surname","12/01/2000");
    Human child2=new Human("child2Name","child2Surname","12/01/2000");
    Human child3=new Human("child3Name","child3Surname","12/01/2000");
    Human child4=new Human("child4Name","child4Surname","12/01/2000");


    familyController.createNewFamily(father1,mother1);
    familyController.createNewFamily(father2,mother2);
    familyController.createNewFamily(father3,mother3);
    familyController.createNewFamily(father4,mother4);



    familyController.adoptChild(1,child1);
    familyController.adoptChild(2,child2);
    familyController.adoptChild(3,child3);
    familyController.adoptChild(4,child4);
}


    private static int inputId(String s) {
        Scanner in = new Scanner(System.in);
        message(s);
        try {
            return in.nextInt();
        } catch (InputMismatchException ex) {
            return -1;
        }
    }

    private static String inputString(String s) {
        Scanner in = new Scanner(System.in);
        message(s);
        return in.nextLine();
    }

    private static void message(String s) {
        System.out.println(s);
    }

    private static Man dataAboutFather() throws ParseException {

        Scanner in = new Scanner(System.in);
        message("Enter father name: ");
        String name = in.nextLine();
        message("Enter father surname: ");
        String surname = in.nextLine();
        message("Enter birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        message("Enter Iq: ");
        int iq = in.nextInt();
        return new Man(name, surname, birthDate, iq);
    }

    private static Woman dataAboutMother() throws ParseException {
        Scanner in = new Scanner(System.in);
        message("Enter mother name: ");
        String name = in.nextLine();
        message("Enter mother surname: ");
        String surname = in.nextLine();
        message("Enter birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        message("Enter Iq: ");
        int iq = in.nextInt();
        return new Woman(name, surname, birthDate, iq);
    }

    private static Human dataAboutChild() throws ParseException {
        Scanner in = new Scanner(System.in);
        message("Please, enter info about child ");
        message("Enter child name: ");
        String name = in.nextLine();
        message("Enter child surname: ");
        String surname = in.nextLine();
        message("Enter birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        return new Human(name, surname, birthDate);
    }
}
