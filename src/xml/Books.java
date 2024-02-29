package xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

    @XmlRootElement(name = "books")
    @XmlAccessorType( XmlAccessType.FIELD)
    public class Books implements Serializable
    {
        @XmlElement(name = "book")
        private List<Book> books = new ArrayList<>();

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }

        public void addBook(Book book){
            books.add(book);
        }
}
