package Lesson7;

public class Cat {

    private static int CountOfCats = 0;
    private String name;
    private int appetite;
    private boolean Fullness = false;


    public Cat(String name, int appetite, boolean fullness){
        this.name = name;
        this.appetite = appetite;

        CountOfCats++;

    }
    public void eat(Plate plate)
    {
        if (plate.getFood()<appetite){
            System.out.println("Еды слишком мало для кисы");}
        else{
            System.out.println("Котик кушает");
            plate.setFood(plate.getFood() - appetite);
            setFullness(true);

        }

    }

    public String getName(){
        return name;
    }

    public static int CountOfCats(){
        return CountOfCats;

    }

    public void setFullness(boolean fullness) {
        Fullness = fullness;
    }

    public boolean isFullness() {
        return Fullness;
    }
}
