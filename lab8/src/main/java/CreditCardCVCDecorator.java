
public class CreditCardCVCDecorator implements IDecorator {

	@Override
	public String decorate(String d) {
		// TODO Auto-generated method stub
		if ( d.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + d + "]" + "  " ;
	}

}
