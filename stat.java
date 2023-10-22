class Cat{
    final String name="Alben";
    public String color="Black";
    static void printInfo(){
        System.out.println(" i am a static class");
    }
}
public class stat {
    public static void main(String[] args) {
        Cat.printInfo();

    }
}
