package vti.com.admin_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vti.com.admin_service.dto.DepartmentDTO;
import vti.com.admin_service.feignclient.DepartmentFeignClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final DepartmentFeignClient departmentFeignClient;

    public List<DepartmentDTO> getAllDepartments() {
        return departmentFeignClient.getAllDepartments();
    }
}
