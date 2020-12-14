package com.jy.AgileProjectManagement.controller;

import com.jy.AgileProjectManagement.entity.Project;
import com.jy.AgileProjectManagement.service.BaseService;
import com.jy.AgileProjectManagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("project")
public class ProjectController extends BaseController<Project>{

    @Autowired
    ProjectService projectService;



}
