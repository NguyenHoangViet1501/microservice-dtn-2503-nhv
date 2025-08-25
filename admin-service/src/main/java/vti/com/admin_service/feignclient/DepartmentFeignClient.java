package vti.com.admin_service.feignclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import vti.com.admin_service.dto.DepartmentDTO;

import java.util.List;

@RibbonClient(name = "department-service")
@FeignClient(name = "department-service", path = "/api/v1/departments")

public interface DepartmentFeignClient {

    @GetMapping
    List<DepartmentDTO> getAllDepartments();
}
