import java.lang.*;
public class Book
{
	private int bookId;
	private String bookTitle;
	private String authorName;
	private int numberofCopies;
	public Book()
	{
	}
	public Book(int bookId,String bookTitle,String authorName,int numberofCopies)
	{
		this.bookId=bookId;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.numberofCopies=numberofCopies;
		
	}
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
	
	public void setAuthorName(String authorName) 
	{
		this.authorName=authorName;
	}
public void setNumberOfCopies(int numberofCopies)
	{
		this.numberofCopies=numberofCopies;
	}
	public int getBookId ()
	{
		return bookId;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
 public String getAuthorName() 	
 {
	 return authorName;
 }
 public int getNumberOfCopies() 
 {
	 return numberofCopies;
 }
}
