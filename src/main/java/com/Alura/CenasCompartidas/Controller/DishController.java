package com.Alura.CenasCompartidas.Controller;

import com.Alura.CenasCompartidas.Model.Dish;
import com.Alura.CenasCompartidas.Service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
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
        try {
            return ResponseEntity.status(HttpStatus.OK).body(dishService.findById(id));
        } catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Dish> setDish(@RequestBody Dish dish) {
        try {
           return ResponseEntity.ok(dishService.save(dish));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Dish> updateDish(@PathVariable Long id, @RequestBody Dish dish) {
        try {
            Dish dishUpdated = dishService.updateDish(id, dish); /*De esta manera se verifica la no existencia del elemento*/
            return ResponseEntity.ok(dishUpdated);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDish(@PathVariable Long id) {
        try {
            dishService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return  ResponseEntity.internalServerError().build();
        }
    }
}
