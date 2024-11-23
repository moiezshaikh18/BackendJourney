package challenge_2;


class Book_51{
    static int totalBooks;
    String title;
    String author;
    int isbn;

    static {
        totalBooks = 0;
    }

    {
        //Object init
        //this block call when new object has been created
        totalBooks ++;
    }

    public Book_51(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static int getTotalBook(){
        return totalBooks;
    }

    int borrowBook(){
       return totalBooks = totalBooks-1;
    }

    int  returnBook(){
         return totalBooks = totalBooks+1;
    }

    public static void main(String[] args) {
        Book_51 designOfThings = new Book_51("XYZ","ramesh",10);
        Book_51 myBook = new Book_51("XYZ","ramesh",10);
        System.out.println("Total Book "+ Book_51.getTotalBook());
        System.out.println("Borrow:: "+designOfThings.borrowBook());
        System.out.println("Borrow:: "+myBook.borrowBook());
        System.out.println("Return:: "+designOfThings.returnBook());
        System.out.println("Return:: "+myBook.returnBook());
    }
}



