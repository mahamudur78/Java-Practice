package problimSolving;

public class Circle extends Shape{
    // num1, num2, resultDisplay();
    Circle(int r){
        super(r, r);
    }
    
    @Override
    void resultDisplay(){
        System.out.println("Circle Area: " + 3.1415 * num1 * num2);
    }
    
}
