package springWebApp.WebApp1.repositories;

import springWebApp.WebApp1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
