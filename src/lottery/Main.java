package lottery;

public class Main {

	public static void main(String[] args) {
		
		//LotteryTicket z = new LotteryTicket();
		//z.printTicket();
		
		int initialNumbs[] = {9, 2, 7, 4, 11, 13};
		LotteryTicket x = new LotteryTicket(initialNumbs);
		
		Integer extractedNum[] = {9, 2, 17, 4, 11, 13};
		
		System.out.println(x.isWinner(extractedNum));
		
	}
	
}
