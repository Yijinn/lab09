
public class RegularMovie implements Movie{

	private float price;
	
	@Override
	public void calculatePrice(int days) {
		if(days <= 3) {
			price = 3 * days;
		}
		price = 3 * 3 + (days-3)*1;
	}
	
	@Override
	public float getPrice() {
		return price;
	}

}
