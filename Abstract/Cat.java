package Abstract;

public class Cat extends Animal {

    public Cat(){
        super(7);
        System.out.println("A cat is created");
    }

    @Override
    public void eat(){
        System.out.println("A cat is eating.");
    }
    
    @Override
    public void sleep(){
        System.out.println("A cat is sleeping");
    }

    public void meow(){
        System.out.println("A cat says meow");
    }

    public void prance(){
        System.out.println("A cat is prancing");
    }
}
