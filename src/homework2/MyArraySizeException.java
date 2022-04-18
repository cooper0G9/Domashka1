package homework2;

public class MyArraySizeException extends IndexOutOfBoundsException {

    private static String str = "Превышен максимальный размер массива";

    public MyArraySizeException(){

        super(str);
    }
}

