package homework.lesson7;

public class MyMain {
    public static void main(String[] args) {

        Phone first = new Phone("+37529564738293", "Iphone16", 170.12);
        Phone second = new Phone("+37533564738293", "Samsung14", 150);
        Phone third = new Phone("+48986438172", "IphoneSE", 200);

        System.out.println("FIRST PHONE: " + "\n" + "Phone number: " + first.getNumber() + "\n" + "Phone model: "
                + first.getModel() + "\n" + "Phone weight: " + first.getWeight() + " grams");
        System.out.println(".".repeat(50));
        System.out.println("SECOND PHONE: " + "\n" + "Phone number: " + second.getNumber() + "\n" + "Phone model: "
                + second.getModel() + "\n" + "Phone weight: " + second.getWeight() + " grams");
        System.out.println(".".repeat(50));
        System.out.println("THIRD PHONE: " + "\n" + "Phone number: " + third.getNumber() + "\n" + "Phone model: " +
                third.getModel() + "\n" + "Phone weight: " + third.getWeight() + " grams");
        System.out.println();

        first.getNumber();
        first.recieveCall("Nastya");

        second.getNumber();
        second.recieveCall("Darya");

        third.getNumber();
        third.recieveCall("Grisha");

        first.recieveCall("Darya", first);
        second.recieveCall("Nastya", second);
        third.recieveCall("Tanya", third);

        first.SendMessage(first.getNumber(), second.getNumber(), third.getNumber());

        // TASK 2

        Patient One = new Patient("Grisha", 12);
        TreatmentPlan one = new TreatmentPlan(1);
        TreatmentPlan two = new TreatmentPlan(2);
        TreatmentPlan three = new TreatmentPlan(3);
        System.out.println(".".repeat(50));
        One.setPlan(one);
        One.assignDoctorAndTreat();
    }
}
