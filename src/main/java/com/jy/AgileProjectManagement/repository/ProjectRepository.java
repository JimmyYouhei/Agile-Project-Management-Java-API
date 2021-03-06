package com.jy.AgileProjectManagement.repository;

import com.jy.AgileProjectManagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface ProjectRepository extends BaseRepository<Project> {
}
