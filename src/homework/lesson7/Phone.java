package homework.lesson7;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void recieveCall(String name) {
        System.out.println(name + " " + "is calling!");
    }

    void recieveCall(String name, Phone number) {
    }

    public void SendMessage(String... number) {
        System.out.println(".".repeat(50));
        System.out.println("Sending message to: ");
        for (String num : number) {
            System.out.println(num);
        }
    }
}

