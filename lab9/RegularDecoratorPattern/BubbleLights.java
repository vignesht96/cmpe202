
/**
 * Note: This example was taken from https://www.baeldung.com/java-decorator-pattern
 * All credit goes to baeldung for providing this code on their website as an example to explain the Decorator Pattern
 * The code I have written involves the Lambda function implementation of this example
 */
public class BubbleLights extends TreeDecorator
{
    public BubbleLights(ChristmasTree tree){
        super(tree);
    }
    
    public String decorate(){
        return super.decorate() + decorateWithBubbleLights();
    }
    
    private String decorateWithBubbleLights(){
        return " with Bubble Lights";
    }
}