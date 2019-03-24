
/**
 * Write a description of class Side here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Side extends LeafDecorator
{
    // added class Side
    private String[] options ;
    
    public Side( String d )
    {
        super(d) ;
    }
    
    // All sides +3.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        for(String option : options){
            price += 3.00;
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
