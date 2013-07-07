package Factory;

public class CreditCheckFactory {
	
	private CreditCheckFactory(){}
	
	static CreditCheck getCreditCheckFactory(){
		if(isAgencyUp())
			return new CreditCheckOnline();
		
		return new CreditCheckOffline();
	}
	
	public static boolean isAgencyUp(){
		return false;
	}

}
