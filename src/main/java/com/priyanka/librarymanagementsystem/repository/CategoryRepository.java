package com.priyanka.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyanka.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
