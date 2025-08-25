package vti.dtn.department_service.service.impl;

import vti.dtn.department_service.dto.DepartmentDTO;
import vti.dtn.department_service.entity.DepartmentEntity;

import java.util.List;

public interface DeparmentService {
    public List<DepartmentDTO> getAllDepartments();
}
