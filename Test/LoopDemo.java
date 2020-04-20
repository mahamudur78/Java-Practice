package Test;

import java.util.Scanner;

public class LoopDemo {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int size = 1;
        ArraylistDemo[] list = new ArraylistDemo[size];
        int [] x = new int[size];
        String [] y = new String[size];
        
        list[size-1] = new ArraylistDemo(0, "");

        int action = 0;
        
        while (true) {
            System.out.println("1. Add list");
            System.out.println("2. View List");
            System.out.print("Choos Here: ");
            action = src.nextInt();
            if (action == 1) {
                
                
                
                System.out.print("ID: ");
                x[size-1] = src.nextInt();
                System.out.print("Name: ");
                y[size-1] = src.nextLine();
                y[size-1] = src.nextLine();
                
                
                int i = 0; 
                int [] x_demo = new int[size+1];
                String [] y_demo = new String[size+1];
                ArraylistDemo[] list_demo = new ArraylistDemo[size + 1];
                for(i = 0; i < size; i++){
                   x_demo[i] = x[i];
                   y_demo[i] = y[i];
                   list_demo[i] = new ArraylistDemo(x_demo[i], y_demo[i]);
                }
                
                size++;
                list = new ArraylistDemo[size];
                 x = new int[size];
                 y = new String[size];
                for(i = 0; i < size; i++){
                   x[i] = x_demo[i];
                   y[i] = y_demo[i] ;
                   list[i] = new ArraylistDemo(x[i], y[i]);
                }
                
              
            }else if(action == 2){
                System.out.println("ID" + "\tName");
                for(int i = 0; i < size-1; i++){
                   list[i].getInformation();
                }
            }

        }

        /*int[] array = {100,200};
        int [] arrayDemo = new int[2];
        int i = 0;
        System.out.println("Array: "+ array.length);
        for (int size : array) {
            System.out.print( size + " ");
            arrayDemo[i++] = size;
        }
        
        
        i = 0;
        array = new int[30];
        System.out.println();
        System.out.println("In Array Demo: " + arrayDemo.length);
        for (int size : arrayDemo) {
            System.out.print(size + " ");
            array[i++] = size;
        }
        
        System.out.println();
        System.out.println("In Array: " + array.length);
        for (int size : array) {
            System.out.print(size + " ");
        }*/
    }

}
