package homework.lesson6;

public class Computer {
    double cost;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(double cost, String model){
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(double cost, String model, RAM ram, HDD hdd){
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;

    }

    public void returnInfo(){
        System.out.print("Computer cost : " + cost + "\n" + "Computer model: " + model + "\n");
             ram.returnInfo();
             hdd.returnInfo();
    }
}
