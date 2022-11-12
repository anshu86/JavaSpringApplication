package springWebApp.WebApp1.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springWebApp.WebApp1.domain.Author;
import springWebApp.WebApp1.domain.Book;
import springWebApp.WebApp1.repositories.AuthorRepository;
import springWebApp.WebApp1.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author swati = new Author("Swati","Shukla");
        Book ddd = new Book("Domain Driver Design", "123123");
        swati.getBooks().add(ddd);
        ddd.getAuthor().add(swati);

        authorRepository.save(swati);
        bookRepository.save(ddd);

        Author anshuman = new Author("Anshuman","Shukla");
        Book jstb = new Book("Java Spring Tutorial for Beginners", "123124");
        anshuman.getBooks().add(jstb);
        jstb.getAuthor().add(anshuman);

        authorRepository.save(anshuman);
        bookRepository.save(ddd);

        System.out.println(".....Started in BootStrap.....");
        System.out.println("Number of Books in Repository = "+bookRepository.count());

    }
}
