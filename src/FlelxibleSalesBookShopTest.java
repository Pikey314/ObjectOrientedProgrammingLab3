import prBookShop.*;

public class FlelxibleSalesBookShopTest {

    public static void main(String [] args){
        String[] authors = {"George Orwell", "Isaac Asimov"};
        SalesAuthor salesAuthor = new SalesAuthor(20, authors);

        FlexibleSalesBookShop fsbs = new FlexibleSalesBookShop(salesAuthor);

        fsbs.addBook("george orwell", "1984", 8.20);
        fsbs.addBook("Philip K. Dick", "Suenan los androides con ovejas electricas?", 3.50);
        fsbs.addBook("Isaac Asimov", "Fundacion e Imperio", 9.40);
        fsbs.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
        fsbs.addBook("Alex Huxley", "Un Mundo Feliz", 6.50);
        fsbs.addBook("Isaac Asimov", "La Fundacion", 7.30);
        fsbs.addBook("William Gibson", "Neuromante", 8.30);
        fsbs.addBook("Isaac Asimov", "Segunda Fundacion", 8.10);
        fsbs.addBook("Isaac Newton", "arithmetica universalis", 7.50);
        fsbs.addBook("George Orwell", "1984", 6.20);
        fsbs.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);

        System.out.println(fsbs.toString());

        fsbs.deleteBook("George Orwell", "1984");
        fsbs.deleteBook("Alex Huxley", "Un Mundo Feliz");
        fsbs.deleteBook("Isaac Newton", "Arithmetica Universalis");

        System.out.println();
        System.out.println();
        System.out.println(fsbs.toString());
        System.out.println();
        System.out.println();

        System.out.println(fsbs.getAmountDue("George Orwell", "1984"));
        System.out.println(fsbs.getAmountDue("Philip K. Dick", "Suenan los androides con ovejas electricas?"));
        System.out.println(fsbs.getAmountDue("isaac asimov", "Fundacion e imperio"));
        System.out.println(fsbs.getAmountDue("Ray Bradbury", "Fahrenheit 451"));
        System.out.println(fsbs.getAmountDue("Alex Huxley", "Un Mundo Feliz"));
        System.out.println(fsbs.getAmountDue("Isaac Asimov", "La Fundacion"));
        System.out.println(fsbs.getAmountDue("william gibson", "neuromante"));
        System.out.println(fsbs.getAmountDue("Isaac Asimov", "Segunda Fundacion"));
        System.out.println(fsbs.getAmountDue("Isaac Newton", "Arithmetica Universalis"));


    }

}
