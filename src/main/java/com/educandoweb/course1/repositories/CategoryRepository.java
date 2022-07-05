package com.educandoweb.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course1.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
