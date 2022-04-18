package Lesson2;
import java.util.Scanner;

public class Les2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println (within10and20());
        System.out.println("Задание 2");
        isPositiveOrNegative();
        System.out.println("Задание 3");
        System.out.println (isNegative());
        System.out.println("Задание 4");
        printWordNTimes();
    }
    public static boolean within10and20() {
        //задание 1
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        int x2 = x.nextInt();
        int f = x1 + x2;
        if (f >= 10 && f <=20){
            return true;
        }
        else{
            return false;
        }

    }
    public static void isPositiveOrNegative() {
        //задание 2
        Scanner x = new Scanner(System.in);
        int p = x.nextInt();
        if (p >=0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }


    public static boolean isNegative() {
        //задание 3
        Scanner x = new Scanner(System.in);
        int p = x.nextInt();
        if (p >=0) {
            return true;
        }
        return false;
    }


    public static void printWordNTimes() {
        //задание 4
        System.out.println("Введите число, а затем слово");
        Scanner x = new Scanner(System.in);
        Scanner x1 = new Scanner(System.in);
        int q=x.nextInt();
        String word= x1.nextLine();
        for (int times = 0; times<q; times+=1) {
            System.out.println(word);
        }
    }




















}