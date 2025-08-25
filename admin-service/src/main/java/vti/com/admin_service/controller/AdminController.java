package vti.com.admin_service.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vti.com.admin_service.dto.DepartmentDTO;
import vti.com.admin_service.service.AdminService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/admin")
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/departments")
    public List<DepartmentDTO> getDepartments() {
        return adminService.getAllDepartments();
    }
}
