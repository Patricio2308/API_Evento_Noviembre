package com.Alura.CenasCompartidas.Service;

import com.Alura.CenasCompartidas.Model.Dish;
import com.Alura.CenasCompartidas.Repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService implements IDishService{

    @Autowired
    private DishRepository dishRepository;

    @Override
    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    @Override
    public Dish findById(Long id) {
        return dishRepository.findById(id).orElse(null);
    }
}
