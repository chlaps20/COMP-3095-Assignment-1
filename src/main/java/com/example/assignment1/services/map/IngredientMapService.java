package com.example.assignment1.services.map;

import com.example.assignment1.model.Client;
import com.example.assignment1.model.Ingredient;
import com.example.assignment1.services.CrudService;

import java.util.Set;

public class IngredientMapService extends AbstractMapService<Ingredient,Long> implements CrudService<Ingredient,Long>
{

    public Set<Ingredient> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Ingredient object) {
        super.delete(object);
    }

    @Override
    public Ingredient save(Ingredient object) {
        return super.save(object.getId(object));
    }

    @Override
    public Ingredient findById(Long id) {
        return super.findById(id);
    }
}
