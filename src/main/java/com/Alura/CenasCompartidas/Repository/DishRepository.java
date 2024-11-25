package com.Alura.CenasCompartidas.Repository;

import com.Alura.CenasCompartidas.Model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {
}
