package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

    PasswordResetToken findByToken(String token);
}
