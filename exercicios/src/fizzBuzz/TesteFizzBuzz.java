package fizzBuzz;

import java.util.Scanner;

public class TesteFizzBuzz {
	public static void main(String[] args) {
		
		int n, i = 1;
		Scanner scanf = new Scanner(System.in);
		
		n = scanf.nextInt();
		while(i<=n) {
			if(i % 3 == 0 && i%5 != 0) {
				System.out.print("Fizz ");
			}
			else if(i % 5 == 0 && i%3 != 0) {
				System.out.print("Buzz ");
			}
			else if(i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			}
			else
				System.out.print(i + " ");
			i++;
		}
	}

}
