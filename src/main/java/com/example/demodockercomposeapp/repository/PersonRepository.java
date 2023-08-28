package com.example.demodockercomposeapp.repository;

import com.example.demodockercomposeapp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
