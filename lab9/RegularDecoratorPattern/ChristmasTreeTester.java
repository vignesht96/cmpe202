import java.util.ArrayList;
/**
 * Write a description of class ChristmasTreeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChristmasTreeTester
{
    public static void main(String[] args){
        ChristmasTreeTester t = new ChristmasTreeTester();
        t.decorateTree();
    }
    
    public void decorateTree(){
        ChristmasTree tree = new ConcreteChristmasTree();
        ArrayList<ChristmasTree> treeStore = new ArrayList<ChristmasTree>();
        
        Garland garland = new Garland(tree);
        BubbleLights bubble = new BubbleLights(tree);
        Tinsel tinsel = new Tinsel(tree);
        TreeTopper treetop = new TreeTopper(tree);
        
        treeStore.add(tree);
        treeStore.add(garland);
        treeStore.add(bubble);
        treeStore.add(tinsel);
        treeStore.add(treetop);
        
        for(ChristmasTree t : treeStore){
            System.out.println(t.decorate());
        }
   } 
}
