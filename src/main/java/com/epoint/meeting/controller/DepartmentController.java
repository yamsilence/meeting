package com.epoint.meeting.controller;

import com.epoint.meeting.model.Department;
import com.epoint.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getdept/{id}")
    public Department getDeptById(@PathVariable String id){
        return  departmentService.getDeptById(id);
    }

}
