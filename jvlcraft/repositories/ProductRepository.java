package com.jvlcode.jvlcraft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jvlcode.jvlcraft.models.Product;

@Repository 
public interface ProductRepository extends JpaRepository <Product,Long> {

}
