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

 		System.out.print ("Enter a number between 1 and 50: ");		//System output for num
 		num = input.nextInt();										//user input for variable num

 		secretnum = ((int)(50*Math.random() + 1));					//Random number generation

 		do{															//do-while statement
 			if (num >= secretnum) {									//nested if statement with condition
 				System.out.println ("Too High");					//System output
 			}
 			if (num <= secretnum) {									//nested if statement with condition
 				System.out.println ("Too Low");						//System output
 			}
 			if (num > 50){											//nested if statement with condition
 			System.out.println("Error: Enter a valid number");		//System output for errors
 			break;													//break statement to stop program after errors
 		}
 			System.out.print ("Enter a number between 1 and 50: ");	//System output
 		num = input.nextInt();										//user input
 		} while (num != secretnum);									//while statement with condition

 		input.close();												//Closing scanner

 		if (num == secretnum) {										//if statement with condition
 			System.out.println ("YOU WIN!");						//System output
 		}
	}
}

	/*
	 *	This approach works as you are simply finding a middle value
	 *in a set of numbers seeing wether or not that mid point is too
	 *high or too low. If its too high you can disregard all numbers
	 *after it including the number itself, and if its too low all
	 *numbers before it aswell as itself. This cuts down on time and
	 *is extremely efficient as appose to linear search. As numbers
	 *keep being disregarded you have a smaller amount of numbers to
	 *work with making your search eisier.
	 *
	 *	This strategy would not be possible it hints were not given
	 *as you wouldnt be able to tell which numbers to disregard. You
	 *would have to conduct linear search instead of binary search.
	 *This would be horribly inefficient especially if more numbers
	 *were added. */







