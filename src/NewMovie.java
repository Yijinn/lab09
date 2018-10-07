
public class NewMovie implements Movie{

	private float price;
	
	@Override
	public void calculatePrice(int days) {
		price = days*5;
	}
	
	@Override
	public float getPrice() {
		return price;
	}
	

}
