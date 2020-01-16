package br.com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
