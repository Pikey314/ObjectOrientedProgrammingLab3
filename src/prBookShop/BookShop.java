package prBookShop;

public class BookShop {

    public static int INITIAL_CAPACITY = 16;
    private int numBooks;
    private Book[] books;

    public BookShop() {
        this.books = new Book [INITIAL_CAPACITY];
        this.numBooks = 0;
    }

    public BookShop(int arraySize) {
        this.books = new Book [arraySize];
        this.numBooks = 0;
    }


    public void addBook(String author, String title, double price) {
        Book newBook = new Book (author, title, price);
        addBook(newBook);
    }

    public void deleteBook(String author, String title) {
        int foundBookIndex = seekBook(author, title);
        if (foundBookIndex != -1)
            deleteBook(foundBookIndex);
    }

    public double getBasePrice(String author, String title) {
        int foundBookIndex = seekBook(author, title);
        if (foundBookIndex != -1)
            return this.books[foundBookIndex].getBasePrice();
        else
            return 0;
    }

    public double getAmountDue(String author, String title) {
        int foundBookIndex = seekBook(author, title);
        if (foundBookIndex != -1)
            return this.books[foundBookIndex].amountDue();
        else
            return 0;
    }


    public String toString() {
        String oneFormatString = "";

        for (int i=0; i<this.numBooks; i++) {
            if (i==0)
                oneFormatString = oneFormatString + "[" + this.books[i].toString();
            else
                oneFormatString = oneFormatString + "," + "\n" + this.books[i].toString();
        }
        oneFormatString = oneFormatString + "]";

        return oneFormatString;
    }


    protected int seekBook (String author, String title) {
        for (int i = 0; i<this.numBooks; i++) {
            if ((this.books[i].getAuthor()).toLowerCase().equals(author.toLowerCase()) && (this.books[i].getTitle()).toLowerCase().equals(title.toLowerCase()))
                return i;
        }
        return -1;
    }

    protected void deleteBook(int index) {
        int lastBookIndex = this.numBooks - 1;
        this.books[index] = this.books[lastBookIndex];
        this.books[lastBookIndex] = null;
        this.numBooks--;

    }

    protected void addBook(Book book) {
        int foundBookIndex = seekBook(book.getAuthor(), book.getTitle());
        if (foundBookIndex != -1)
            this.books[foundBookIndex] = book;
        else {

            if (this.books[this.books.length-1] != null) {
                int doubledSizeOfArray = this.books.length*2;
                Book newBookArray[] = new Book [doubledSizeOfArray];
                System.arraycopy(this.books, 0, newBookArray, 0, doubledSizeOfArray);
                this.books = newBookArray;
                this.books[doubledSizeOfArray/2] = book;
            }
            else {
                this.books[this.numBooks] = book;
            }
            this.numBooks++;
        }
    }
}
