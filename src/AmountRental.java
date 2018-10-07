
public class AmountRental extends DiscountRental{
	
	
	private float price;
	
	public AmountRental(Movie movie) {
		super(movie);
	}
	

	@Override
	public void calculatePrice(int days) {
		price = (float) (movie.getPrice()*0.9);
	}


	@Override
	public float getPrice() {
		return price;
	}
	
}
