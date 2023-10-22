class Student{
    String name;
    int age;
    //constructor
     Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //copy constructor
     Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    //default constructor
     Student(){

    }
    void printInfo(){
        System.out.println(this.name +" "+this.age);
    }
}
public class prac1 {
    public static void main(String[] args) {
        Student s1=new Student("tamim",23);
        s1.printInfo();
        Student s2 =new Student(s1);
        s2.printInfo();
    }
}