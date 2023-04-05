package com.epoint.meeting.mapper;

import com.epoint.meeting.model.Department;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    Department getDeptById(@Param("id") String id);
}
