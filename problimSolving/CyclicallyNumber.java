package problimSolving;

public class CyclicallyNumber {

    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40,50,60};
        int[] y = new int[x.length];
         
        for(int i = 0; i < x.length; i++) {
            if(i==0){
                y[i] = x[x.length-1];
            }else{
                y[i] = x[i-1];
            }
        }
        
        for(int i = 0; i < x.length; i++ ){
            System.out.print(y[i] + " ");
        }
    }
}
