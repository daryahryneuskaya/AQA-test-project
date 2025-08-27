package homework.lesson6;

public class HDD {

    String name;
    int memory;
    String type;

    public HDD(){
        name = "Test";
        memory= 7;
        type = "external";
        };

    public HDD(String name, int memory, String type ){
        this.memory = memory;
        this.type = type;
        this.name = name;
    }

    public void returnInfo(){
        System.out.print("HDD name: " + name + "\n" + "HDD memory: " + memory + "GB" + "\n" + "HDD type: " + type +
                "\n");
    }
}
