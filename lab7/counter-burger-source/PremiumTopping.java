
/**
 * Write a description of class Premium here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumTopping extends LeafDecorator
{
    private String[] options ;
    
    
    public PremiumTopping( String d )
    {
        super(d) ;
    }
    
    // premium topping +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        for(int i = 0; i < options.length; i++){
            if(options[i].equals("Marinated Tomatoes")){
                price += 3.00;
            }
            else{
                price += 1.00;
            }
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}
