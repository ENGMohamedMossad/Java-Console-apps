Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
 public static int reverse(int number)
// Return true if number is a palindrome
 public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome.

A number is a palindrome if its reversal is the same as itself.

Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.

* @author Mohamed Mossad
* @id 220180116
* @version 1.0
* @since 19 April 2019
*/

import java.util.Scanner;
public class Palindrome_integer {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		
			System.out.print("Enter an integer: ");
			int number = input.nextInt();

			System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
				"a palindrome.");
		}
		
		public static boolean isPalindrome(int number) {
			return number == reverse(number) ? true : false;
		}
		
		public static int reverse(int number) {
			String reverse = ""; 	
			String n = number + ""; 
			
			for (int i = n.length() - 1; i >= 0; i--) {
				reverse += n.charAt(i);
			}
			return Integer.parseInt(reverse); 
		}
	}