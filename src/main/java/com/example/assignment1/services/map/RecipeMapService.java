package com.example.assignment1.services.map;

import com.example.assignment1.model.Client;
import com.example.assignment1.services.CrudService;

import java.util.Set;

public class RecipeMapService extends AbstractMapService<Recipe,Long> implements CrudService<Recipe,Long> {
    @Override
    public Set<Recipe> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Recipe object) {
        super.delete(object);
    }

    @Override
    public Recipe save(Recipe object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Recipe findById(Long id) {
        return super.findById(id);
    }
}
