package br.com.pratice.cleanwithmongo.domain.repository;

import br.com.pratice.cleanwithmongo.domain.models.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, Long> {

    User findByEmail(String name);
}
