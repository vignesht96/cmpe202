
/**
 * This class will run the program!
 *
 * @Krishnamurthy Thyagarajan (009584861)
 * @1.0 - Feb 8, 2019
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Gumball Machine Type 1: $0.25, quarters only");
        GumballMachine gumballMachine1 = new GumballMachine(5, 25, 1);

	gumballMachine1.insertQuarter(25);
	gumballMachine1.turnCrank();
	
	System.out.println("---------------------------------------------");
	
	System.out.println("Gumball Machine Type 2: $0.50, quarters only");
	GumballMachine gumballMachine2 = new GumballMachine(5, 50, 2);
	
	gumballMachine2.insertQuarter(25);
	gumballMachine2.insertQuarter(25);
	gumballMachine2.turnCrank();
	
	System.out.println("---------------------------------------------");
	
	System.out.println("Gumball Machine Type 3: $0.50, any type of coin");
	GumballMachine gumballMachine3 = new GumballMachine(5, 50, 3);
	
	gumballMachine3.insertQuarter(25);
	gumballMachine3.insertQuarter(10);
	gumballMachine3.insertQuarter(10);
	gumballMachine3.insertQuarter(5);
	gumballMachine3.turnCrank();
    }
}
