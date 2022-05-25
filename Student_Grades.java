Ask the user to enter
- Name
- ID 
- File Name

Randomly choose five grades for that person from 1 to 100 and store them in an array that can hold five integers. 
Then output the name, ID, and those five grades to the screen and save the output into the specified file.

The file will look like:
---------------------------------
220181234
Ahmed Ihab

Grade 1 : 60
Grade 2 : 75
Grade 3 : 30
Grade 4 : 96
Grade 5 : 63
----------------------------------

*@author: mohamed mossad
*@ ID: 220180116
*@ virsion: 1.1
*@ date: 13/10/2019

------------------------------------
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Student_Grades {
	public static int[] Getgrades = new int[5];
	public static String name;
	public static int ID;
	public static String Filename;

	public static void main(String[] args) throws IOException {

		start();
		grades();
		loop();

		FileWriter write = new FileWriter(Filename + ".txt");
		BufferedWriter buf = new BufferedWriter(write);
		buf.write(name);
		buf.newLine();
		buf.write("ID is :  " + ID);
		buf.newLine();
		buf.write("    -------------------------------------");
		buf.newLine();
		for (int i = 0; i < Getgrades.length; i++) {
			buf.write("grade " + (i + 1) + ": " + Getgrades[i]);
			buf.newLine();
		}
		buf.close();
	}

	public static void start() {
		Scanner in = new Scanner(System.in);
		System.out.println("please insert your name... ");
		name = in.nextLine();
		System.out.println("please insert your ID... ");
		ID = in.nextInt();
		System.out.println("please insert your filename... ");
		Filename = in.next();
	}

	public static int[] grades() {

		for (int j = 0; j < Getgrades.length; j++) {

			Getgrades[j] = (int) (Math.random()*101 );

		}
		return Getgrades;
	}

	public static void loop() {
		for (int i = 0; i < Getgrades.length; i++) {
			System.out.println("grade "+ (i+1)+": " + Getgrades[i]);
		}
	}

}
