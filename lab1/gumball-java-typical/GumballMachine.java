
/**
 * This GumballMachine class is meant to fit the requirements of 3 different
 * GumballMachines. One that takes only $0.25, one that takes $0.50, and one
 * that takes various types of coins that add up to $0.50. 
 *
 * @Krishnamurthy Thyagarajan (009584861)
 * @1.0 - Feb 8, 2019
 */
public class GumballMachine
{

    private int num_gumballs; //Number of gumballs in the machine
    private boolean has_quarter; //If the coin inserted is a quarter or not
    private int totalCoinAmt; //Total amount inserted into the machine, will help with diff machine types
    private int gumballPrice; //The price required by the gumball machine
    private int machineType; //1 for quarter only, 2 for two quarters ($0.50), 3 for any coin type ($0.50)

    public GumballMachine(int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }
    
    public GumballMachine(int numGumballs, int gumballPrice, int machineType){
        //initializing instance variables
        this.num_gumballs = numGumballs;
        this.has_quarter = false;
        this.totalCoinAmt = 0;
        this.gumballPrice = gumballPrice;
        this.machineType = machineType;
    }

    public void insertQuarter(int coin)
    {
        if (coin == 25){
            this.has_quarter = true;
            this.totalCoinAmt = this.totalCoinAmt + coin;
        }
        else{
            this.has_quarter = false;
            this.totalCoinAmt = this.totalCoinAmt + coin;
        }
    }
    
    public void turnCrank(){
        //machineType 1 refers to a standard $0.25 gumball machine
        if(machineType == 1){
            if(this.has_quarter){
               if(this.num_gumballs > 0){
                  this.num_gumballs--;
                  this.has_quarter = false;
                  System.out.println("Thanks for your quarter. Gumball Ejected!");
               }
               else{
                   System.out.println( "No More Gumballs! Sorry, can't return your quarter.");
               }
            }
        }
        
        //machineType 2 refers to a $0.50 gumball machine that only takes two quarters
        if(machineType == 2){
            if(this.totalCoinAmt >= this.gumballPrice && this.has_quarter){
                if(this.num_gumballs > 0){
                    this.num_gumballs--;
                    this.totalCoinAmt = this.totalCoinAmt - this.gumballPrice;
                    System.out.println("Thanks for your quarters. Gumball Ejected!");
                }
                else{
                    System.out.println("No More Gumballs! Sorry, can't return your quarters.");
                }
            }
            else{
                System.out.println("Please insert more quarters!");
            }
        }
        
        //machineType 3 refers to a $0.50 gumball machine that takes any kind of coin (penny to quarter)
        if(machineType == 3){
            if(this.totalCoinAmt >= this.gumballPrice){
                if(this.num_gumballs > 0){
                    this.num_gumballs--;
                    this.totalCoinAmt = this.totalCoinAmt - this.gumballPrice;
                    System.out.println("Thanks for your coins. Gumball Ejected!");
                }
                else{
                    System.out.println("No More Gumballs! Sorry, can't return your coins.");
                }
            }
            else{
                System.out.println("Please insert more coins!");
            }
        }
        
    }
}