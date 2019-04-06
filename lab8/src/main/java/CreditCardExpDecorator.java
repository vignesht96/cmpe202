public class CreditCardExpDecorator implements IDecorator {

	@Override
	public String decorate(String d) {
		// TODO Auto-generated method stub
		String decorated = "";
		for(int i = 0; i < d.length(); i++) {
			if(i != 2) {
				decorated += d.charAt(i);
			}
			else {
				decorated += "/" + d.charAt(i);
			}
		}
		return decorated;
	}
	
}
