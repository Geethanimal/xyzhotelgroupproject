package com.example.xyzhotel.repository;

import com.example.xyzhotel.model.UserObj;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserObj,Long>{
    public UserObj findByEmail(String email);
    public UserObj findByEmailAndPassword(String email, String password);


}
