package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>{

    private ArrayList<T> array;

    @SafeVarargs
    public Box(T... Fruit){
        this.array=new ArrayList<>(Arrays.asList(Fruit));
    }
    public double getWeight() {
        double weight = 0.0;

        for (T o : array) {
            weight += o.getWeight();
        }

        return  weight;
    }

    public void pour(Box<T> another) {
        another.array.addAll(array);
        array.clear();
    }
    public boolean compare(Box<?> o) {

        return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();

        //заполняет коробку с яблоками (i - количество)
        for (int i = 0; i < 3; i++) {
            box1.array.add(new Apple());
        }
        //заполняет коробку с апельсинами (i - количество)
        for (int i = 0; i < 2; i++) {
            box2.array.add(new Orange());

        }

        System.out.println("Масса коробки с яблоками: "+ box1.getWeight());
        System.out.println("Масса коробки с апельсинами: "+ box2.getWeight());

        System.out.println("Коробки весят одинаково? "+ box2.compare(box1));


        box2.pour(box3);
        System.out.println("Масса коробки 2 "+ box2.getWeight());
        System.out.println("Масса коробки 3 "+ box3.getWeight());

    }


}