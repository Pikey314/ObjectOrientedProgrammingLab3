package prBookShop;

public class SalesPrice implements FlexibleSales {

    private double discountPercentage;
    private double priceTreshold;

    public SalesPrice (double discountPercentage, double priceTreshold){
        this.discountPercentage = discountPercentage;
        this.priceTreshold = priceTreshold;
    }

    @Override
    public double getDiscountPercentage(Book book) {
        if (book.getBasePrice() >= this.priceTreshold)
            return this.discountPercentage;
        else
            return 0;
    }

    @Override
    public String toString() {
        String stringToReturn = this.discountPercentage + "% (" + this.priceTreshold + ")";
        return stringToReturn;
    }
}
