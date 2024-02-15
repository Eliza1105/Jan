package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

//1. Имеется список книг. Вывести книги до определенного года
// издания и в отсортированном порядке.
public class Classwork1502 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Алиса в стране чудес", "Л.Керролл", 1865));
        books.add(new Book("Властелин колец", "Дж.Р.Р. Толкин", 1954));
        books.add(new Book("Мастер и Маргарита", "М.А.Булгаков", 1966));
        books.add(new Book("Приключения Чипполино", "Дж.Родари", 1951));
        books.add(new Book("Библиотекарь", "М.Ю.Елизаров", 2007));

        Collections.sort(books);
        for (Book book: books){
           // book.compareTo(books.get(1));
           // System.out.println(book.getName()+ book.getYearOfPublication());
            if (book.getYearOfPublication()<1960){
                System.out.println(book.toString());
            }

        }
    }
}
class Book implements Comparable<Book>{
    private String name;
    private String autor;
    int yearOfPublication;

    public Book(String name, String autor, int yearOfPublication) {
        this.name = name;
        this.autor = autor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(name, book.name) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, autor, yearOfPublication);
    }

    @Override
    public int compareTo(Book book) {
        if (yearOfPublication == book.yearOfPublication ){
        return 0 ;}
        if (yearOfPublication< book.yearOfPublication){
            return  -1;}
        if (yearOfPublication< book.yearOfPublication){
            return 1;}
        return 1;
    }

}

