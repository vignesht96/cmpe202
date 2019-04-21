
/**
 * The ConcreteComponent implementation of the ChristmasTree interface, as
 * laid out in the standard Decorator Pattern. We will use the deorate() method
 * in this class combined with lambda to make the other variants of the ChristmasTree
 * without having to use individual class implementations for them.
 */
public class ConcreteChristmasTree implements ChristmasTree
{
    @Override
    public String decorate(){
        return "Christmas Tree";
    }
}
