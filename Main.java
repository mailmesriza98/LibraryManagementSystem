import DataBase.Library;
import service.LibraryOperations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        LibraryOperations operations = new LibraryOperations();
        operations.registerBook("b1", "a1", 5);
        operations.registerBook("b2", "a2", 5);

        operations.registerstudent("s1", "id1", "d1", 1);
        operations.registerstudent("s2", "id2", "d2", 2);

        operations.borrowBook("id1", "b1");
        operations.borrowBook("id1", "b2");
        operations.borrowBook("id2", "b2");

        operations.showBorrowedBooks("id1");
        operations.showBorrowedBooks("id2");

    }
}
