package com.school.service;

import com.school.dto.ApiRes;
import com.school.entity.School;
import com.school.repo.SchoolRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService{

    private final SchoolRepo schoolRepo;

    @Override
    public List<School> getAllSchools() {
        return schoolRepo.findAll();
    }

    @Override
    public ApiRes saveSchool(School school) {
        School s = schoolRepo.save(school);
        return new ApiRes("Saved Successfully", s.getId());
    }

    @Override
    public ApiRes updateSchool(School school) {
        schoolRepo.save(school);
        return new ApiRes("Updated Successfully", school.getId());
    }

    @Override
    public ApiRes deleteSchool(Long id) {
        schoolRepo.delete(schoolRepo.getReferenceById(id));
        return  new ApiRes("Deleted Successfully", id);
    }
}
