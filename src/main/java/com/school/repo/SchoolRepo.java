package com.school.repo;

import com.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School, Long> {
}
