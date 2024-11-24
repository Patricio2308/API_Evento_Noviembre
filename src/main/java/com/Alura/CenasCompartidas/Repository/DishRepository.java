package com.Alura.CenasCompartidas.Repository;

import com.Alura.CenasCompartidas.Model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish,Long> {
}
