package com.ketanbd.springbootangularfsapp.Repository;

import com.ketanbd.springbootangularfsapp.Dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<UserDTO, Long> {
    UserDTO findByName(String name);
}

