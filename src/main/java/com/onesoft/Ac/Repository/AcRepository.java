package com.onesoft.Ac.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.Ac.Entity.Ac;


public interface AcRepository extends JpaRepository<Ac, Integer> {
}
