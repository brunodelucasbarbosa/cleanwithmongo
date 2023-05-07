package br.com.pratice.cleanwithmongo.adapters.out;

import br.com.pratice.cleanwithmongo.domain.models.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String email;
}