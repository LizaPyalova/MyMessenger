package com.example.Messenger.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Messenger.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByPhoneNumber(String number);
    List<User> findByLogin(String login);
}
