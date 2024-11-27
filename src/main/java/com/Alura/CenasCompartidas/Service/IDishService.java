package com.Alura.CenasCompartidas.Service;

import com.Alura.CenasCompartidas.Model.Dish;

import java.util.List;

public interface IDishService {

    List<Dish> findAll();
    Dish findById(Long id);
    Dish save(Dish dish);
    Dish updateDish(Long id, Dish dish);
}
