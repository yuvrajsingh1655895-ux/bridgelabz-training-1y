import java.util.*;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class AnimalTest{
    public static void printAnimals(List<? extends Animal> animals){
        System.out.println("Printing animals: "+animals.size());
    }

    public static void main(String[] args){
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        printAnimals(dogs);
        printAnimals(cats);
    }
}
