/*
 *Programmed By: Justin Sousa, Teague Wingfelder, Martin Horciak
 *Programmed For: Mr.L.Calomeni
 *Course: ICS201
 *Date: Monday, January 9, 2017.
 *Program Description:	Create an application that generates a random number between 1 and 20
 *						and then prompt the user for a number also between 1 and 20. Compare
 *						the computers number and the users and if it matches display the message
 *						"you won!", if not display the message "Better luck next Time".
 */

 import java.lang.Math;									//Importing math package
 import java.util.Scanner;								//Importing scanner package

 class GuessingGame {								//Class Decloration w/ opening and closing brace
 	public static void main (String [] args){		//Main method w/ opening and closing brace

 		Scanner input = new Scanner(System.in);		//Creation of Scanner
 		int num;									//Variable decloration-int
 		double secretnum;							//Variable decloration-double

 		System.out.print ("Enter a number between 1 and 20: ");		//System output for num
 		num = input.nextInt();										//user input for variable num

 		secretnum = ((int)(20*Math.random() + 1));					//Random number generation

 		while (num != secretnum) {
 			if (num >== secretnum) {
 				System.out.println ("Too High");
 			}
 			if (num <= secretnum) {
 				System.out.println ("Too Low");
 			}
 			System.out.print ("Enter a number between 1 and 20: ");
 		num = input.nextInt();
 		}
 		if (num == secretnum) {
 			System.out.println ("YOU WIN!");
 		}
 		input.close();
 	}
 }