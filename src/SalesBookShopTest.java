import prBookShop.*;

public class SalesBookShopTest {

    public static void main(String [] args){
        String[] authors = {"George Orwell", "Isaac Asimov"};
        SalesBookShop sbs = new SalesBookShop(20, authors);

        sbs.addBook("george orwell", "1984", 8.20);
        sbs.addBook("Philip K. Dick", "Suenan los androides con ovejas electricas?", 3.50);
        sbs.addBook("Isaac Asimov", "Fundacion e Imperio", 9.40);
        sbs.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
        sbs.addBook("Alex Huxley", "Un Mundo Feliz", 6.50);
        sbs.addBook("Isaac Asimov", "La Fundacion", 7.30);
        sbs.addBook("William Gibson", "Neuromante", 8.30);
        sbs.addBook("Isaac Asimov", "Segunda Fundacion", 8.10);
        sbs.addBook("Isaac Newton", "arithmetica universalis", 7.50);
        sbs.addBook("George Orwell", "1984", 6.20);
        sbs.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);

        System.out.println(sbs.toString());

        sbs.deleteBook("George Orwell", "1984");
        sbs.deleteBook("Alex Huxley", "Un Mundo Feliz");
        sbs.deleteBook("Isaac Newton", "Arithmetica Universalis");

        System.out.println();
        System.out.println();
        System.out.println(sbs.toString());
        System.out.println();
        System.out.println();

        System.out.println(sbs.getAmountDue("George Orwell", "1984"));
        System.out.println(sbs.getAmountDue("Philip K. Dick", "Suenan los androides con ovejas electricas?"));
        System.out.println(sbs.getAmountDue("isaac asimov", "Fundacion e imperio"));
        System.out.println(sbs.getAmountDue("Ray Bradbury", "Fahrenheit 451"));
        System.out.println(sbs.getAmountDue("Alex Huxley", "Un Mundo Feliz"));
        System.out.println(sbs.getAmountDue("Isaac Asimov", "La Fundacion"));
        System.out.println(sbs.getAmountDue("william gibson", "neuromante"));
        System.out.println(sbs.getAmountDue("Isaac Asimov", "Segunda Fundacion"));
        System.out.println(sbs.getAmountDue("Isaac Newton", "Arithmetica Universalis"));
    }
}
