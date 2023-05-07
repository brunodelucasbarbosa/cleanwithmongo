package br.com.pratice.cleanwithmongo.application;

import br.com.pratice.cleanwithmongo.adapters.in.CreateUserRequest;
import br.com.pratice.cleanwithmongo.adapters.out.UserDTO;
import br.com.pratice.cleanwithmongo.domain.models.user.User;

public interface UserService {

    User create(CreateUserRequest user);
}
