package com.Alura.CenasCompartidas.Controller;

import com.Alura.CenasCompartidas.Model.Dish;
import com.Alura.CenasCompartidas.Service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/dish")
public class DishController {

    @Autowired
    private IDishService dishService;

    @GetMapping
    public ResponseEntity<List<Dish>> getDishes(){
        return ResponseEntity.status(HttpStatus.OK).body(dishService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dish> getDish(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(dishService.findById(id));
    }
}
