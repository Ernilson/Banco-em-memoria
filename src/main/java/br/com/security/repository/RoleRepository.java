package br.com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.security.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
