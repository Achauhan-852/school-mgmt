package com.school.service;

import com.school.dto.ApiRes;
import com.school.entity.School;

import java.util.List;

public interface SchoolService {
    List<School> getAllSchools();

    ApiRes saveSchool(School school);
}
