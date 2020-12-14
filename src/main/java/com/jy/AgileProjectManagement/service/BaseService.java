package com.jy.AgileProjectManagement.service;

import com.jy.AgileProjectManagement.entity.BaseEntity;
import com.jy.AgileProjectManagement.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BaseService <T extends BaseEntity> {

    @Autowired
    BaseRepository<T> baseRepository;

    public List<T> getAll (){
        return baseRepository.findAll();
    }

    public T getById(Long id){
        return baseRepository.getOne(id);
    }

    public T saveOne (T entity){
        return baseRepository.save(entity);
    }

    public T updateOne (T entity){
        return baseRepository.save(entity);
    }

    public void deleteOne (Long id){
        baseRepository.deleteById(id);
    }
}
