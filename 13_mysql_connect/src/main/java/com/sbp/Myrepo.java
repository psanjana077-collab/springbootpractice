package com.sbp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Myrepo extends JpaRepository<Student, Integer> {
  List<Student> findAll();
}
