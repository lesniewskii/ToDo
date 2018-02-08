package repositories;

import models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Adrian on 8/17/2017.
 */

@Repository
public interface TodoRepository extends MongoRepository<Todo, String>{
}
