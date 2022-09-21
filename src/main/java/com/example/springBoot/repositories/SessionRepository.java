package com.example.springBoot.repositories;

import com.example.springBoot.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {


}
