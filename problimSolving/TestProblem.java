package problimSolving;

public class TestProblem {
    public static void main(String[] args){
        Shape result;
        
        result = new Rectangle(10,20);
        result.resultDisplay();
        
        result = new Triangle(10,20);
        result.resultDisplay();
        
        result = new Circle(10);
        result.resultDisplay();
        
        
    }
}
