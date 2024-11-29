package com.Alura.CenasCompartidas.Service;

import com.Alura.CenasCompartidas.Model.Dish;
import com.Alura.CenasCompartidas.Repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DishService implements IDishService{

    @Autowired
    private DishRepository dishRepository;

    @Override
    @Transactional
    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    @Override
    @Transactional
    public Dish findById(Long id) {
        return dishRepository.findById(id).orElse(null);
    }
    @Override
    @Transactional
    public Dish save(Dish dish){
        return dishRepository.save(dish);
    }
    @Override
    @Transactional
    public Dish updateDish(Long id, Dish dish) throws Exception{
        Optional<Dish> dishOptional = dishRepository.findById(id);
        if(dishOptional.isEmpty()){
            throw new Exception("El platillo de id "+ id +" no fue encontrado");
        }
        Dish dishToUpdate = dishOptional.get();
        dishToUpdate.setNameDish(dish.getNameDish());
        dishToUpdate.setTypeDish(dish.getTypeDish());
        dishToUpdate.setChefName(dish.getChefName());
        dishToUpdate.setUserName(dish.getUserName());

        return dishRepository.save(dishToUpdate);
    }

    @Override
    public void delete(Long id) throws Exception{
        Optional<Dish> existingDish = dishRepository.findById(id);
        if(existingDish.isEmpty()){
            throw new Exception("El platillo de id "+ id +" no fue encontrado");
        }
        dishRepository.deleteById(id);
    }

}
