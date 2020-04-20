package String.toString;

public class Test {
    public static void main(String[] args){
        Person p1 = new Person("Mahamudur", 29);
        Person p2 = new Person("Mahamudur", 22);
        
        System.out.println(p1);
        System.out.println(p2);
        
        String p3 = "Mahamudur";
        String p4 = "Mahamudur";
        
        System.out.println(p1.name.equals(p2.name));
    }
}
