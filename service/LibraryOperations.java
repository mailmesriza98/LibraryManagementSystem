package service;

import DataBase.Library;

public class LibraryOperations {
    Library library = new Library();

    public void registerstudent(String sName, String id, String dept, int roll){
        library.registerStudent(sName, id, dept, roll);
    }

    public void registerBook(String name, String author, int qty){
        library.registerBook(name, author,qty);
    }

    public void showBorrowedBooks(String student_id){
        library.showBook(student_id);
    }

    public void borrowBook(String studentId, String bookname){
        library.borrowBook(studentId, bookname);
    }
}
