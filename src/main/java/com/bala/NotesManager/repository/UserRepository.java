package com.bala.NotesManager.repository;

import com.bala.NotesManager.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel , Long> {
    Optional<UserModel> findUserByName(String username);
    Boolean findUserExists(String username);

}
