package LinkList;

import java.util.LinkedList;
import java.util.Scanner;
public class LinkListDemoTest {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        boolean check = true;
        LinkedList<Student> list = new LinkedList<Student>();
        int i = 0;
        int id;
        String name, className;
        while(check){
            System.out.print("ID: ");
            id = src.nextInt();
            System.out.print("Name: ");
            name = src.nextLine();
            name = src.nextLine();
            System.out.print("Class: ");
            className = src.nextLine();
            Student s = new Student(id,name, className);
            list.add(s);
             
            System.out.println("If you add another Student. Please type 1 or not Type 0");
            i = src.nextInt();
            System.out.println();
            if(0 == i){
                check = false;
            }
        }

        for(Student s: list){
            System.out.println("ID: "+ s.id + "\nName: " + s.name + "\nClass: " + s.className + "\n");
            
        }
    }
}
