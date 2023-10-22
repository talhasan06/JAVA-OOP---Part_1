abstract class Animal{
    String name;
    String color;

    Animal(String name,String color){
        this.name=name;
        this.color=color;
    }

    Animal(){

    }
    abstract void eatFood();
}
class Dog extends Animal{
    Dog(){

    }
    void eatFood(){
        System.out.println("Dog can eat");
    }
}
public class Abstr {
    public static void main(String[] args) {

    }
}
