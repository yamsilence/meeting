package com.epoint.meeting.service;

import com.epoint.meeting.mapper.DepartmentMapper;
import com.epoint.meeting.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    public Department getDeptById(String id) {
        return departmentMapper.getDeptById(id);
    }
}
