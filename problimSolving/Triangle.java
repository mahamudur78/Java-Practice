package problimSolving;

public class Triangle extends Shape{
    //num1, num2, resultDisplay()
    
    Triangle(int base, int hight){
        super(base, hight);
    }
    
    @Override
    void resultDisplay(){
        System.out.println("Tringle: " + 0.5 * (num1 * num2));
    }
    
}
