package com.example.demo.repository;

import com.example.demo.model.Supervisor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISupervisorRepository extends CrudRepository<Supervisor, Long> {
}
