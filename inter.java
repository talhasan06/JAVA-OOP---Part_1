interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    String make;
    String model;
    boolean isRunning;

    Car(String make,String model){
        this.make=make;
        this.model=model;
    }

    public void start(){
        isRunning = true;
        System.out.println(make + " " + model + " is starting.");
    }
    public void stop() {
        isRunning = false;
        System.out.println(make + " " + model + " is stopping.");
    }
}


public class inter {
    public static void main(String[] args) {

    }
}
