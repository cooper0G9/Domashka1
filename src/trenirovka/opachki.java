package trenirovka;

import java.util.Scanner;

public class opachki {
    public static void main(String[] args) {
       printGreeting();
      // printGreetingCecle();
    }
    public static void printGreeting() {
        Scanner x = new Scanner(System.in);
        int q=x.nextInt();
        for (int times = 0; times<q; times+=1) {
            System.out.println("Hello бяка");
        }
    }

   // public static void printGreetingCecle() {
      //  Scanner x = new Scanner(System.in);
     //   Scanner x1 = new Scanner(System.in);
     //   int q=x.nextInt();
     //   String word= x1.nextLine();
      //  for (int times = 0; times<q; times+=1) {
      //      System.out.println("Hello бяка");
      //  }
  //  }






}
