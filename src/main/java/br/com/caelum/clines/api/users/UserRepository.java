package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.Aircraft;
import br.com.caelum.clines.shared.domain.User;
import org.springframework.data.repository.Repository;
import java.util.Collection;
import java.util.Optional;


import java.util.Collection;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import br.com.caelum.clines.shared.domain.User;

public interface UserRepository extends Repository<User, Long> {

    Collection<User> findAll();

    Optional<User> findById(Long id);

    void save(User user);

    Optional<User> findByEmail(String email);

}
