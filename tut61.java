class Library{
    String[]  books;
    int no_of_books;
    Library(){
        this.books= new  String[100];
        this.no_of_books=0;

    }

    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added");
    }

    void ShowAvailableBooks(){
        System.out.println("available books are");
        for(String book:this.books){
            if(book == null){
                continue;
            }
            System.out.println(" * " + book);
        }
    }

    void issueBook(String book)
    {
        for(int i=0 ; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("this book has been issued "+ book);
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book is not available");
    }

    void returnBook(String book){
      addBook(book);
    }


}
public class tut61{
    public static void main(String[] args) {
             Library CentralLibrary = new Library();
             CentralLibrary.addBook("the one thing");
             CentralLibrary.addBook("power of subconsious mind");
             CentralLibrary.addBook("big magic");
             CentralLibrary.addBook("DSA");
             CentralLibrary.addBook("system design");
             CentralLibrary.ShowAvailableBooks();
             CentralLibrary.issueBook("DSA");
             CentralLibrary.ShowAvailableBooks();
             CentralLibrary.addBook("java");
             CentralLibrary.ShowAvailableBooks();
    }
}