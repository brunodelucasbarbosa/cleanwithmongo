package br.com.pratice.cleanwithmongo.domain.usecases;

import br.com.pratice.cleanwithmongo.adapters.in.CreateUserRequest;
import br.com.pratice.cleanwithmongo.application.UserService;
import br.com.pratice.cleanwithmongo.domain.models.user.User;
import br.com.pratice.cleanwithmongo.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserUseCase implements UserService {

    private UserRepository userRepository;

    @Override
    public User create(CreateUserRequest user) {
        try {
            return userRepository.save(new User(null, user.getName(), user.getEmail()));
        } catch (Exception e) {
            throw new RuntimeException("Error to create user");
        }
    }
}
