package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserViewMapperTest {

    private final String NAME = "FULANO";
    private final String EMAIL = "FULANO@FULANO.COM";
    private final String PASSWORD = "123";
    private UserViewMapper mapper;

    @Test
    void sholdConvertUserToUserView() {
        var user = new User(NAME, EMAIL, PASSWORD);
        mapper = new UserViewMapper();

        var userView = mapper.map(user);

        assertEquals(NAME, userView.getName());
        assertEquals(EMAIL, userView.getEmail());
    }
}