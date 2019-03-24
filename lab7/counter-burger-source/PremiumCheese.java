
/**
 * Write a description of class PremiumCheese here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumCheese extends LeafDecorator
{
    // added class PremiumCheese
     private String[] options ;
     
    public PremiumCheese( String d )
    {
        super(d) ;
    }
    
    // 1 cheese 1.50, extra cheese +1.50
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 1 )
            this.price += (options.length - 1) * 1.50 ;
        else
            this.price += 1.50;
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
