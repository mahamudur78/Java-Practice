package problimSolving;

public class Rectangle extends Shape{
    //num1, num2
    Rectangle(int length, int width){
        super(length, width);
    }
    
    @Override
    void resultDisplay(){
        System.out.println("Rectangle: " + num1*num2);
    }
    
}
