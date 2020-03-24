package hw3;

import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Week Planner");
        String schedule[][] = {{"Monday", "to go for a walk"}, {"Tuesday", "go to courses"},
                {"Wednesday", "do home work"}, {"Thursday", "go to courses"}, {"Friday", "watch a film"},
                {"Saturday", "go to courses"}, {"Sunday", "do home work"}};
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {

//                System.out.print(schedule[i][j] + " ");
//                System.out.println();


            }
        }
        while (1==1){
            Scanner in = new Scanner(System.in);
            System.out.print("Please, input the day of the week: ");
            String day = in.nextLine().toUpperCase().trim();
            if(day=="exit".toUpperCase()) break;

            switch (day) {

                case "MONDAY":
                    System.out.println("Your tasks for "+day.toLowerCase()+" "+schedule[0][1]);
                    break;
                case "TUESDAY":
                    System.out.println("Your tasks for "+day.toLowerCase()+" "+schedule[1][1]);
                    break;
                case "WEDNESDAY":
                    System.out.println("Your tasks for "+day.toLowerCase()+" "+schedule[2][1]);
                    break;
                case "THURSDAY":
                    System.out.println("Your tasks for "+day.toLowerCase()+" " +schedule[3][1]);
                    break;
                case "FRIDAY":
                    System.out.println("Your tasks for "+day.toLowerCase()+" " +schedule[4][1]);
                    break;
                case "SATURDAY":
                    System.out.println("Your tasks for "+day.toLowerCase()+" " +schedule[5][1]);
                    break;
                case "SUNDAY":
                    System.out.println("Your tasks for "+day.toLowerCase()+" " +schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;

            }



        }

    }
}


