package prBookShop;

public class SalesAuthor implements FlexibleSales{

    private double discountPercentage;
    private String[] salesAuthor;

    public SalesAuthor (double  discountPercentage, String[] salesAuthor){
        this.discountPercentage = discountPercentage;
        this.salesAuthor = salesAuthor;
    }

    @Override
    public double getDiscountPercentage(Book book) {
        String bookAuthor = book.getAuthor();
        for (String author : this.salesAuthor)
            if (author.equalsIgnoreCase(bookAuthor))
                return this.discountPercentage;

        return 0;

    }

    @Override
    public String toString() {
        String stringToReturn = this.discountPercentage + "%[";
        for (String sAuthor : this.salesAuthor) {
            if (sAuthor != this.salesAuthor[0])
                stringToReturn = stringToReturn + ", ";
            stringToReturn = stringToReturn + sAuthor;

        }
        stringToReturn += "]" + "\n";
        return stringToReturn;
    }
}
