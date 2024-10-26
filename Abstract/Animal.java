package Abstract;

public abstract class Animal{
    
    private final int age;

    public Animal(int age){
        this.age = age;
        System.out.println("A Animal has been created");
    }

    //abstract method
    public abstract void eat();

    //non-abstract method
    public void sleep(){
        System.out.println("A Animal is sleeping");
    }
    // abstract methods define what should be done (without saying how),
    // while non-abstract methods define both what and how.

    public int age(){
        return age;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        Object dog = new Dog();
        Dog realDog = (Dog) dog;

        realDog.eat();
        realDog.ruff();


        Object cat = new Cat();
        Cat realCat = (Cat) cat;
        realCat.eat();
        realCat.meow();

        Dog doggy = new Dog();

        if(d instanceof Animal){
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();

    }
}
