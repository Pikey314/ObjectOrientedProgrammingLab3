package prBookShop;

public class FlexibleSalesBookShop extends BookShop {
    private FlexibleSales sale;

    public FlexibleSalesBookShop (FlexibleSales sale){
        super();
        this.sale = sale;
    }

    public FlexibleSalesBookShop (int capacity, FlexibleSales sale){
        super(capacity);
        this.sale = sale;
    }

    public void setOferta(FlexibleSales sale){
        this.sale = sale;
    }

    public FlexibleSales getFlexibleSale(){
        return this.sale;

    }

    @Override
    public void addBook(String author, String title, double price) {
        Book book = new Book(author, title, price);
        double discountPercentage = sale.getDiscountPercentage(book);
        if (discountPercentage > 0) {
            book = new SalesBook(author, title, price, discountPercentage);
            addBook(book);
        }
        else
            addBook(book);
    }

    @Override
    public String toString() {
            String stringToReturn = sale.toString();
            stringToReturn += super.toString();
            return stringToReturn;

    }
}
