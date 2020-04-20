package problimSolving;

public abstract class Shape {
    int num1, num2;
    
    Shape(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    abstract void resultDisplay();
}
