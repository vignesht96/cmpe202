
/**
 * Write a description of class Bun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bun extends LeafDecorator
{
    // Added Bun Class
    private String[] options ;
    
    public Bun( String d )
    {
        super(d) ;
    }
    
    // Buns free, but certain buns cost extra (Pretzel +0.50, Gluten-Free/Hawaiian +1.00)
    public void setOptions( String[] options )
    {
        this.options = options ;
        for(int i = 0; i < options.length; i++){
            if(options[i].equals("Pretzel Bun")){
                price += 0.50;
            }
            else if(options[i].equals("Gluten-Free Bun") || options[i].equals("Hawaiian Bun")){
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
