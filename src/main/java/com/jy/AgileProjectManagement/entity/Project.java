package com.jy.AgileProjectManagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "project")
public class Project extends BaseEntity{

    @Column(name ="project_name")
    public String projectName;

    @Column(name = "project_description")
    public String projectDescription;

    @Column(name = "project_version")
    public String projectVersion;

}
