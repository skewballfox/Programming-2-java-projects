/*
Joshua Ferguson

Client program for the Food linked list and Food node classes
For future reference never ever EVER write a program this long without periodically testing/debugging
it took a few hours to write and a few days to debug.
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class FoodClient
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner(System.in);
		FoodLinkedList FoodLinkedList = new FoodLinkedList();
		String userInput="";
		
		try 
		{
			Scanner file = new Scanner(new File ("food.txt"));
			
			while (file.hasNext())
			{
			String stringRead = file.nextLine();
			Scanner parse = new Scanner(stringRead);
			parse.useDelimiter(",");
			String name = parse.next();
			String producer = parse.next();
			double price= parse.nextDouble();
			int numberInStock= parse.nextInt();
			
			FoodNode newItem= new FoodNode(
					name, producer, price, numberInStock);
			
			FoodLinkedList.insert(newItem);
			
			}
			file.close();
		while (!(userInput.equals("Q")) || !(userInput.equals("QUIT")))	
		{
			System.out.println("Enter one of the following:\nAdd or A :"+
		" Add an item to the list\nCount or C : List"+
					" all items by less than a given quantity (Excluding out of stock\n"
		+ "Delete or D : Delete food by name\nItems or I : Get the number of food Items"+
					"\nList or L : List all foods\nName or N : Get a list of All Foods by a Given Name\n"
		+"Stock or S : get all the Items that are out of Stock\nQuit or Q : "
					+"quit\n");
			userInput = scan.nextLine().toUpperCase();
			
			
			//Here begins the various options for user input
			
			if ((userInput.equals("A")) || (userInput.equals("ADD")))
			{
				System.out.println("Enter the food name");
				String name = scan.next();
				System.out.println("Enter the producer of the food.");
				String producer = scan.next();
				System.out.println("Enter the price");
				double price = scan.nextDouble();
				System.out.println("Enter the number in stock");
				int numberInStock = scan.nextInt();
				FoodNode newItem= new FoodNode(
						name, producer, price, numberInStock);
				
				FoodLinkedList.insert(newItem);
			}
			
			else if ((userInput.equals("C")) || (userInput.equals("COUNT")))
			{
				System.out.print("Enter the number to compare to: ");
				int topStock = scan.nextInt();
				System.out.println("\n\nheres the list of foods with less than "+ topStock+" in stock\n\n"
						+ FoodLinkedList.stockCheck(topStock));
				
			}
			
			else if ((userInput.equals("D")) || userInput.equals("DELETE"))
			{
				System.out.print("name of the food to remove: ");
				String name = scan.next();
				System.out.println("\n");
				boolean bool=FoodLinkedList.delete(name);
			    if (bool==true)			
					System.out.println(name + " was removed.");
			    else
			    	System.out.println(name + " not found. cannot delete");
			
			}
			
			else if ((userInput.equals("I") || userInput.equals("ITEMS")))
			{
				System.out.println("the number of items is " 
						+ FoodLinkedList.getNumberOfItems());
			}
			
			else if ((userInput.equals("L") || userInput.equals("LIST")))
			{
				System.out.println("The list of foods follow: \n\n" + FoodLinkedList.toString());
				
			}
			
			else if ((userInput.equals("N") || userInput.equals("NAME")))
			{
				System.out.print("please enter the name to search for: ");
				String subString = scan.next();
				System.out.println("\nheres the list of foods whose name contains " + subString +
						":\n\n"+ FoodLinkedList.nameCheck(subString));
				
			}
			
			else if ((userInput.equals("S") || userInput.equals("STOCK")))
			{
				System.out.println("The items out of stock are as follows: \n"+FoodLinkedList.outOfStock());
			}
			
			else {
				System.out.println("please enter a valid response\n\n");
				userInput="";
			}
		}
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("um, the file could not be located");
		}
	}
	
}