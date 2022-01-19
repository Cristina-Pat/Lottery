package lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryTicket {
	int numbers[];

	public LotteryTicket(int initialNumbs[]) {
		numbers = new int[6];
		for (int i = 0; i < initialNumbs.length; i++) {
			numbers[i] = initialNumbs[i];
		}
	}

	public LotteryTicket() {
		generate2();
	}
	
	@SuppressWarnings("unused")
	private void generate1() {
		numbers = new int[6];
		Random randNum = new Random();

		for (int i = 0; i < 6; i++) {
			int x = randNum.nextInt(49) + 1;
			while(contains(numbers, x)) {
				x = randNum.nextInt(49) + 1;
			}
			numbers[i] = x;
		}	
	}

	private void generate2() {
		ArrayList<Integer> extractList = new ArrayList<>();
		for (Integer i = 0; i < 49; i++) {
			extractList.add(i);
		}
		
		numbers = new int[6];
		Random randNum = new Random();
		for (int j = 0; j < 6; j++) {
			int x = randNum.nextInt(extractList.size());
			numbers[j] = extractList.get(x);
			extractList.remove(x);			
		}
		
	}
	
	
	public void printTicket() {
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println(" ");
	}

	private boolean contains(int list[], int number) {
		for (int n : list) {
			if (n == number) {
				return true;
			}
		}
		return false;
	}
}