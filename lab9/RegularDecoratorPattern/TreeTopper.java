
/**
 * Note: This example was taken from https://www.baeldung.com/java-decorator-pattern
 * All credit goes to baeldung for providing this code on their website as an example to explain the Decorator Pattern
 * The code I have written involves the Lambda function implementation of this example
 */
public class TreeTopper extends TreeDecorator
{
    public TreeTopper(ChristmasTree tree){
        super(tree);
    }
    
    public String decorate(){
        return super.decorate() + decorateWithTreeTopper();
    }
    
    private String decorateWithTreeTopper(){
        return " with Tree Topper";
    }
}
