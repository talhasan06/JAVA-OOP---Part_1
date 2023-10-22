
class Animal{
    String name;
    String color;

    void display(){
        System.out.println("ami Animal class theke bolsi");
    }
}

class Dog extends Animal{
    Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    //overriding
    void display(){
        super.display();
        System.out.println(this.name+" "+this.color+" from Dog class");
    }
}
public class Inherit {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bulldog","white");
        d1.display();
    }
}
