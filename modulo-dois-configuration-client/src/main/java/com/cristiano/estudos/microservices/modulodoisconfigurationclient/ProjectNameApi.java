package com.cristiano.estudos.microservices.modulodoisconfigurationclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProjectNameApi {

    private String projectName;

    @Autowired
    public ProjectNameApi(@Value("${configuration.projectName}") String projectName) {
        this.projectName = projectName;
    }

    @GetMapping("/")
    public String getProjectName(){
        return this.projectName;
    }
}
