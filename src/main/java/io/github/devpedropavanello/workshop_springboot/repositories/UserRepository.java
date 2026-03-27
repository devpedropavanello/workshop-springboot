package io.github.devpedropavanello.workshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.devpedropavanello.workshop_springboot.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
