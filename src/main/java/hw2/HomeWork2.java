package hw2;


import java.util.*;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        int[][] m = new int[5][5];


        while (1 == 1) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    m[i][j] = (int) (Math.random()*100);

                    System.out.print(" - " + " | ");  //m[i][j]


                }

                System.out.println("");
            }

            Scanner in=new Scanner(System.in);
            System.out.print("Enter one number: ");
            int num=in.nextInt();
            if(num==m[2][3]){
                for (int i = 0; i < m.length; i++) {
                    for (int j = 0; j < m.length; j++) {
//                        m[2][3]=" * "; I can't convert to * in array

                        System.out.print(" - " + " | ");

                    }


                    System.out.println();
                }
                System.out.println("You Have Won!");
                break;

            }
            else {
                for (int i = 0; i < m.length; i++) {
                    for (int j = 0; j < m.length; j++) {

                        System.out.print(m[i][j] + " | ");

                    }

                    System.out.println("");
                }

                System.out.print("Enter one number: ");
            }

        }


    }
}
