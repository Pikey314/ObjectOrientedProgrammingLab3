package prBookShop;

public class SalesBookShop extends BookShop {

    private double discountPercentage;
    private String[] saleAuthors;

    public SalesBookShop (double discountPercentage, String[] saleAuthors){
        super();
        this.discountPercentage = discountPercentage;
        this.saleAuthors = saleAuthors;
    }

    public SalesBookShop(int capacity, double discountPercentage, String[] saleAuthors){
        super(capacity);
        this.discountPercentage = discountPercentage;
        this.saleAuthors = saleAuthors;

    }

    public void setSales(double discountPercentage, String[] saleAuthors){
        this.discountPercentage = discountPercentage;
        this.saleAuthors = saleAuthors;
    }

    public String[] getSales(){
        return this.saleAuthors;
    }

    public double getDiscountPercentage(){
        return this.discountPercentage;
    }

    @Override
    public void addBook(String author, String title, double price) {
       /* boolean flag = false;
        for (String sAuthor : saleAuthors) {
            if (sAuthor.equalsIgnoreCase(author))
                flag = true;
        }

        */
        double discountPrice = ((100.0-this.discountPercentage)/100)*price;
        if (seekSalesAuthor(author) != -1) {
            Book newBook = new SalesBook (author, title, price,  this.discountPercentage);
            addBook(newBook);
        }
        else {
            Book newBook = new Book (author, title, price);
            addBook(newBook);
        }

    }

    @Override
    public String toString() {
        String stringToReturn = this.discountPercentage + "%[";
        for (String sAuthor : this.saleAuthors) {
            if (sAuthor != this.saleAuthors[0])
                stringToReturn = stringToReturn + ", ";
            stringToReturn = stringToReturn + sAuthor;

        }
        stringToReturn += "]" + "\n";
        stringToReturn += super.toString();
        return stringToReturn;
    }

    private int seekSalesAuthor (String author){
        int i = 0;
        for (String sAuthor : this.saleAuthors) {
            if (sAuthor.equalsIgnoreCase(author))
                return i;
            i++;
        }
        return -1;
    }



}
