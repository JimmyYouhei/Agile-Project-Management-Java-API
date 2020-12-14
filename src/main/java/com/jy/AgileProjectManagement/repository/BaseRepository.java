package com.jy.AgileProjectManagement.repository;

import com.jy.AgileProjectManagement.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> {
}
