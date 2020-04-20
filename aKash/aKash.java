package aKash;

import java.util.Scanner;

public class aKash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("                    ****         ****                                      ****");
        System.out.println("                    ****        ****                                       ****");
        System.out.println("                    ****       ****                                        ****");
        System.out.println("                    ****      ****                                         ****");
        System.out.println("                    ****     ****                                          ****");
        System.out.println("              ****  ****   ****                       ****      *****      ****");
        System.out.println("   ********   ****  **** ****              ********   ****    *********    ****      *******");
        System.out.println("  *********** ****  ********              *********** ****  *****     ***  ****    ***    ***");
        System.out.println("****       *******  **** ****           ****       *******  ***            ****  ***        ***");
        System.out.println("***         ******  ****  ****          ***         ******  ****           *******          ***");
        System.out.println("***          *****  ****   ****         ***          *****   ***********   ******           ***");
        System.out.println("**           *****  ****    ****        **            ****    **********   *****            ***");
        System.out.println("**           *****  ****     ****       **            ****    ***********  ****             ***");
        System.out.println("***         ******  ****      ****      ***          *****           ****  ****             ***");
        System.out.println("****       *******  ****       ****     *****       ******            ***  ****             ***");
        System.out.println(" *****************  ****        ****     *****************   *      ****   ****             ***");
        System.out.println("  *******     ****  ****         ****     *******     ****    *********    ****             ***");
        System.out.println("              ****  ****          ****                ****      ******     ****             ***");
        System.out.println();
        System.out.println("***********************************************************************************************");
        System.out.println("*                              Welcome to aKash Financial Service                             *");
        System.out.println("***********************************************************************************************");
        System.out.println();
        System.out.println("How many aKash Accounts do you want to Create?");
        int q = sc.nextInt();
        int[] x = new int[q];
        String[] y = new String[q];
        double[] z = new double[q];
        BankAccount[] accounts = new BankAccount[q];
        System.out.println();
        System.out.println("Well Done!! Now Start Enter The Account Detais. Each account requires an Account ID, Account Holder's Name & Balance.");
        System.out.println();
        int details = 0;

        for (i = 0; i < q; i++) {
            accounts[i] = new BankAccount(0, "", 0.0);
        }

        for (int c = 0; c < q; c++) {
            if (c == 0) {
                System.out.println((c + 1) + ". Enter Account ID for 1st account");
                x[c] = sc.nextInt();
                System.out.println((c + 1) + ". Enter Account Holder's Name for 1st account");
                sc.nextLine();
                y[c] = sc.nextLine();
                System.out.println((c + 1) + ". Enter Balance for 1st account");
                z[c] = sc.nextDouble();
                accounts[c].ID = x[c];
                accounts[c].name = y[c];
                accounts[c].balance = z[c];
            } else if (c == 1) {
                System.out.println((c + 1) + ". Enter Account ID for 2nd account");
                x[c] = sc.nextInt();
                System.out.println((c + 1) + ". Enter Account Holder's Name for 2nd account");
                sc.nextLine();
                y[c] = sc.nextLine();
                System.out.println((c + 1) + ". Enter Balance for 2nd account");
                z[c] = sc.nextDouble();
                accounts[c].ID = x[c];
                accounts[c].name = y[c];
                accounts[c].balance = z[c];
            } else if (c == 2) {
                System.out.println((c + 1) + ". Enter Account ID for 3rd account");
                x[c] = sc.nextInt();
                System.out.println((c + 1) + ". Enter Account Holder's Name for 3rd account");
                sc.nextLine();
                y[c] = sc.nextLine();
                System.out.println((c + 1) + ". Enter Balance for 3rd account");
                z[c] = sc.nextDouble();
                accounts[c].ID = x[c];
                accounts[c].name = y[c];
                accounts[c].balance = z[c];
            } else {
                System.out.println((c + 1) + ". Enter Account ID for " + (c + 1) + "th account");
                x[c] = sc.nextInt();
                System.out.println((c + 1) + ". Enter Account Holder's Name for " + (c + 1) + "th account");
                sc.nextLine();
                y[c] = sc.nextLine();
                System.out.println((c + 1) + ". Enter Balance for " + (c + 1) + "th account");
                z[c] = sc.nextDouble();
                accounts[c].ID = x[c];
                accounts[c].name = y[c];
                accounts[c].balance = z[c];
            }
        }
        System.out.println();
        System.out.println("*** Well Done!!! You have entered details of " + q + " accounts ***");
        System.out.println();

        while (1 == 1) {
            System.out.println("### aKash Admin Panel ###  (Enter the SERIAL Value for Following Action)");
            System.out.println("1. Add New Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Internal Transfer");
            System.out.println("6. Exit");
            int action = sc.nextInt();
            if (action == 1) {
                q = q + 1;
                int[] x_demo = new int[q];
                String[] y_demo = new String[q];
                double[] z_demo = new double[q];
                BankAccount[] accounts_demo = new BankAccount[q];
                for (i = 0; i < (q - 1); i++) {
                    x_demo[i] = x[i];
                    y_demo[i] = y[i];
                    z_demo[i] = z[i];
                    accounts_demo[i] = accounts[i];
                }

                accounts_demo[i] = new BankAccount(0, "", 0.0);

                if (q == 1) {
                    System.out.println(q + ". Enter Account ID for 1st account");
                    x_demo[(q - 1)] = sc.nextInt();
                    System.out.println(q + ". Enter Account Holder's Name for 1st account");
                    sc.nextLine();
                    y_demo[(q - 1)] = sc.nextLine();
                    System.out.println(q + ". Enter Balance for 1st account");
                    z_demo[(q - 1)] = sc.nextDouble();
                } else if (q == 2) {
                    System.out.println(q + ". Enter Account ID for 2nd account");

                    x_demo[(q - 1)] = sc.nextInt();
                    System.out.println(q + ". Enter Account Holder's Name for 2nd account");
                    sc.nextLine();
                    y_demo[(q - 1)] = sc.nextLine();
                    System.out.println(q + ". Enter Balance for 2nd account");
                    z_demo[(q - 1)] = sc.nextDouble();
                } else if (q == 3) {
                    System.out.println(q + ". Enter Account ID for 3rd account");
                    x_demo[(q - 1)] = sc.nextInt();
                    System.out.println(q + ". Enter Account Holder's Name for 3rd account");
                    sc.nextLine();
                    y_demo[(q - 1)] = sc.nextLine();
                    System.out.println(q + ". Enter Balance for 3rd account");
                    z_demo[(q - 1)] = sc.nextDouble();
                } else {
                    System.out.println(q + ". Enter Account ID for " + q + "th account");
                    System.out.println(q + ". Enter ID");
                    x_demo[(q - 1)] = sc.nextInt();
                    System.out.println(q + ". Enter Account Holder's Name for " + q + "th account");
                    sc.nextLine();
                    y_demo[(q - 1)] = sc.nextLine();
                    System.out.println(q + ". Enter Balance for " + q + "th account");
                    z_demo[(q - 1)] = sc.nextDouble();
                }
                accounts_demo[i].ID = x_demo[(q - 1)];
                accounts_demo[i].name = y_demo[(q - 1)];
                accounts_demo[i].balance = z_demo[(q - 1)];

                x = x_demo;
                y = y_demo;
                z = z_demo;
                accounts = accounts_demo;

                System.out.println("Entry Successful!!! Details is Here -");
                System.out.println();
                System.out.println("ID:  Account Holder's Name =  Balance");
                System.out.println("--------------------------------------");
                System.out.println(accounts[q - 1].ID + ": " + accounts[q - 1].name + " = " + accounts[q - 1].balance);
                System.out.println("-------------------------------------");
                System.out.println();

            } else if (action == 2) {
                System.out.println("  ## View Account Details -");
                System.out.println("1. by Serial");
                System.out.println("2. by ID");
                System.out.println("3. by Name");
                System.out.println("4. View All Accounts");
                details = sc.nextInt();
                if (details == 1) {
                    System.out.println("# Enter Serial to view detais -");
                    int det_ser = sc.nextInt();
                    if (det_ser <= q && det_ser >= 0) {
                        System.out.println();
                        System.out.println("ID:  Account Holder's Name =  Balance");
                        System.out.println("--------------------------------------");
                        System.out.println(accounts[(det_ser) - 1].ID + ": " + accounts[(det_ser) - 1].name + " = " + accounts[(det_ser) - 1].balance);
                        System.out.println("----------------------------------");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("------------------");
                        System.out.println("Invalid Serial!!! Try Again");
                        System.out.println("------------------");
                        System.out.println();
                    }
                } else if (details == 2) {
                    System.out.println("# Enter ID to view detais -");
                    int det_id = sc.nextInt();
                    for (int search_id = 0; search_id < q; search_id++) {
                        if (det_id == accounts[search_id].ID) {
                            System.out.println();
                            System.out.println("ID:  Account Holder's Name =  Balance");
                            System.out.println("--------------------------------------");
                            System.out.println(accounts[search_id].ID + ": " + accounts[search_id].name + " = " + accounts[search_id].balance);
                            System.out.println("--------------------------------");
                            System.out.println();
                        }
                    }
                } else if (details == 3) {
                    System.out.println("# Enter Account Holder's Name to view detais -");
                    sc.nextLine();
                    String acName = sc.nextLine();
                    for (int search_id = 0; search_id < q; search_id++) {
                        if ((accounts[search_id].name).equals(acName)) {
                            System.out.println();
                            System.out.println("ID:  Account Holder's Name =  Balance");
                            System.out.println("--------------------------------------");
                            System.out.println(accounts[search_id].ID + ": " + accounts[search_id].name + " = " + accounts[search_id].balance);
                            System.out.println("--------------------------------");
                            System.out.println();
                        }
                    }
                } else if (details == 4) {
                    int m = 0;
                    System.out.println();
                    System.out.println("ID:  Account Holder's Name =  Balance");
                    System.out.println("--------------------------------------");
                    for (m = 0; m < q; m++) {
                        System.out.println(accounts[m].ID + ": " + accounts[m].name + " = " + accounts[m].balance);
                    }
                    System.out.println();
                    System.out.println("Total " + m + " Accounts");
                    System.out.println();
                }
            } else if (action == 3) {
                System.out.println("# Enter Account's ID to Deposit -");
                int dep_id = sc.nextInt();
                int search_id = 0;
                boolean check_dep = true;
                for (search_id = 0; search_id < q; search_id++) {
                    if (dep_id == accounts[search_id].ID) {
                        check_dep = false;
                        System.out.println("Account Found! Account Details Here - ");
                        System.out.println("ID:  Account Holder's Name =  Balance");
                        System.out.println("--------------------------------------");
                        System.out.println(accounts[search_id].ID + ": " + accounts[search_id].name + " = " + accounts[search_id].balance);
                        System.out.println("----------------------------------");
                        System.out.println("# Enter Deposit Amount Here -");
                        double acdeposit = sc.nextDouble();
                        accounts[search_id].deposit(acdeposit);
                        System.out.println("Deposit Successful! Updated Statement here -");
                        System.out.println("ID:  Account Holder's Name =  Balance");
                        System.out.println("--------------------------------------");
                        System.out.println(accounts[search_id].ID + ": " + accounts[search_id].name + " = " + accounts[search_id].balance);
                        System.out.println();
                    }

                }
                if (search_id == q && check_dep) {
                    System.out.println("Wrong Account ID! Try Again");
                    System.out.println();
                }
            } else if (action == 4) {
                System.out.println("# Enter Account's ID to Withdraw -");
                int wit_id = sc.nextInt();
                int search_id = 0;
                boolean check = true;
                for (search_id = 0; search_id < q; search_id++) {
                    if (wit_id == accounts[search_id].ID) {
                        System.out.println("Account Found! Account Details Here - ");
                        System.out.println();
                        System.out.println("ID:  Account Holder's Name =  Balance");
                        System.out.println("--------------------------------------");
                        System.out.println(accounts[search_id].ID + ": " + accounts[search_id].name + " = " + accounts[search_id].balance);
                        System.out.println("------------------");
                        System.out.println("# Enter Withdraw Amount Here -");
                        double acwithdraw = sc.nextDouble();
                        if (((accounts[search_id].balance) - acwithdraw) < 0) {
                            System.out.println();
                            System.out.println("Withdraw Amount cannot be greater than Account Balance!!! Try Again.");
                            System.out.println();
                            check = false;
                        } else {
                            accounts[search_id].withdraw(acwithdraw);
                            System.out.println("Withdraw Successful! Updated Statement here -");
                            System.out.println();
                            System.out.println("ID:  Account Holder's Name =  Balance");
                            System.out.println("--------------------------------------");
                            System.out.println(accounts[search_id].ID + ": " + accounts[search_id].name + " = " + accounts[search_id].balance);
                            System.out.println();
                            check = false;
                        }
                    }
                }
                if (search_id == q && check) {
                    System.out.println("Wrong Account ID! Try Again");
                    System.out.println();
                }
            } else if (action == 5) {
                int sender_id = 0;
                int receiver_id = 0;
                while (2 == 2) {
                    System.out.println("# Enter Sender's Account ID -");
                    sender_id = sc.nextInt();
                    System.out.println("# Enter Receiver's Account ID -");
                    receiver_id = sc.nextInt();
                    if (sender_id == receiver_id) {
                        System.out.println("Sender's & Receiver's ID can never be same!!! Try Again.");
                    } else {
                        break;
                    }
                }
                boolean check_send = true;
                boolean check_rec = true;
                int send_id = 0;
                int rec_id = 0;
                for (send_id = 0; send_id < q; send_id++) {
                    if (sender_id == accounts[send_id].ID) {
                        check_send = false;
                        for (rec_id = 0; rec_id < q; rec_id++) {
                            if (receiver_id == accounts[rec_id].ID) {
                                check_rec = false;
                                System.out.println("# Before Internal Transfer -");
                                System.out.println();
                                System.out.println("ID:  Account Holder's Name =  Balance");
                                System.out.println("--------------------------------------");
                                System.out.println("Sender's Account Details- " + accounts[send_id].ID + ": " + accounts[send_id].name + " = " + accounts[send_id].balance);
                                System.out.println("Receiver's Account Details- " + accounts[rec_id].ID + ": " + accounts[rec_id].name + " = " + accounts[rec_id].balance);
                                System.out.println("------------------");
                                System.out.println();
                                System.out.println("Enter Transfer Amount");
                                double transfer = sc.nextDouble();
                                if (((accounts[send_id].balance) - transfer) < 0) {
                                    System.out.println();
                                    System.out.println("Transfer Amount cannot be greater than Sender's Account Balance!!! Try Again.");
                                    System.out.println();
                                } else {
                                    accounts[send_id].transfer_sub(transfer);
                                    accounts[rec_id].transfer_add(transfer);
                                    System.out.println("Transaction Successful!!!");
                                    System.out.println("# After Internal Transfer -");
                                    System.out.println();
                                    System.out.println("ID:  Account Holder's Name =  Balance");
                                    System.out.println("--------------------------------------");
                                    System.out.println("Sender's Account Details- " + accounts[send_id].ID + ": " + accounts[send_id].name + " = " + accounts[send_id].balance);
                                    System.out.println("Receiver's Account Details- " + accounts[rec_id].ID + ": " + accounts[rec_id].name + " = " + accounts[rec_id].balance);
                                    System.out.println("------------------");
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
                if (send_id == q && check_send) {
                    System.out.println("Wrong Sender ID! Try again");
                } else if (rec_id == q && check_rec) {
                    System.out.println("Wrong Receiver ID! Try again");
                }
            } else if (action == 6) {
                System.out.println("Thank You for using aKash");
                break;
            }
        }
        System.out.println("                    ****         ****                                      ****");
        System.out.println("                    ****        ****                                       ****");
        System.out.println("                    ****       ****                                        ****");
        System.out.println("                    ****      ****                                         ****");
        System.out.println("                    ****     ****                                          ****");
        System.out.println("              ****  ****   ****                       ****      *****      ****");
        System.out.println("   ********   ****  **** ****              ********   ****    *********    ****      *******");
        System.out.println("  *********** ****  ********              *********** ****  *****     ***  ****    ***    ***");
        System.out.println("****       *******  **** ****           ****       *******  ***            ****  ***        ***");
        System.out.println("***         ******  ****  ****          ***         ******  ****           *******          ***");
        System.out.println("***          *****  ****   ****         ***          *****   ***********   ******           ***");
        System.out.println("**           *****  ****    ****        **            ****    **********   *****            ***");
        System.out.println("**           *****  ****     ****       **            ****    ***********  ****             ***");
        System.out.println("***         ******  ****      ****      ***          *****           ****  ****             ***");
        System.out.println("****       *******  ****       ****     *****       ******            ***  ****             ***");
        System.out.println(" *****************  ****        ****     *****************   *      ****   ****             ***");
        System.out.println("  *******     ****  ****         ****     *******     ****    *********    ****             ***");
        System.out.println("              ****  ****          ****                ****      ******     ****             ***");
    }
}
