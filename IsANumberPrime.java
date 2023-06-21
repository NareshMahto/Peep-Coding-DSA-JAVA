/*Is A Number Prime
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise
*/

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int times = 1; times <= t; times++) {
			int n = sc.nextInt();
			int factor = 0;
			for (int i = 2; i*i <= n; i++) {
				if (n % i == 0) {
					factor++;
					break;
				}
			}
			if (factor == 2) {
			    System.out.println("prime");
		    } else {
			    System.out.println("not prime");
		    }
		}
	}
}
