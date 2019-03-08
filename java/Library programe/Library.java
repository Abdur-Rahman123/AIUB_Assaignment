import java.lang.*;
import java.util.*;
public class Library
{
	private String libraryName;
	public Book []books;
	public static int sizeOfArray;
	public Library()
	{
		
	}
	public Library(String libraryName, int sizeOfArray)
	{
		this.libraryName=libraryName;
		books=new Book[sizeOfArray];
		this.sizeOfArray=sizeOfArray;
	}
	public void setLibraryName (String libraryName) 
	{
		this.libraryName=libraryName;
	}
	public String getLibraryName() 
	{
		return libraryName;
	}
	public void addBook(Book b) 
	{
		if(books[sizeOfArray]!=null)
		{
			for(int i=0;i<books.length;i++)
			{
				if(books[i]==null)
				{
					books[i]=b;
				sizeOfArray++;
				}
		}
		}
		else
		{	
        System.out.println("No Space to Add More Books.");
		}
	}
		public void removeBook(Book b)
		{
			int booknumber=0;
			if(sizeOfArray!=0)
			{
				for(int i=0;i<books.length;i++)
				{
					if(books[i]==b)
					{
						booknumber=i;
					}
				}
					
				for(int i=booknumber;i<books.length-1;i++)
				{
					books[i]=books[i+1];
					sizeOfArray--;
			}
		}
		else
		{
			System.out.println("Can't possible to removeBook");
		}
		}
}