/**
 * Assignment 2
 * Author : Anna Maria Paul Mundadan
 * Class  : CSE 360 (Wednesday session)
 * Date   : 10-09-2019
 * File   : AddingMachine.java
 * Purpose: Edited version of AddingMachine with functioning methods. It has methods to add 
 *          and subtract values. It also keeps track of all performed operations,  which it returns
 *          as a string. The clear function in it resets the total to a zero and clears the history.
 */

package cse360assign2;

public class AddingMachine 
{

	//VARIABLE
	private int total;
	private String operationHistory = "0";	//String variable to keep track of all operations.
	
	//DEFAULT CONSTRUCTOR
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	//METHOD TO CALCULATE THE TOTAL
	public int getTotal () 
	{
		return total;
	}
	
	//METHOD TO COMPUTE THE SUM AND KEEP TRACK OF ADDITION OPERATIONS
	public void add (int value) 
	{
		total = total + value;
		operationHistory = operationHistory + " + " + value;
	}
	
	//METHOD TO SUBTRACT AND KEEP TRACK OF ALL SUBTRACTION OPERATIONS
	public void subtract (int value) 
	{
		total = total - value;
		operationHistory = operationHistory + " - " + value;
	}
		
	//METHOD TO CONVERT INTO A STRING OF ALL OPERATIONS PERFORMED
	public String toString () 
	{
		return operationHistory;
	}

	//METHOD TO CLEAR THE HISTORY AND RESET THE TOTAL
	public void clear() 
	{
		total = 0;
		operationHistory = "0";
	}
}
