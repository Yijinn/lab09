
public class RentalItem extends RentalBasket{

	private Movie movie;	
	
	public RentalItem(int days, Movie m) {
		this.movie = m;	
	}
	
	@Override
	public float getPrice() {
		return movie.getPrice();
	}

	@Override
	public void calculatePrice(int days) {
		movie.calculatePrice(days);
	}

}
