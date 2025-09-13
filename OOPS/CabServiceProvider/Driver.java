package cabServiceProvider;

public class Driver {
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName,float averageRating) {
		this.driverName = driverName;
		this.averageRating = averageRating;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverName() {
		return this.driverName;
	}
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}
	public float getAverageRating() {
		return this.averageRating;
	}
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}
