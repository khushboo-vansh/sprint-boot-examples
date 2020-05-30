package com.krv.spring.study.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krv.spring.study.entity.ToDoEntity;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, UUID> {

}
