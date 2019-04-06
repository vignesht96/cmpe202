/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;
	CreditCardCVCDecorator dec;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }
    
    public CreditCardCVC() {
    	dec = new CreditCardCVCDecorator();
    }

	public String display() {
		return dec.decorate(cvc);
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 21 ) {
			if ( cnt >= 21 && cnt <= 23 )
				if(ch.equalsIgnoreCase("X")) {
					if(cvc.length() > 0) {
						cvc = cvc.substring(0, cvc.length() - 1);
					}
				}
				else {
					cvc += ch ;
				}
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}
