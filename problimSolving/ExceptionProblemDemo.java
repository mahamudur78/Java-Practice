
package problimSolving;
import java.util.Scanner;
public class ExceptionProblemDemo {
    public static void main(String[] args){
        boolean check = true;
        while(check){
            try{
                Scanner src = new Scanner(System.in);
                System.out.print("Please enter num1: ");
                int num1 = src.nextInt();
                System.out.print("Please enter num2: ");
                int num2 = src.nextInt();
                int result = num1/num2;
                System.out.println("Result:"+num1+"/"+num2+" = " + result);
                check = false;
            }catch(Exception e){
                System.out.println();
                System.out.println("Exception: " + e);
                System.out.println("Your must enter integer. please try again");
            }
        }
    }
    
}
