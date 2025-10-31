package com.codingshuttle.jpaTutorial.Jpatuts.repositories;

import com.codingshuttle.jpaTutorial.Jpatuts.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
