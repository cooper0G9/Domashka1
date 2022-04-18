package homework3;

import java.util.Scanner;

public class ChangeElements {
    public static void main(String[] args) {

        int x;
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int sc1 = scanner.nextInt();
        x = sc1;
        int[] Array = new int[x];

        System.out.println("Введите значения в ячейки массива");
        Scanner scanner2 = new Scanner(System.in);

        for (int i = 0; i < x; i++) {
            int sc2 = scanner2.nextInt();
            Array[i]=sc2;

        }
        for (int i = 0; i < x; i++) {
            System.out.print(Array[i]+" ");
        }


        System.out.println();
        System.out.println("Введите номера ячеек для смены");

        Scanner sc3 = new Scanner(System.in);
        int i2=sc3.nextInt()-1;
        int i3=sc3.nextInt()-1;
        int pr1=Array[i2];
        int pr2=Array[i3];

        Array[i2]=pr2;
        Array[i3]=pr1;
        for (int i = 0; i < x; i++) {
            System.out.print(Array[i]+" ");
        }
    }
}
