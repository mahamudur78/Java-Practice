package HasTech;

public class Employee extends Human {

    //id, name, email, phone, sex

    String dateOfBirth, bloodGroup, religion, maritalStatus, joinedDate, department;
    String NID;
    double salary;

    public Employee(int id, String name, String dateOfBirth, String sex, String NID, String bloodGroup, String religion, String maritalStatus, String email, String joinedDate, String phone, String address, String department, double salary, String comment) {
        super(id, name, email, phone, sex, address, comment);
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.NID = NID;
        this.bloodGroup = bloodGroup;
        this.religion = religion;
        this.maritalStatus = maritalStatus;
        this.joinedDate = joinedDate;
        this.department = department;
        this.salary = salary;
    }

    public void getEmployeeInfo() {
        System.out.println("\n--------------------------");
        System.out.println("### Employee Information");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Sex: " + sex);
        System.out.println("NID No: " + NID);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Religion: " + religion);
        System.out.println("Marital Status: " + maritalStatus);
        System.out.println("Email: " + email);
        System.out.println("Joined Date: " + joinedDate);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Comment: " + comment);
        System.out.println("--------------------------\n");
    }

    public void getEmployeeInfoList() {
        System.out.println(id + "\t" + name + "\t" + dateOfBirth + "\t" + sex + "\t" + NID + "\t" + bloodGroup + "\t" + religion + maritalStatus + "\t" + email + "\t" + joinedDate + "\t" + phone + "\t" + address + "\t" + department + "\t" + salary);
    }

}
