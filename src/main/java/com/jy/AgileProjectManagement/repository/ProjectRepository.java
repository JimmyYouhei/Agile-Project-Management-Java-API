package com.jy.AgileProjectManagement.repository;

import com.jy.AgileProjectManagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project , Long> {
}
