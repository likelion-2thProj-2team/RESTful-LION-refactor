package com.hppystay.hotelreservation.auth.repository;

import com.hppystay.hotelreservation.auth.entity.EmailVerification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface VerificationRepository extends JpaRepository<EmailVerification, Long> {
    boolean existsByEmail(String email);
    void deleteByEmail(String email);
    Optional<EmailVerification> findByEmail(String email);

}
