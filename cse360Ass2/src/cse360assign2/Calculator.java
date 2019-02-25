/**
 * @author Gregorio Vargas
 * Class ID: 575
 * Assignment 2
 * Description: Edited Calculator.java file with correctly implemented methods 
 * for getTotal, add, subtract, multiply, divide, and getHistory
 */

/**
 * The Calculator class consists of methods to add, subtract, multiply, and divide numbers 
 * provided by the user, as well as methods to return the result and the print the history 
 * of the calculator
 */
package cse360assign2;

public class Calculator 
{

	private int total; //keeps track of calculator total
	
	/**
	 * Class constructor.
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method inserts a number into this array in ascending order and 
	 * without any duplicate numbers
	 * 
	 * @param 	insertNum number to insert into array at the necessary index.
	 * 					If the number is a duplicate, it will not be 
	 * 					inserted into the array
	 * @return  the calculator's total that will be displayed and used in 
	 * 			further calculations
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method takes a value that the user inputs and adds 
	 * it to the current total
	 * 
	 * @param value number to add to the total
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	
	/**
	 * This method takes a value that the user inputs and subtracts 
	 * it from the current total
	 * 
	 * @param value number to subtract from the total
	 */
	public void subtract (int value)
	{
		total = total - value;
	}
	
	/**
	 * This method takes the total and multiplies it by the 
	 * value the user inputs
	 * 
	 * @param value number to multiply to the total
	 */
	public void multiply (int value)
	{
		total = total * value;
	}
	
	/**
	 * This method takes a the total and divides it by the
	 * number input by the user
	 * 
	 * @param value number to subtract from the total
	 */
	public void divide (int value) 
	{
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/**
	 * This method returns a history of the calculator's 
	 * functions in order as a string
	 * 
	 * @return		the calculator's history
	 */
	public String getHistory () 
	{
		return "";
	}
}
