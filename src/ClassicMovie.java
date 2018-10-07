
public class ClassicMovie implements Movie{

	private float price;
	
	@Override
	public void calculatePrice(int days) {
		if(days <= 5) {
			price = (float) (days * 2.5);
		}
		price = (float) (5*2.5 + (days-5) * 0.5);
	}
	
	@Override
	public float getPrice() {
		return price;
	}
	

}
