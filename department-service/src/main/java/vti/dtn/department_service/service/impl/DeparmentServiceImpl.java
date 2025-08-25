package vti.dtn.department_service.service.impl;

import org.springframework.stereotype.Service;
import vti.dtn.department_service.dto.DepartmentDTO;
import vti.dtn.department_service.entity.DepartmentEntity;
import vti.dtn.department_service.repository.DepartmentRepository;

import java.util.List;
@Service
public class DeparmentServiceImpl implements vti.dtn.department_service.service.impl.DeparmentService {
    private final DepartmentRepository departmentRepository;

    public DeparmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        List<DepartmentEntity> departmentEntities = departmentRepository.findAll();
        return departmentEntities.stream()
                .map(departmentEntity -> DepartmentDTO.builder()
                        .name(departmentEntity.getName())
                        .type(departmentEntity.getType().toString())
                        .createdDate(departmentEntity.getCreatedAt())
                        .build())
                .toList();
    }
}
