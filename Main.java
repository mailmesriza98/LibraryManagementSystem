import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Library library = new Library();
        while(true) {
            String menu = "Hi, please choose from below options :\n " +
                    " 1. Register a new book with quantity\n" +
                    " 2. register a new Student with ID, name, department, rollNumber\n" +
                    " 3. see all the books borrowed by a Student\n" +
                    " 4. (for students) borrow a book" +
                    " enter a number to continue\n";
            System.out.println(menu);
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter book name, author,qty");
                    String name = sc.next();
                    String author = sc.next();
                    int qty = sc.nextInt();
                    sc.nextLine();
                    library.registerBook(name, author, qty);
                    break;
                case 2:
                    System.out.println("Enter student name, ID, department, rollno");
                    String s_name = sc.next();
                    String id = sc.next();
                    String dept = sc.next();
                    int roll = sc.nextInt();
                    ;
                    library.registerStudent(s_name, id, dept, roll);
                    break;
                case 3:
                    System.out.println("Enter student id to see borrowed books");
                    String student_id = sc.next();
                    library.showBook(student_id);
                    break;
                case 4:
                    System.out.println("Enter student id and bookname");
                    String stud_id = sc.next();

                    String book_name = sc.next();
                    library.borrowBook(stud_id, book_name);
                    break;
                default:
                    System.out.println("Invalid input try options 1 through 4");
                    return;
            }
        }


    }
}
