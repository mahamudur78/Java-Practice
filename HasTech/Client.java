package HasTech;

public class Client extends Human{
    //id, name, email, phone, sex, comment
    
    public Client(int id, String name, String email, String phone, String sex, String address, String comment){
        super(id, name, email, phone, sex, address, comment);
    }
    
    public void getClientInfo(){
        System.out.println("\n--------------------------");
        System.out.println("## View Client Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("phone No: " + phone);
        System.out.println("Sex: " + sex);
        System.out.println("Address: " + address);
        System.out.println("Comment: " + comment);
        System.out.println("--------------------------\n");
        
    }
}
