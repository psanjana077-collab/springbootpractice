package com.sbp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="resource")
public interface BookRepo extends JpaRepository<Book, Integer> {
	findByNameContaining(@Param("name") String name);
}
