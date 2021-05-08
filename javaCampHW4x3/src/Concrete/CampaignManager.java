package Concrete;

public class CampaignManager {
	
	public static float discount(float price,int discount) {
		return price-(price*discount/100);
	}
}
