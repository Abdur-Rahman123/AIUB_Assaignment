import java.lang.*;
import java.util.*;
public class Start{
static public void main(String args[])
{
   Library l1=new Library("Tamim",4);
   Book b1=new Book(2,"Tamim","hamim",5);
   Book b2=new Book(2,"Rahim","kamim",4);
   Book b3=new Book(2,"karim","somim",6);
   Book b4=new Book(2,"zobbor","innl",7);
	  l1. books[0]=b1;
	   l1.books[1]=b2;
	   l1.books[2]=b3;
	  System.out.println(l1.getLibraryName());
	  for(int i=0;i<3;i++)
	  {
		  System.out.println(l1.books[i].getBookId());
		  System.out.println(l1.books[i].getBookTitle());
		  System.out.println(l1.books[i].getAuthorName());
		   System.out.println(l1.books[i].getNumberOfCopies());
	  }
	  System.out.println("-------------------------");
	  l1.removeBook(b1);
      l1.addBook(b4);
	  l1.books[3]=b4;
	  System.out.println("-------------------------");
	  for(int i=0;i<3;i++)
	  {
		  System.out.println(l1.books[i].getBookId());
		  System.out.println(l1.books[i].getBookTitle());
		  System.out.println(l1.books[i].getAuthorName());
		   System.out.println(l1.books[i].getNumberOfCopies());
	  }
	  
}
}