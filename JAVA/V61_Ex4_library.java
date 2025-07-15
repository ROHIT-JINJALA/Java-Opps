class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBooks(String books){
        this.books[no_of_books] =books;
        no_of_books ++;
        System.out.println(books +" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("available books: ");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " +book);
        }
    }
    void issueBook(String book){
        for(int i = 0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println(book +" has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Sorry "+book +" not found!");
    }
    void returnBook(String book){
        addBooks(book);
    }
}

public class V61_Ex4_library {
    public static void main (String[] args){
        Library centrelLibrary = new Library();
        centrelLibrary.addBooks("DSA");
        centrelLibrary.addBooks("c++");
        centrelLibrary.addBooks("java");
        centrelLibrary.addBooks("c");
        centrelLibrary.showAvailableBooks();
        System.out.println();

        centrelLibrary.issueBook("c");
        centrelLibrary.issueBook("java");
        centrelLibrary.issueBook("Algorith");

        System.out.println();

        centrelLibrary.showAvailableBooks();

        System.out.println();

        //centrelLibrary.returnBook("c");
        //centrelLibrary.showAvailableBooks();

        System.out.println();

        //centrelLibrary.issueBook("Algorith");
    }
}
