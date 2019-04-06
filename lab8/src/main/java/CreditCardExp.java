/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private CreditCardExpDecorator dec;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
    public CreditCardExp() {
    	dec = new CreditCardExpDecorator();
    }

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + dec.decorate(date) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20)
			if(ch.equalsIgnoreCase("X")) {
				if(date.length() > 0) {
					date = date.substring(0, date.length() - 1);
				}
			}
			else {
				date += ch;
			}
			
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}