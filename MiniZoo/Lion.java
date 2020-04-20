package MiniZoo;

public class Lion extends Animal{
    public Lion(int lens){
        super(lens);
    }
    
    @Override
    public String getDiets(){
        return "Meet";
    }
}