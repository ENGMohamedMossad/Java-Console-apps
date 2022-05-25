Write a program that prompts the user to enter a string
and displays

1- The number of the uppercase letters in the string.

2- The number of the lowercase letters in the string.

3- The number of digits in the string

4- The number of vowels (A,E,I,O,U) in the string

* @author Mohamed Mossad
* @id 220180116
* @version 1.0
* @since 19 April 2019
*/

import java.util.Scanner;
public class String_count {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			
			System.out.print("Enter a string: ");
			String string = input.nextLine();

			int vowels, 					
				 consonants;				
			vowels = consonants = 0;	

			for (int i = 0; i < string.length(); i++) {
				if (Character.isLetter(string.charAt(i))) {
					if (Character.toUpperCase(string.charAt(i)) == 'A' ||
						 Character.toUpperCase(string.charAt(i)) == 'E' ||
						 Character.toUpperCase(string.charAt(i)) == 'I' ||
						 Character.toUpperCase(string.charAt(i)) == 'O' ||
						 Character.toUpperCase(string.charAt(i)) == 'U') {
						vowels++;
					}
					else
						consonants++;
				}

			System.out.println("The number of vowels is " + vowels);
			System.out.println("The number of consonants is " + consonants);
		}
	}
}