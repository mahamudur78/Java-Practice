package HasTech;

import java.util.Scanner;

public class HasTech {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        // Notification Class
        // dataCheck
        Notification notification = new Notification();
        int foundDataSize = 0;

        // Employee Information
        int arraySize = 1;
        int[] empID = new int[arraySize];
        String[] empName = new String[arraySize];
        String[] empDateOfBirth = new String[arraySize];
        String[] empBloodGroup = new String[arraySize];
        String[] empReligion = new String[arraySize];
        String[] empMaritalStatus = new String[arraySize];
        String[] empEmail = new String[arraySize];
        String[] empJoinedDate = new String[arraySize];
        String[] empSex = new String[arraySize];
        String[] empPhone = new String[arraySize];
        String[] empAdress = new String[arraySize];
        String[] empDepartment = new String[arraySize];
        String[] empNID = new String[arraySize];
        double[] empSalary = new double[arraySize];
        String[] empComment = new String[arraySize];
        // Employee Object Array
        Employee[] employee = new Employee[arraySize];
        //employee[arraySize - 1] = new Employee(0, "", "", "", "", "", "", "", "", "", "", "", "", 0.0,"");

        // Client Information
        int totelClient = 1;

        int[] clientID = new int[totelClient];
        String[] clientName = new String[totelClient];
        String[] clientEmail = new String[totelClient];
        String[] clientPhone = new String[totelClient];
        String[] clientSex = new String[totelClient];
        String[] clientAddress = new String[totelClient];
        String[] clientComment = new String[totelClient];

        // Client Object Array
        Client[] client = new Client[totelClient];

        // Project Information
        int totelProject = 1;
        int[] project_ClientID = new int[totelProject];
        int[] projectID = new int[totelProject];
        String[] projectName = new String[totelProject];
        String[] projectDescriotion = new String[totelProject];
        double[] budget = new double[totelProject];
        int[] assignEmpolyeeID = new int[totelProject];
        boolean[] projectStates = new boolean[totelProject];

        // Project object Array
        Project[] project = new Project[totelProject];

        /*Company Information
        Company ConpanyInfo = new Company();
        System.out.println("Create a new Company.");
        System.out.print("Company Name: ");
        //ConpanyInfo.setCompanyName(src.nextLine());
        System.out.print("Company Address: ");
        //ConpanyInfo.setcompanyAddress(src.nextLine());
        System.out.println();
        System.out.println("Well Done!!!");*/

        /*System.out.println("How many Employee Account do you want to create?");*/
        //int arraySize = 1;
        while (true) {
            System.out.println("### Compony Admin Panel ###  (Enter the SERIAL Value for Following Action)");
            System.out.println("1. Add New Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Add New Project");
            System.out.println("4. View Client");
            System.out.println("5. Project States");
            System.out.println("6. Employee States");
            System.out.println("7. Company Balance");
            System.out.println("8. Salary");
            System.out.println("9. Withdraw");
            System.out.println("10. Deposit");
            System.out.println("11. Internal Transfer");
            System.out.println("12. Exit\n");

            System.out.print("Choose here: ");
            int action = src.nextInt();

            if (action == 1) {
                System.out.println("\n### Please Select your Department...");
                System.out.println("1. Admin");
                System.out.println("2. Developer");
                System.out.println("3. Back");
                System.out.print("\nChoose here: ");
                int chooseDepartment = src.nextInt();
                int chooseDepartmentAction = 0;
                boolean back = true;
                switch (chooseDepartment) {
                    case 1:
                        System.out.println("### Please Select your Designation");
                        System.out.println("1. Chairman");
                        System.out.println("2. Managing Director");
                        System.out.println("3. Senior Admin & Accounts Officer");
                        System.out.println("4. Production Manager");
                        System.out.print("\nChoose here: ");
                        chooseDepartmentAction = src.nextInt();
                        switch (chooseDepartmentAction) {
                            case 1:
                                empDepartment[arraySize - 1] = "Chairman";
                                break;
                            case 2:
                                empDepartment[arraySize - 1] = "Managing Director";
                                break;
                            case 3:
                                empDepartment[arraySize - 1] = "Senior Admin & Accounts Officer";
                                break;
                            case 4:
                                empDepartment[arraySize - 1] = "Production Manager";
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("### Please Select your Designation");
                        System.out.println("1. Senior Software Engineer");
                        System.out.println("2. Software engineer");
                        System.out.println("3. UI UX Designer");
                        System.out.println("4. Web Developer");
                        System.out.println("5. Front end developer");
                        System.out.print("\nChoose here: ");
                        chooseDepartmentAction = src.nextInt();
                        switch (chooseDepartmentAction) {
                            case 1:
                                empDepartment[arraySize - 1] = "Senior Software engineer";
                                break;
                            case 2:
                                empDepartment[arraySize - 1] = "Software engineer";
                                break;
                            case 3:
                                empDepartment[arraySize - 1] = "UI UX Designer";
                                break;
                            case 4:
                                empDepartment[arraySize - 1] = "Web Developer";
                                break;
                            case 5:
                                empDepartment[arraySize - 1] = "Front end developer";
                                break;
                        }
                        break;
                    default:
                        back = false;
                        break;
                }
                if (back == true) {
                    System.out.println("### Employee Information");
                    empID[arraySize - 1] = 100 + arraySize;
                    System.out.println("ID No: " + empID[arraySize - 1]);
                    System.out.print("Name: ");
                    empName[arraySize - 1] = src.nextLine();
                    empName[arraySize - 1] = src.nextLine();
                    System.out.print("Date Of Birth: ");
                    empDateOfBirth[arraySize - 1] = src.nextLine();
                    System.out.println("Sex: ");
                    System.out.println("1. Male");
                    System.out.println("2. Female");
                    System.out.println("Choose here: ");
                    int chooseSex = src.nextInt();
                    switch (chooseSex) {
                        case 1:
                            empSex[arraySize - 1] = "Male";
                            break;
                        case 2:
                            empSex[arraySize - 1] = "Female";
                            break;
                        case 3:
                            empSex[arraySize - 1] = "Custom";
                            break;
                    }

                    System.out.print("NID No: ");
                    empNID[arraySize - 1] = src.nextLine();

                    System.out.println("Blood Group: ");
                    System.out.println("1. A+");
                    System.out.println("2. B+");
                    System.out.println("3. AB+");
                    System.out.println("4. O+");
                    System.out.println("5. A-");
                    System.out.println("6. B-");
                    System.out.println("7. AB-");
                    System.out.println("8. O-");
                    System.out.print("\nChoose here: ");
                    int chooseBloodGroup = src.nextInt();
                    switch (chooseBloodGroup) {
                        case 1:
                            empBloodGroup[arraySize - 1] = "A+";
                            break;
                        case 2:
                            empBloodGroup[arraySize - 1] = "B+";
                            break;
                        case 3:
                            empBloodGroup[arraySize - 1] = "AB+";
                            break;
                        case 4:
                            empBloodGroup[arraySize - 1] = "O+";
                            break;
                        case 5:
                            empBloodGroup[arraySize - 1] = "A-";
                            break;
                        case 6:
                            empBloodGroup[arraySize - 1] = "B-";
                            break;
                        case 7:
                            empBloodGroup[arraySize - 1] = "AB-";
                            break;
                        case 8:
                            empBloodGroup[arraySize - 1] = "O-";
                            break;
                    }
                    System.out.println("Religion: ");
                    System.out.println("1. Islam");
                    System.out.println("2. Christianity");
                    System.out.println("3. Hinduism");
                    System.out.println("4. Buddhism");

                    System.out.print("\nChoose here: ");
                    int chooseReligion = src.nextInt();
                    switch (chooseReligion) {
                        case 1:
                            empReligion[arraySize - 1] = "Islam";
                            break;
                        case 2:
                            empReligion[arraySize - 1] = "Christianity";
                            break;
                        case 3:
                            empReligion[arraySize - 1] = "Hinduism";
                            break;
                        case 4:
                            empReligion[arraySize - 1] = "Buddhism";
                            break;
                    }

                    System.out.println("Marital Status: ");
                    System.out.println("1. Single ");
                    System.out.println("2. Married");
                    System.out.println("3. Separated ");
                    System.out.println("4. Divorced");

                    System.out.print("\nChoose here: ");
                    int chooseMaritalStatus = src.nextInt();
                    switch (chooseMaritalStatus) {
                        case 1:
                            empMaritalStatus[arraySize - 1] = "Single";
                            break;
                        case 2:
                            empMaritalStatus[arraySize - 1] = "Married";
                            break;
                        case 3:
                            empMaritalStatus[arraySize - 1] = "Separated";
                            break;
                        case 4:
                            empMaritalStatus[arraySize - 1] = "Divorced";
                            break;
                    }

                    System.out.print("Email Address: ");
                    empEmail[arraySize - 1] = src.nextLine();
                    empEmail[arraySize - 1] = src.nextLine();
                    System.out.print("Joined Date: ");
                    empJoinedDate[arraySize - 1] = src.nextLine();
                    System.out.print("Mobile: ");
                    empPhone[arraySize - 1] = src.nextLine();
                    System.out.print("Adress: ");
                    empAdress[arraySize - 1] = src.nextLine();
                    System.out.print("Salary: ");
                    empSalary[arraySize - 1] = src.nextDouble();
                    System.out.print("Comment: ");
                    empComment[arraySize - 1] = src.nextLine();
                    empComment[arraySize - 1] = src.nextLine();

                    // Empolyee Tempory Backup Information
                    int[] empID_temp = new int[arraySize + 1];
                    String[] empName_temp = new String[arraySize + 1];
                    String[] empDateOfBirth_temp = new String[arraySize + 1];
                    String[] empBloodGroup_temp = new String[arraySize + 1];
                    String[] empReligion_temp = new String[arraySize + 1];
                    String[] empMaritalStatus_temp = new String[arraySize + 1];
                    String[] empEmail_temp = new String[arraySize + 1];
                    String[] empJoinedDate_temp = new String[arraySize + 1];
                    String[] empSex_temp = new String[arraySize + 1];
                    String[] empPhone_temp = new String[arraySize + 1];
                    String[] empAdress_temp = new String[arraySize + 1];
                    String[] empDepartment_temp = new String[arraySize + 1];
                    String[] empNID_temp = new String[arraySize + 1];
                    double[] empSalary_temp = new double[arraySize + 1];
                    String[] empComment_temp = new String[arraySize + 1];

                    //Employee Temporary Backup Object Array
                    Employee[] employee_temp = new Employee[arraySize + 1];
                    int i = 0;
                    for (i = 0; i < arraySize; i++) {
                        empID_temp[i] = empID[i];
                        empName_temp[i] = empName[i];
                        empDateOfBirth_temp[i] = empDateOfBirth[i];
                        empBloodGroup_temp[i] = empBloodGroup[i];
                        empReligion_temp[i] = empReligion[i];
                        empMaritalStatus_temp[i] = empMaritalStatus[i];
                        empEmail_temp[i] = empEmail[i];
                        empJoinedDate_temp[i] = empJoinedDate[i];
                        empSex_temp[i] = empSex[i];
                        empPhone_temp[i] = empPhone[i];
                        empAdress_temp[i] = empAdress[i];
                        empDepartment_temp[i] = empDepartment[i];
                        empNID_temp[i] = empNID[i];
                        empSalary_temp[i] = empSalary[i];
                        empComment_temp[i] = empComment[i];

                        employee_temp[i] = new Employee(empID_temp[i], empName_temp[i], empDateOfBirth_temp[i], empSex_temp[i],
                                empNID_temp[i], empBloodGroup_temp[i], empReligion_temp[i], empMaritalStatus_temp[i], empEmail_temp[i],
                                empJoinedDate_temp[i], empPhone_temp[i], empAdress_temp[i], empDepartment_temp[i], empSalary_temp[i], empComment_temp[i]);
                    }

                    arraySize++;

                    employee = new Employee[arraySize];
                    empID = new int[arraySize];
                    empName = new String[arraySize];
                    empDateOfBirth = new String[arraySize];
                    empBloodGroup = new String[arraySize];
                    empReligion = new String[arraySize];
                    empMaritalStatus = new String[arraySize];
                    empEmail = new String[arraySize];
                    empJoinedDate = new String[arraySize];
                    empSex = new String[arraySize];
                    empPhone = new String[arraySize];
                    empAdress = new String[arraySize];
                    empDepartment = new String[arraySize];
                    empNID = new String[arraySize];
                    empSalary = new double[arraySize];
                    empComment = new String[arraySize];

                    for (i = 0; i < arraySize - 1; i++) {
                        empID[i] = empID_temp[i];
                        empName[i] = empName_temp[i];
                        empDateOfBirth[i] = empDateOfBirth_temp[i];
                        empBloodGroup[i] = empBloodGroup_temp[i];
                        empReligion[i] = empReligion_temp[i];
                        empMaritalStatus[i] = empMaritalStatus_temp[i];
                        empEmail[i] = empEmail_temp[i];
                        empJoinedDate[i] = empJoinedDate_temp[i];
                        empSex[i] = empSex_temp[i];
                        empPhone[i] = empPhone_temp[i];
                        empAdress[i] = empAdress_temp[i];
                        empDepartment[i] = empDepartment_temp[i];
                        empNID[i] = empNID_temp[i];
                        empSalary[i] = empSalary_temp[i];
                        empComment[i] = empComment_temp[i];

                        employee[i] = new Employee(empID[i], empName[i], empDateOfBirth[i], empSex[i], empNID[i], empBloodGroup[i], empReligion[i], empMaritalStatus[i], empEmail[i], empJoinedDate[i], empPhone[i], empAdress[i], empDepartment[i], empSalary[i], empComment[i]);
                    }

                    //employee[arrayNo - 1] = new Employee(empID, empName, empDateOfBirth, empSex, empNID, empBloodGroup, empReligion, empMaritalStatus, empEmail, empJoinedDate, empPhone, empAdress, empDepartment, empSalary);
                    System.out.println("Employee Add Successful\n");
                }
            } else if (action == 2) {
                //int scarchEmployee = 0;
                System.out.println("### View Employee Details");
                System.out.println("1. by ID");
                System.out.println("2. by Name");
                System.out.println("3. by Department");
                System.out.println("4. by Blood Group");
                System.out.println("5. by Religion");
                System.out.println("6. by Mobile");
                System.out.println("7. by Email");
                System.out.println("8. View All Employee");

                System.out.print("\nChoose here: ");
                int detailsEmployee = src.nextInt();
                if (detailsEmployee == 1) {
                    System.out.print("### Please Enter your Employee ID: ");
                    int scarchEmployee = src.nextInt();

                    for (int i = 0; i <= arraySize; i++) {
                        if (i == arraySize) {
                            System.out.println("\n--------------------------");
                            System.out.println("Employee ID not Found...");
                            System.out.println("--------------------------\n");
                        } else {
                            if (scarchEmployee == employee[i].id) {
                                employee[i].getEmployeeInfo();
                                break;
                            }
                        }
                    }

                    /*System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ID\t Name\t Date of Birth\t Sex\t NID\t Blood Group\t Religion\t Marital\t Email\t Joined Date\t Mobile\t Address\t Salary");
                    for (int i = 0; i < arraySize - 1; i++) {
                        employee[i].getEmployeeInfo();
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------\n");*/
                } else if (detailsEmployee == 2) {
                    System.out.print("### Please Enter your Employee Name to view details:- ");
                    String scarchEmployee = src.nextLine();
                    scarchEmployee = src.nextLine();
                    for (int i = 0; i <= arraySize; i++) {
                        if (i == arraySize) {
                            System.out.println("\n--------------------------");
                            System.out.println("Employee Name not Found...");
                            System.out.println("--------------------------\n");

                        } else {
                            if (scarchEmployee.equalsIgnoreCase(employee[i].name)) {
                                employee[i].getEmployeeInfo();
                            }
                        }
                    }
                } else if (detailsEmployee == 3) {
                    String scarchEmployee = "";
                    System.out.println("### Please Choose your Employee Department to view details:-");

                    System.out.println("1. Admin");
                    System.out.println("2. Developer");
                    System.out.println("3. Back");
                    System.out.print("\nChoose here: ");
                    int chooseDepartment = src.nextInt();
                    int chooseDepartmentAction = 0;

                    switch (chooseDepartment) {
                        case 1:
                            System.out.println("### Please Select your Designation");
                            System.out.println("1. Chairman");
                            System.out.println("2. Managing Director");
                            System.out.println("3. Senior Admin & Accounts Officer");
                            System.out.println("4. Production Manager");
                            System.out.print("\nChoose here: ");
                            chooseDepartmentAction = src.nextInt();
                            switch (chooseDepartmentAction) {
                                case 1:
                                    scarchEmployee = "Chairman";
                                    break;
                                case 2:
                                    scarchEmployee = "Managing Director";
                                    break;
                                case 3:
                                    scarchEmployee = "Senior Admin & Accounts Officer";
                                    break;
                                case 4:
                                    scarchEmployee = "Production Manager";
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("### Please Select your Designation");
                            System.out.println("1. Senior Software Engineer");
                            System.out.println("2. Software engineer");
                            System.out.println("3. UI UX Designer");
                            System.out.println("4. Web Developer");
                            System.out.println("5. Front end developer");
                            System.out.print("\nChoose here: ");
                            chooseDepartmentAction = src.nextInt();
                            switch (chooseDepartmentAction) {
                                case 1:
                                    scarchEmployee = "Senior Software engineer";
                                    break;
                                case 2:
                                    scarchEmployee = "Software engineer";
                                    break;
                                case 3:
                                    scarchEmployee = "UI UX Designer";
                                    break;
                                case 4:
                                    scarchEmployee = "Web Developer";
                                    break;
                                case 5:
                                    scarchEmployee = "Front end developer";
                                    break;
                            }
                            break;
                    }

                    //String scarchEmployee = src.nextLine();
                    for (int i = 0; i <= arraySize; i++) {
                        if (i == arraySize) {
                            System.out.println("\n--------------------------");
                            System.out.println("Empolyee Not Found....");
                            System.out.println("--------------------------\n");
                        } else {
                            if (scarchEmployee.equalsIgnoreCase(employee[i].department)) {
                                employee[i].getEmployeeInfo();
                            }
                        }

                    }
                } else if (detailsEmployee == 4) {
                    System.out.println("### Please choose your blood group to view match all employee:-");
                    String scarchEmployee = "";
                    System.out.println("1. A+");
                    System.out.println("2. B+");
                    System.out.println("3. AB+");
                    System.out.println("4. O+");
                    System.out.println("5. A-");
                    System.out.println("6. B-");
                    System.out.println("7. AB-");
                    System.out.println("8. O-");
                    System.out.print("\nChoose here: ");
                    int chooseBloodGroup = src.nextInt();
                    switch (chooseBloodGroup) {
                        case 1:
                            scarchEmployee = "A+";
                            break;
                        case 2:
                            scarchEmployee = "B+";
                            break;
                        case 3:
                            scarchEmployee = "AB+";
                            break;
                        case 4:
                            scarchEmployee = "O+";
                            break;
                        case 5:
                            scarchEmployee = "A-";
                            break;
                        case 6:
                            scarchEmployee = "B-";
                            break;
                        case 7:
                            scarchEmployee = "AB-";
                            break;
                        case 8:
                            scarchEmployee = "O-";
                            break;
                    }

                    for (int i = 0; i <= arraySize; i++) {

                        if (i == arraySize) {
                            System.out.println("\n--------------------------");
                            System.out.println("Blood Group Does Not Match...");
                            System.out.println("--------------------------\n");
                        } else {
                            if (scarchEmployee.equalsIgnoreCase(employee[i].bloodGroup)) {
                                employee[i].getEmployeeInfo();
                            }
                        }

                    }

                } else if (detailsEmployee == 5) {
                    String scarchEmployee = "";
                    System.out.println("### Please Choose Your Employee Religion to view details:-");
                    System.out.println("1. Islam");
                    System.out.println("2. Christianity");
                    System.out.println("3. Hinduism");
                    System.out.println("4. Buddhism");

                    System.out.print("\nChoose here: ");
                    int chooseReligion = src.nextInt();
                    switch (chooseReligion) {
                        case 1:
                            scarchEmployee = "Islam";
                            break;
                        case 2:
                            scarchEmployee = "Christianity";
                            break;
                        case 3:
                            scarchEmployee = "Hinduism";
                            break;
                        case 4:
                            scarchEmployee = "Buddhism";
                            break;
                    }

                    for (int i = 0; i <= arraySize; i++) {

                        if (i == arraySize) {
                            System.out.println("\n--------------------------");
                            System.out.println("Employee not Found...");
                            System.out.println("--------------------------\n");
                        } else {
                            if (scarchEmployee.equalsIgnoreCase(employee[i].religion)) {
                                employee[i].getEmployeeInfo();
                            }
                        }
                    }
                } else if (detailsEmployee == 6) {
                    System.out.print("### Enter your employee phone number to view details:-");
                    String scarchEmployee = src.nextLine();
                    scarchEmployee = src.nextLine();
                    for (int i = 0; i <= arraySize; i++) {
                        if (i == arraySize) {
                            System.out.println("\n--------------------------");
                            System.out.println("Employee not Found...");
                            System.out.println("--------------------------\n");

                        } else {
                            if (scarchEmployee.equalsIgnoreCase(employee[i].phone)) {
                                employee[i].getEmployeeInfo();
                                break;
                            }
                        }
                    }
                } else if (detailsEmployee == 7) {
                    System.out.print("### Enter your employee Email address to view details :- ");
                    String scarchEmployee = src.nextLine();
                    scarchEmployee = src.nextLine();
                    for (int i = 0; i <= arraySize; i++) {
                        if (i == arraySize) {
                            System.out.println("\n--------------------------");
                            System.out.println("Employee not Found...");
                            System.out.println("--------------------------\n");

                        } else {
                            if (scarchEmployee.equalsIgnoreCase(employee[i].email)) {
                                employee[i].getEmployeeInfo();
                                break;
                            }
                        }
                    }
                } else if (detailsEmployee == 8) {
                    System.out.print("### All Employee to view details:- ");

                    for (int i = 0; i < arraySize - 1; i++) {
                        employee[i].getEmployeeInfo();
                    }

                }
            } else if (action == 3) {
                System.out.println("1. Add New Client");
                System.out.println("2. Existing Client\n");
                System.out.print("Choose Here: ");
                int chooseOption = src.nextInt();

                if (chooseOption == 1) {
                    System.out.println("### Please Add Client Information");
                    System.out.println("ID: " + totelClient);
                    clientID[totelClient - 1] = totelClient;
                    System.out.print("Name: ");
                    clientName[totelClient - 1] = src.nextLine();
                    clientName[totelClient - 1] = src.nextLine();
                    System.out.print("Email: ");
                    clientEmail[totelClient - 1] = src.nextLine();
                    System.out.print("Phone: ");
                    clientPhone[totelClient - 1] = src.nextLine();
                    System.out.println("Sex: ");
                    System.out.print("Choose here: ");
                    int chooseSex = src.nextInt();
                    switch (chooseSex) {
                        case 1:
                            clientSex[totelClient - 1] = "Male";
                            break;
                        case 2:
                            clientSex[totelClient - 1] = "Female";
                            break;
                        case 3:
                            clientSex[totelClient - 1] = "Custom";
                    }

                    System.out.print("Address: ");
                    clientAddress[totelClient - 1] = src.nextLine();
                    System.out.print("Comment: ");
                    clientComment[totelClient - 1] = src.nextLine();

                    // Client Temporary Backup Array
                    int[] clientID_temp = new int[totelClient + 1];
                    String[] clientName_temp = new String[totelClient + 1];
                    String[] clientEmail_temp = new String[totelClient + 1];
                    String[] clientPhone_temp = new String[totelClient + 1];
                    String[] clientSex_temp = new String[totelClient + 1];
                    String[] clientAddress_temp = new String[totelClient + 1];
                    String[] clientComment_temp = new String[totelClient + 1];

                    // Client Temporary BAck Object Array
                    Client[] client_temp = new Client[totelClient];

                    for (int i = 0; i < totelClient; i++) {
                        clientID_temp[i] = clientID[i];
                        clientName_temp[i] = clientName[i];
                        clientEmail_temp[i] = clientEmail[i];
                        clientPhone_temp[i] = clientPhone[i];
                        clientSex_temp[i] = clientSex[i];
                        clientAddress_temp[i] = clientAddress[i];
                        clientComment_temp[i] = clientComment[i];

                        client_temp[i] = new Client(clientID_temp[i], clientName_temp[i], clientEmail_temp[i], clientPhone_temp[i], clientSex_temp[i], clientAddress_temp[i], clientComment_temp[i]);
                    }

                    //Client increase
                    totelClient++;
                    client = new Client[totelClient];

                    clientID = new int[totelClient];
                    clientName = new String[totelClient];
                    clientEmail = new String[totelClient];
                    clientPhone = new String[totelClient];
                    clientSex = new String[totelClient];
                    clientAddress = new String[totelClient];
                    clientComment = new String[totelClient];

                    for (int i = 0; i < totelClient; i++) {
                        clientID[i] = clientID_temp[i];
                        clientName[i] = clientName_temp[i];
                        clientEmail[i] = clientEmail_temp[i];
                        clientPhone[i] = clientPhone_temp[i];
                        clientSex[i] = clientSex_temp[i];
                        clientAddress[i] = clientAddress_temp[i];
                        clientComment[i] = clientComment_temp[i];

                        client[i] = new Client(clientID[i], clientName[i], clientEmail[i], clientPhone[i], clientSex[i], clientAddress[i], clientComment[i]);
                    }
                    System.out.println("Client Add Successful\n");
                } else if (chooseOption == 2) {

                    System.out.println("### Please Add Project information Details");
                    System.out.print("Existing Client ID: ");
                    project_ClientID[totelProject - 1] = src.nextInt();
                    System.out.print("Project ID: ");
                    projectID[totelProject - 1] = src.nextInt();
                    System.out.print("Project Name: ");
                    projectName[totelProject - 1] = src.nextLine();
                    projectName[totelProject - 1] = src.nextLine();
                    System.out.print("Project Description: ");
                    projectDescriotion[totelProject - 1] = src.nextLine();
                    System.out.print("Project Budget: ");
                    budget[totelProject - 1] = src.nextDouble();
                    System.out.println("### Assign for Employee");
                    System.out.print("Employee ID: ");
                    assignEmpolyeeID[totelProject - 1] = src.nextInt();

                    System.out.print("Project States: ");
                    projectStates[totelProject - 1] = src.nextBoolean();

                    int[] project_ClientID_temp = new int[totelProject + 1];
                    int[] projectID_temp = new int[totelProject + 1];
                    String[] projectName_temp = new String[totelProject + 1];
                    String[] projectDescriotion_temp = new String[totelProject + 1];
                    double[] budget_temp = new double[totelProject + 1];
                    int[] assignEmpolyeeID_temp = new int[totelProject + 1];
                    boolean[] projectStates_temp = new boolean[totelProject + 1];

                    Project[] project_temp = new Project[totelProject + 1];

                    for (int i = 0; i < totelProject; i++) {
                        project_ClientID_temp[i] = project_ClientID[i];
                        projectID_temp[i] = projectID[i];
                        projectName_temp[i] = projectName[i];
                        projectDescriotion_temp[i] = projectDescriotion[i];
                        budget_temp[i] = budget[i];
                        assignEmpolyeeID_temp[i] = assignEmpolyeeID[i];
                        projectStates_temp[i] = projectStates[i];
                        project_temp[i] = new Project(project_ClientID_temp[i], projectID_temp[i], projectName_temp[i], projectDescriotion_temp[i], budget_temp[i], assignEmpolyeeID_temp[i], projectStates_temp[i]);

                    }

                    totelProject++;

                    project_ClientID = new int[totelProject];
                    projectID = new int[totelProject];
                    projectName = new String[totelProject];
                    projectDescriotion = new String[totelProject];
                    budget = new double[totelProject];
                    assignEmpolyeeID = new int[totelProject];
                    projectStates = new boolean[totelProject];

                    project = new Project[totelProject];

                    for (int i = 0; i < totelProject; i++) {
                        project_ClientID[i] = project_ClientID_temp[i];
                        projectID[i] = projectID_temp[i];
                        projectName[i] = projectName_temp[i];
                        projectDescriotion[i] = projectDescriotion_temp[i];
                        budget[i] = budget_temp[i];
                        assignEmpolyeeID[i] = assignEmpolyeeID_temp[i];
                        projectStates[i] = projectStates_temp[i];
                        project[i] = new Project(project_ClientID[i], projectID[i], projectName[i], projectDescriotion[i], budget[i], assignEmpolyeeID[i], projectStates[i]);

                    }

                }

            } else if (action == 4) {
                int chooseOption;
                System.out.println("### View Client Details");
                System.out.println("1. by ID");
                System.out.println("2. by Name");
                System.out.println("3. by Email");
                System.out.println("4. by Mobile");
                System.out.println("5. View All Client");

                System.out.print("Choose here: ");
                chooseOption = src.nextInt();
                if (chooseOption == 1) {
                    int clientID_Details;
                    System.out.print("\nPlease Enter your Client ID to view details: ");
                    clientID_Details = src.nextInt();

                    for (int i = 0; i <= totelClient - 1; i++) {
                        if (client[i].id == clientID_Details) {
                            client[i].getClientInfo();
                            notification.setDataCheck(true);
                            foundDataSize++;
                        }
                    }

                    notification.getDataNotFound("ID", foundDataSize);
                    foundDataSize = 0;
                } else if (chooseOption == 2) {
                    String clientName_Details;
                    System.out.print("Please Enter your Client Name to view details: ");
                    clientName_Details = src.nextLine();
                    clientName_Details = src.nextLine();

                    for (int i = 0; i < totelClient - 1; i++) {
                        if (client[i].name.equalsIgnoreCase(clientName_Details)) {
                            client[i].getClientInfo();
                            notification.setDataCheck(true);
                            foundDataSize++;
                        }
                    }
                    notification.getDataNotFound("Name", foundDataSize);
                    foundDataSize = 0;

                } else if (chooseOption == 3) {
                    String clientEmail_Details;
                    System.out.print("Please Enter your Client Email to view details: ");
                    clientEmail_Details = src.nextLine();
                    clientEmail_Details = src.nextLine();

                    for (int i = 0; i < totelClient - 1; i++) {
                        if (client[i].email.equalsIgnoreCase(clientEmail_Details)) {
                            client[i].getClientInfo();
                            notification.setDataCheck(true);
                            foundDataSize++;
                        }
                    }
                    notification.getDataNotFound("Email", foundDataSize);
                    foundDataSize = 0;

                } else if (chooseOption == 4) {
                    String clientPhone_Details;
                    System.out.print("Please Enter your Client Phone Number to view details: ");
                    clientPhone_Details = src.nextLine();
                    clientPhone_Details = src.nextLine();

                    for (int i = 0; i < totelClient - 1; i++) {
                        if (client[i].phone.equalsIgnoreCase(clientPhone_Details)) {
                            client[i].getClientInfo();
                            notification.setDataCheck(true);
                            foundDataSize++;
                        }
                    }
                    notification.getDataNotFound("Phone Number", foundDataSize);
                    foundDataSize = 0;

                } else if (chooseOption == 5) {

                    System.out.print("Please Enter your Client Phone Number to view details: ");

                    for (int i = 0; i < totelClient - 1; i++) {
                        client[i].getClientInfo();
                        notification.setDataCheck(true);
                        foundDataSize++;
                    }

                    notification.getDataNotFound("", foundDataSize);
                    foundDataSize = 0;

                } else {
                    System.out.println("You have typed the wrong number.../n");
                }

            } else if (action == 5) {
                int chooseOption;
                System.out.println("### Project States");
                System.out.println("1. Pending Project");
                System.out.println("2. Done Project");
                System.out.println("3. All Project");
                System.out.print("\nChoose hare: ");
                chooseOption = src.nextInt();

                if (chooseOption == 1) {

                    for (int i = 0; i < totelProject - 1; i++) {
                        if (project[i].projectStates == false) {
                            project[i].getProjectInfo();
                        }
                    }
                } else if (chooseOption == 2) {
                    for (int i = 0; i < totelProject - 1; i++) {
                        if (project[i].projectStates == true) {
                            project[i].getProjectInfo();
                        }
                    }
                } else if (chooseOption == 3) {
                    for (int i = 0; i < totelProject - 1; i++) {
                        project[i].getProjectInfo();
                    }
                }
            }
        }
    }
}
