package prBookShop;

public class SalesBook extends Book {

    private double discountPercentage;

    public SalesBook (String author, String title, double basePirce, double discountPercentage) {
        super(author,title,basePirce);
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage(){
        return this.discountPercentage;
    }

    @Override
    public double amountDue() {
        double tax = percIva/100;
        return (this.getSalesPrice() + this.getSalesPrice()*tax);
    }

    @Override
    public String toString() {
        return ("(" + this.getAuthor() + "; " + this.getTitle() + "; " + this.getBasePrice() + "; " + getDiscountPercentage() + "%; " + getSalesPrice() + "; " + percIva + "%; " + Math.round(amountDue() * 100.0) / 100.0) + ")";

    }

    private double getSalesPrice(){
        double basePrice = this.getBasePrice();
        double salesPrice = basePrice - basePrice*this.discountPercentage/100;
        return salesPrice;
    }
}
