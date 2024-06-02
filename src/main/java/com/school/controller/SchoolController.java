package com.school.controller;

import com.school.dto.ApiRes;
import com.school.entity.School;
import com.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping("schools")
    public List<School> getSchool(){
        log.info("Fetching all schools");
        return schoolService.getAllSchools();
    }



    @PostMapping("save-school")
    public ApiRes saveSchool(@RequestBody School school){
        log.info("Saving school: {}", school.toString());
        return schoolService.saveSchool(school);

    }
}
