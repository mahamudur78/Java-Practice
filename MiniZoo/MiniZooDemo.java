package MiniZoo;

public class MiniZooDemo {
   public static void main(String[] args){
       Animal[] animals = new Animal[3];
       animals[0] = new Tiger(5);
       animals[1] = new Lion(5);
       animals[2] = new Deer(4);
       
       MiniZoo minizoo = new MiniZoo(animals);
       //minizoo.putThemOnSleep();
       minizoo.printDietsOfAllAnimal();
   }
}