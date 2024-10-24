package com.jbk.jbkproject.Dao;

import com.jbk.jbkproject.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepo extends JpaRepository<Product, Long> {
}
