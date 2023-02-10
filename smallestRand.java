package FinalTakeHome;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class smallestRand {
	
	
public static void main(String[] args) {
	
	  
    int[] numbers = new int[500];
    Random random = new Random();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(1000);
    }

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Nth smallest number: ");
    int n = sc.nextInt();

    Arrays.sort(numbers);
    System.out.println("The " + n + "th smallest number is: " + numbers[n - 1]);
  }
}
