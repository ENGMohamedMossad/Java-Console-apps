A pentagonal number is defined as n(3n-1)/2 for n = 1, 2, 3, 4, 5  . . ., and so on.

Therefore, the first few pentagonal numbers are 1, 5, 12, 22, 26, 35 . . . . 

Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal
numbers with 5 numbers on each line.

* @author Mohamed Mossad
* @id 220180116
* @version 1.0
* @since 19 April 2019
*/

import java.util.Scanner;
public class Pentagonal_number {

	public static void main(String[] args) {
	   		int count = 1;
			for(int i = 1; i <= 50; i++){
				System.out.printf("%-6d",getPentagonalNumber(i));
				if(count % 10 == 0) System.out.println();
				count++;
			}
	    }
	  public static int getPentagonalNumber(int i) {
			return (i * (3 * i - 1))/2;
		}
	}