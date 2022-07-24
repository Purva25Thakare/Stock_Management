package Day11;

public class StockPortfolio {
	private int numOfStocknames=0;
	private StockData[] stockArray;
		public StockPortfolio() {
			stockArray=new StockData[5];
		}
		public void addStockData(String stockname,int numberofShares,double sharePrice) {
			stockArray[numOfStocknames]= new StockData(stockname,numberofShares,sharePrice);
			numOfStocknames++;
		}
		private void computeSharePriceData() {
			for(int i=0;i<numOfStocknames;i++) {
				stockArray[i].calculateSharePrice(this.computeSharePrice(stockArray[i]));
				System.out.println(stockArray[i]);
					}
		}
		public double computeSharePrice(StockData stock) {
			double sharePriceResult=stock.numberofShares*stock.sharePrice;
			return sharePriceResult;
		}

		public static void main(String[] args) {
			StockPortfolio sp = new StockPortfolio();
			sp.addStockData("Google", 5, 20.0);
			//System.out.println("the added data is " +sp.addStockData(null, 0, 0) );
			
			sp.addStockData("Dmart", 10, 50.5);
			sp.addStockData("TCS", 7, 15.6);
			sp.addStockData("Google", 5, 20.0);
			sp.computeSharePriceData();
			
		}
}
