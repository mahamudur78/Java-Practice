package Test;

public class ArraylistDemo {
    int id;
    String name;
    
    public ArraylistDemo(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void getInformation(){
        System.out.println(id + "\t" + name);
    }
}
