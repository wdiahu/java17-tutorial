package ahu.wudi.java16;

public class InstanceOfTest {

    //before java16
    private static void eatingTest1(Object obj){
        if (obj instanceof Animal){
            Animal animal = (Animal)obj;
            animal.eat();
        }
    }

    //java 16
    private static void eatingTest2(Object obj){
        if (obj instanceof Animal animal){
            animal.eat();
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        eatingTest1(animal);
        eatingTest1(animal);
    }
}

class Animal{
    public void eat(){
        System.out.println("eating...");
    }
}
