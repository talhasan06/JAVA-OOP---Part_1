class Person{
    public String  name;
    protected int age;
    private String address;

    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    Person(){

    }

    void printInfo(){
        System.out.println(this.name+" "+this.age+" "+this.address);
    }

    //setter
    void setAddress(String address){
        this.address=address;
    }
    //getter
    String  getAddress(){
        return address;
    }
}
class Human extends Person{

    void printInfo(){
        System.out.println(this.name+" "+this.age);
    }
}
public class encap {
    public static void main(String[] args) {
        Person p1=new Person("tamim",23,"Khilgaon");
//        p1.printInfo();
        Human h1=new Human();
        h1.printInfo();
    }
}
