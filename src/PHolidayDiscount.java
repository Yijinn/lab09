
public class PHolidayDiscount extends DiscountRental{
	
	
	private float price;
	
	public PHolidayDiscount(Movie movie) {
		super(movie);
	}

	@Override
	public void calculatePrice(int days) {
		price = (float) (movie.getPrice()*1.1);
	}

	@Override
	public float getPrice() {
		return price;
	}

}
