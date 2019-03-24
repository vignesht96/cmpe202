
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client {

    public static void runTest()
    {
        Component theFirstOrder = BuildOrder.getFirstOrder() ;
        theFirstOrder.printDescription();
        
        System.out.println();
        
        Component theSecondOrder = BuildOrder.getSecondOrder() ;
        theSecondOrder.printDescription();
    }
}
