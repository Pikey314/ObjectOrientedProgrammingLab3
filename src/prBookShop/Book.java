package prBookShop;

public class Book {
    public static double percIva = 10;
    private String author;
    private String title;
    private double basePrice;

    public Book (String author, String title, double basePrice) {
        this.author	= author;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public double amountDue() {
        double tax = percIva/100;
        return (this.basePrice + this.basePrice*tax);
    }

    public String toString() {
        return ("(" + this.author + "; " + this.title + "; " + this.basePrice + "; " + percIva + "%; " + amountDue()) + ")";
    }

    public static double getIVA() {
        return percIva;
    }

    public static void setIVA(double tax) {
        percIva = tax;
    }
}
