class Solution{
	public int maxProfit(int[] prices){
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		
		for(int price:prices){
			minPrice=Math.min(minPrice,price);
			maxProfit=Math.max(maxProfit,price-minPrice);
		}
		return maxProfit;
	}
	public static void main(String[] args){
		Solution sol=new Solution();
	int[] prices={7,1,5,3,6,4};
		System.out.println(sol.maxProfit(prices));
	}
}