import java.util.ArrayList;


class Book{
    public String name , author ;

    public Book(String name , String author)
    {
        this.name = name;
        this.author = author;
    }
  
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Book{" + "name ='" + name + '\'' + ",author='" + author + '\'' + '}';
    }
}
class Library{
    public ArrayList<Book> books;
 
    public Library(ArrayList<Book> books)
    {
     this.books=books;
    }
    public void addBook(Book book)
    {
        System.out.println("the book has been added to the library");
        this.books.add(book);  
    }
    public void issueBook(Book book , String issued_to)
    {
        System.out.println("the book has been issued from  the library " + issued_to);
        this.books.remove(book);  
    }
    public void returnBook(Book book)
    {
        System.out.println("the book has been returned");
        this.books.add(book);  
    }

}
public class tut113 {
    public static void main(String[] args) {
        //exercies 7 soln
        //create a library management system which is capale of issuing books to the students
        //  book should have info Line
        //  1.Book Name
        //  2.Book Author
        //  3.Issued to
        //  4. Issued On
        // user should be able to add books , return issued books , issue booksassume that all the useers are registerged with their names in the central database
        ArrayList<Book> bk = new ArrayList<>();
        Book b1=new Book("algorithim1" , "clrs1");
        bk.add(b1);
        Book b2=new Book("algorithim2" , "clrs2");
        bk.add(b2);
        Book b3=new Book("algorithim3" , "clrs3");
        bk.add(b3);
       
        Library l = new Library(bk);
        l.addBook(new Book("algo4" , "chris"));
        System.out.println(l.books);
        l.issueBook(b3, "toseeb");
        System.out.println(l.books);
    }
}
