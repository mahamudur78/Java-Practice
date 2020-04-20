
package LinkList;
import java.util.LinkedList;
public class Student {
    LinkedList<Student> StudentList = new LinkedList<Student>();
    String name, className;
    int id;
    
    Student(int id, String name, String className){
        this.id = id;
        this.name = name;
        this.className = className;
    }
    
}
