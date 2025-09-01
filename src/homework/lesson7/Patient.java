package homework.lesson7;

public class Patient {
    private String name;
    private int age;
    TreatmentPlan plan;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPlan(TreatmentPlan plan) {
        this.plan = plan;
    }

    public void assignDoctorAndTreat() {
        if (plan == null) {
            System.out.println("Cannot assign doctor, no treatment plan available");
            return;
        }
        Doctor doctor; //храним назначенного доктора

        switch (plan.getCode()) {
            case 1:
                System.out.println("Your doctor - Surgeon");
                doctor = new Surgeon();
                break;
            case 2:
                System.out.println("Your doctor - Dentist");
                doctor = new Dentist();
                break;
            default:
                doctor = new Therapist();
                System.out.println("Your doctor - Therapist");
        }
        doctor.treat();
    }
}