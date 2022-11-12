package springWebApp.WebApp1.repositories;

import springWebApp.WebApp1.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
}
