package br.com.pratice.cleanwithmongo.adapters.routes;

import br.com.pratice.cleanwithmongo.adapters.in.CreateUserRequest;
import br.com.pratice.cleanwithmongo.application.UserService;
import br.com.pratice.cleanwithmongo.domain.models.user.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class CreateUserController {

    private UserService useCase;
    @PostMapping("/create")
    public User create(@RequestBody CreateUserRequest user) {
        return useCase.create(user);
    }
}
