package com.jy.AgileProjectManagement.controller;

import com.jy.AgileProjectManagement.entity.BaseEntity;
import com.jy.AgileProjectManagement.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<T extends BaseEntity> {

    @Autowired
    BaseService<T> baseService;

    @GetMapping
    public List<T> getAll(){
        return baseService.getAll();
    }

    @GetMapping("/{id}")
    public T getById (@PathVariable Long id){
        return baseService.getById(id);
    }

    @PostMapping
    public T saveOne(@RequestBody  T entity){
        return baseService.saveOne(entity);
    }

    @PutMapping("/{id}")
    public T updateOne(@PathVariable Long id , @RequestBody T entity){
        entity.id = id;
        return baseService.updateOne(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        baseService.deleteOne(id);
    }
}
