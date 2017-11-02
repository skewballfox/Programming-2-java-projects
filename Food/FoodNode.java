/*
 * Joshua Ferguson
 * 
 * program that creates a food object that will be a Node in
 * the linked list 
 */

public class FoodNode
 
{
	private String name;
	private String producer;
	private double price;
	private int numberInStock;
	private FoodNode next;
//default constructor
	public FoodNode()
	{
		name="";
		producer ="";
		price=0.0;
		numberInStock=0;
		next = null;
		
	}
	
	//overloaded constructor
	public FoodNode(String newName, String newProducer, double newPrice, 
			int newNumberInStock)
	{
		setName(newName);
		setProducer(newProducer);
		setPrice(newPrice);
		setNumberInStock(newNumberInStock);
		next = null;
	}
	//thus begins the accessors
	public String getName()
	{
		return name;
	}
	public String getProducer()
	{
		return producer;
	}
	public double getPrice()
	{
		return price;
	}
	public int getNumberInStock()
	{
		return numberInStock;
	}
	public FoodNode getNext()
	{
		return next;
	}
	public String toString() 
	{
		return name +" Company: "+ producer+ " Price: "+ price
	    + " Quantity: " + numberInStock + "\n";
	}

//mutators begin here
	public void setName(String newName)
	{
		name=newName;
	}
	public void setProducer(String newProducer)
	{
		producer=newProducer;
	}
	public void setPrice(double newPrice)
	{
		price=newPrice;
	}
	public void setNumberInStock(int newNumberInStock)
	{
		numberInStock=newNumberInStock;
	}
	public void setNext(FoodNode nd)
	{
		next=nd;
	}
	

	




}

