
public class SHolidayDiscount extends DiscountRental{
	
	private float price;
	
	
	public SHolidayDiscount(Movie movie) {
		super(movie);
	}
	
	
	@Override
	public void calculatePrice(int days) {

		price = (float) (movie.getPrice()*0.75);
	}

	public float getPrice() {
		return price;
	}
}
