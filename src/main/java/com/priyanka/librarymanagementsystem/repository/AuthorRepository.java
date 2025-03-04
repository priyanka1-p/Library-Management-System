package com.priyanka.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyanka.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
