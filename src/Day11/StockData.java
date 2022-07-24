package Day11;

public class StockData {
	 public String stockname;
	public int numberofShares;
	public double  sharePrice;
	double totalSharePrice=0;
	/*public StockData() {
		
	}*/
	public StockData(String stockname,int numberofshares,double sharePrice) {
		this.stockname=stockname;
		this.sharePrice=sharePrice;
		this.numberofShares=numberofshares;
		
	}
	
	public void calculateSharePrice(double d) {
		this.totalSharePrice = d;
	}
	@Override
	public String toString() {
	return("stockname is " +stockname+ "share price of stock" +sharePrice+ "total stock price is" +totalSharePrice);
	}

}
