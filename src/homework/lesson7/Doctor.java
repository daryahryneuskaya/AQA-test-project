package homework.lesson7;

public abstract class Doctor {
    private String name;
    private String surname;
    private String type; //surgeon, therapist, dentist

    public abstract void treat();

    public String getName() {
        return name;
    }
}
