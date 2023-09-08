
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
// toString(), hashCode(), equals(), 
//wait(),wait(),wait(), notify(), notifyAll()
//clone(), getClass(), finalize()

class Book // Object = 11 methods 
{
	int  bookNumber;
	String bookName;
	float bookPrice;

	public Book(int bookNumber) {
		super();
		this.bookNumber = bookNumber;
	}

	public Book(int bookNumber, String bookName, float bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

	

	public int getBookNumber() {
		return bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookName, bookNumber, bookPrice);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		
		Book other = (Book) obj;
		
		return Objects.equals(bookName, other.bookName) && bookNumber == other.bookNumber
				&& Float.floatToIntBits(bookPrice) == Float.floatToIntBits(other.bookPrice);
	}

	

	
	
	
	
}
//b1 = 101
//b2 = 101
//b3 = 101

public class HashSetTest {
	public static void main(String[] args) {
		Book b1 = new Book(101,"Java8",1300.0f);
		Book b2 = new Book(101,"Java8",1300.0f);
		Book b3 = new Book(101,"Java8",1300.0f);
		Book b4 = b1;
		Book b5 = null;
		Book b6 = null;
		System.out.println("Book are ready....");
		
		HashSet<Book> myBookShelf = new HashSet<Book>();
		System.out.println("Book shelf is ready....");
		
		System.out.println("Adding books to the bookShelf....");
		myBookShelf.add(b1);//referring equals+hashcode of Book
		myBookShelf.add(b2);//referring equals+hashcode of Book
		myBookShelf.add(b3);//referring equals+hashcode of Book
		myBookShelf.add(b4);
		myBookShelf.add(b5);
		myBookShelf.add(b6);
		
		
		System.out.println("b1 : "+b1.hashCode());
		System.out.println("b2 : "+b2.hashCode());
		System.out.println("b3 : "+b3.hashCode());
		System.out.println("b4 : "+b4.hashCode());

		//myBookShelf.add(b5);
		//myBookShelf.add(b6);
		//myBookShelf.add((Book) new Tiger());
		System.out.println("Books are added to the Shelf..");
		Iterator<Book> bookIterator = myBookShelf.iterator();
		
	
		while(bookIterator.hasNext()) {
			Book theBook = bookIterator.next();
				System.out.println("The Book : "+theBook);
			
		}
		
	}
}

/*


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
	result = prime * result + bookNumber;
	result = prime * result + Float.floatToIntBits(bookPrice);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (bookName == null) {
		if (other.bookName != null)
			return false;
	} else if (!bookName.equals(other.bookName))
		return false;
	if (bookNumber != other.bookNumber)
		return false;
	if (Float.floatToIntBits(bookPrice) != Float.floatToIntBits(other.bookPrice))
		return false;
	return true;
}
*/
