public class FoodLinkedList
{
	private FoodNode head;
	private int numberOfItems;

	//default constructor
	public FoodLinkedList()
	{
		head=null;
		numberOfItems=0;
	}
	public int getNumberOfItems()
	{
		return numberOfItems;
	}
	//insert method 
	public void insert (FoodNode fn)
	{
		fn.setNext(head);
		head=fn;
		numberOfItems++;
	}
	//delete method
	public boolean delete(String name)
	{
		FoodNode current = head;
		FoodNode previous = null;
		while (current != null && !(current.getName().toLowerCase().equals(name.toLowerCase())))
		{
			previous = current;
			current = current.getNext();
		}
		if (current == null) //not found
		{
			System.out.println( name + " not found: cannot be deleted");
		    return false;
		}
		else
		{
			if (current == head)
				head = head.getNext(); //delete head
			else 
				previous.setNext( current.getNext());
			
			numberOfItems--;
			return true;
		}
	}
	//toString method
	public String toString()
	{
		String listString = "";
		FoodNode current = head;
		while ( current != null )
		{
			listString +=current.toString();
			current = current.getNext();
		}
		return listString;
	}
	public String stockCheck(int n)
	{
		String listString = "";
		FoodNode current = head;
		while ( current != null )
		{
			//System.out.println(current.getName()+" "+current.getNumberInStock());
			if(current.getNumberInStock() < n) 				
				listString += current.toString();
			
			current = current.getNext();
		}
		return listString;
	}
	public String outOfStock()
	{
		return stockCheck(1);
	}
	public String nameCheck(String s)
	{
		String listString = "";
		FoodNode current = head;
		while ( current != null )
		{
			if(current.getName().toLowerCase().contains(s.toLowerCase()) == true)
					listString += current.toString();
			
			current = current.getNext();
			
		}
		return listString;
	}
}


