package vti.dtn.department_service.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vti.dtn.department_service.dto.DepartmentDTO;
import vti.dtn.department_service.service.impl.DeparmentService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/departments")
public class DepartmentController {
    private final DeparmentService deparmentService;

    @GetMapping
    public List<DepartmentDTO> getListDepartment(){
        return deparmentService.getAllDepartments();
    }
}
