package homework2;

import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int sc1 = scanner.nextInt();
        int sc2 = scanner.nextInt();
        x = sc1;
        y = sc2;

        if (x != 4 || y != 4) {
            throw new MyArraySizeException();
        }


        String[][] Array = new String[x][y];

        Array[0][0] = "1";
        Array[0][1] = "2";
        Array[0][2] = "3";
        Array[0][3] = "4";
        Array[1][0] = "5";
        Array[1][1] = "6";
        Array[1][2] = "X";
        Array[1][3] = "8";
        Array[2][0] = "9";
        Array[2][1] = "10";
        Array[2][2] = "11";
        Array[2][3] = "12";
        Array[3][0] = "13";
        Array[3][1] = "14";
        Array[3][2] = "15";
        Array[3][3] = "16";

        int Sum = 0;
        for (int i = 0; i < 4; i++) {

            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(Array[i][j] + " ");
                try {
                    int S = parseInt(Array[i][j]);
                    Sum = Sum + S;
                }
                catch (NumberFormatException MY){
                    MY.getLocalizedMessage();
                    throw new MyArrayDataException("Ошибка в ячейке i=" +i+" j="+j);
                }
            }

        }

        System.out.println();
        System.out.println("Сумма=" + Sum);

    }

}
