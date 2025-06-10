package com.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.app.model.Salaries;

public interface DboSalariesRepository extends JpaRepository<Salaries, Long> {
}
