package io.zwen.ppmtoolfullstack.services;

import io.zwen.ppmtoolfullstack.domain.Project;
import io.zwen.ppmtoolfullstack.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        return projectRepository.save(project);
    }
}
