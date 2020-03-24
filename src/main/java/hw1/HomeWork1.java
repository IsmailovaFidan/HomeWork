package hw1;


import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int MAX = 100;
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            int r = (int)(Math.random()*(MAX+1));
            a[i] = r;
//            System.out.println(a[i]);
            System.out.println("Let The Game Begin!");
            Scanner in=new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name=in.nextLine();
            while (1==1){
                System.out.print("Please enter the number: " );
                int b=in.nextInt();
                if(b<a[i]){
                    System.out.println("Your number is too small. Please, try again.");
                }
                else if(b>a[i]){
                    System.out.println("Your number is too big. Please, try again.");
                }
                else {
                    System.out.println("Congratulations, "+name+"!");
                    System.out.print("Your numbers: ");

                    break;
                }
            }
            break;
        }
    }
}
