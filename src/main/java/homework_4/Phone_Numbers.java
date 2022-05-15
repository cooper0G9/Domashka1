package homework_4;

public class Phone_Numbers {
    public static void main(String[] args) {

        Phonebook numbers = new Phonebook();

        numbers.add("Михайлов", "79854495588");
        numbers.add("Киреева", "79854495584");
        numbers.add("Михайлов", "79854495581");
        numbers.add("Дубков", "79854495587");


        System.out.println(numbers.get("Михайлов"));
    }

}
