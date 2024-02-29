package xml;

import javax.xml.bind.*;
import java.io.File;
import java.util.Date;

public class WriteXML {
    public static void main(String[] args) {
       Books books = new Books();
        Book book = new Book();
        book.setId(1L);
        book.setName("Name");
        book.setDate(new Date());

        books.addBook(book);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setName("Name 2");
        book2.setDate(new Date());

        books.addBook(book2);

        try {
            JAXBContext context = JAXBContext.newInstance(Books.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(books, new File("src/data/books.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }
}
