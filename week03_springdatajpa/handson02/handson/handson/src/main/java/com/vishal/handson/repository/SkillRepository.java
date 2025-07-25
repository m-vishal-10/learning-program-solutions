package com.vishal.handson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.handson.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {}
