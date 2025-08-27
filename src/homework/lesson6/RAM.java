package homework.lesson6;

public class RAM {
    String name;
    int memory;

    public RAM(){
        name = "Test";
        memory = 9;
    };

    public RAM( String name, int memory){
       this.name = name;
       this.memory = memory;
    }

    public void returnInfo(){
        System.out.print("RAM name: " + name + "\n" + "RAM memory: " + memory + "GB" + "\n");
    }
}
