package Lesson3;

import java.util.Scanner;

public class less3 {
    public static void main(String[] args){
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        UsersLenInitVal();

        }
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i]--;
            } else arr[i]++;
        }
        System.out.println("Задание 1");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        System.out.println("Задание 2");
        int a=1;

        for (int i = 0; i < arr.length; i++) {

            arr[i]=a;
            a++;
            System.out.println(arr[i]);
        }

    }
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        System.out.println("Задание 4");
        for (int i = 0; i < 4; i++) {
            arr[i][i]=1;
            arr[i][arr.length-1-i]=1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }

    public static void UsersLenInitVal() {
        System.out.println("Задание 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int len =sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите начальное значение массива");
        int init = sc1.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<arr.length;i++){
            arr[i]=init;

        }
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }



    }













}
