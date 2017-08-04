import java.util.Scanner;
import java.util.Random;

public class twoDimensionalForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNumberArray[][] = new int[10][10];
		int count = 0, i, j, choice;
		Random number = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Let's generate our random number array:" + '\n');
		
		// Now, we will generate the random numbers for Array 'randomNumberArray'
		for(i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				
				randomNumberArray[i][j] = number.nextInt(100);
				if(j < 9) {
					
					System.out.print(randomNumberArray[i][j] + ", ");
				
				} else {
					
					System.out.println(randomNumberArray[i][j]);
				
				}
				
			}
			
		}
		
		System.out.println('\n' + "Please enter a number of your choice." + '\n' + "Let us count the number of times it occurs.");
		choice = scanner.nextInt();
		
		for(int run1[] : randomNumberArray) {
			for (int run2 : run1) {
				
				if(run2 == choice) {
					
					count++;
					
				}
				
			}
		}
		
		if(count == 1) {
			
			System.out.println('\n' + "The number " + choice + " occurs only once in the random number Array.");
			
		} else {
			
			System.out.println('\n' + "The number " + choice + " occurs " + count + " times in the random number Array.");
	
		}
		
	}

}
