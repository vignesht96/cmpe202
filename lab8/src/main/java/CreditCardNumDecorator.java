
public class CreditCardNumDecorator implements IDecorator {

	@Override
	public String decorate(String d) {
		// TODO Auto-generated method stub
		String decorated = "";
		for(int i = 0; i < d.length(); i++) {
			if(i == 4 || i == 8 || i == 12) {
				decorated += " " + d.charAt(i);
			}
			else {
				decorated += d.charAt(i);
			}
		}
		return decorated;
	}

}
