package com.cleverit.java.danielnamur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleverit.java.danielnamur.models.LicensePlate;

@Repository
public interface LicensePlateRepository extends JpaRepository<LicensePlate, String> {

}
