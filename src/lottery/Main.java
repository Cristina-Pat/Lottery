package lottery;

public class Main {

	public static void main(String[] args) {
		int initialNumbs[] = {6, 25, 14, 19, 5, 9};
		LotteryTicket x = new LotteryTicket(initialNumbs);
		x.printTicket();
		
		initialNumbs[3] = 35;
		x.printTicket();
		
		LotteryTicket y = new LotteryTicket(initialNumbs);
		y.printTicket();
		
		LotteryTicket z = new LotteryTicket();
		z.printTicket();
	
	}
	
}
