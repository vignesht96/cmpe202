import java.util.ArrayList;
/**
 * This Tester class will use Java's lambda functions in order to print out
 * the various ChristmasTree varieties without having to make separate class
 * implementations for them. This saves a lot of trouble in writing code for 
 * these classes and lowers the volume of code for a program in general.
 */
public class ChristmasTreeTester
{
   public static void main(String[] args){
        ChristmasTreeTester m = new ChristmasTreeTester();
        m.decorateTree();
    }
   
   public void decorateTree(){
        ChristmasTree tree = new ConcreteChristmasTree();
        ArrayList<ChristmasTree> treeStore = new ArrayList<ChristmasTree>();
        
        ChristmasTree plain = () -> tree.decorate();
        ChristmasTree garland = () -> tree.decorate() + " with Garland";
        ChristmasTree bubbleLights = () -> tree.decorate() + " with Bubble Lights";
        ChristmasTree tinsel = () -> tree.decorate() + " with Tinsel";
        ChristmasTree treeTopper = () -> tree.decorate() + " with Tree Topper";
        
        treeStore.add(plain);
        treeStore.add(garland);
        treeStore.add(bubbleLights);
        treeStore.add(tinsel);
        treeStore.add(treeTopper);
        
        for(ChristmasTree t : treeStore){
            System.out.println(t.decorate());
        }
   }
}
