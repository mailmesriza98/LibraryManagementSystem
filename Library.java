import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    HashMap<String,List<String>> borrowed;
    List<Student> students;
    List<Book> books;

    Library(){
        books = new ArrayList<>();
        students = new ArrayList<>();
        borrowed= new HashMap<>();
    }
    public void registerBook(String name, String author, int qty) {
        Book book = new Book(name,author,qty);
        books.add(book);
    }

    public void registerStudent(String sName, String id, String dept, int roll) {
        Student student = new Student(sName, id, dept, roll);
        students.add(student);
    }

    public void showBook(String studentId) {
        if(borrowed.containsKey(studentId)){
            List<String> books = borrowed.get(studentId);
            System.out.println(studentId+" borrowed ");
            for(String book: books){
                System.out.println(book);
            }
        }else{
            System.out.println("This student havent borrowed any book yet");
        }
    }

    public void borrowBook(String studId, String bookName) {
        if(!borrowed.containsKey(studId)){
            List<String> books = new ArrayList<>();
            books.add(bookName);
            borrowed.put(studId, books);
        }else{
            List<String> books = borrowed.get(studId);
            books.add(bookName);
            borrowed.put(studId, books);
        }
        System.out.println(borrowed);

    }
}
