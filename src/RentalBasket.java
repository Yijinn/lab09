import java.util.ArrayList;

public class RentalBasket implements Movie{

	private ArrayList<RentalItem> items;
	private float price;
	
	public RentalBasket() {
		this.items = new ArrayList<RentalItem>();
		price = 0;
	}
	
	@Override
	public float getPrice() {
		return price;
	}
	
	public void add(RentalItem i) {
		items.add(i);
	}

	@Override
	public void calculatePrice(int days) {
		for(RentalItem  i: items) {
			price += i.getPrice();
		}		
	}

}
