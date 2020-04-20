package MiniZoo;

public class Deer extends Animal{
    public Deer(int legs){
        super(legs);
    }

    @Override
    public String getDiets(){
        return "Grass";
    }
    
    
}