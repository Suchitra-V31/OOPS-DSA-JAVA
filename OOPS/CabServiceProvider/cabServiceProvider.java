package cabServiceProvider;

public class cabServiceProvider {
	private String cabServiceName;
	private int totalCabs;
	
	public cabServiceProvider(String cabServiceName,int totalCabs) {
		this.setCabServiceName(cabServiceName);
		this.setTotalCabs(totalCabs);
	}

	public String getCabServiceName() {
		return cabServiceName;
	}

	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}

	public int getTotalCabs() {
		return totalCabs;
	}

	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	public double calculateRewardPrice(Driver driver) {
		double rewardAmt = 0;
		if(this.cabServiceName.equals("Halo")) {
			if(driver.getAverageRating()>= 4.5 && driver.getAverageRating()<=5) {
				rewardAmt = 10* driver.getAverageRating();
			}else if(driver.getAverageRating()>= 4 && driver.getAverageRating()<=4.5) {
				rewardAmt = 5* driver.getAverageRating();
			}
		}
		else if(this.cabServiceName.equals("Aber")) {
			if(driver.getAverageRating()>= 4.5 && driver.getAverageRating()<=5) {
				rewardAmt = 8* driver.getAverageRating();
			}else if(driver.getAverageRating()>= 4 && driver.getAverageRating()<=4.5) {
				rewardAmt = 3* driver.getAverageRating();
			}
		}
        rewardAmt = Math.round(rewardAmt * Math.pow(10, 2))
                / Math.pow(10, 2);
		return rewardAmt;
	}
}
