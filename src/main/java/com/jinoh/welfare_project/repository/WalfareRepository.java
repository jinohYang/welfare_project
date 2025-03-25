package com.jinoh.welfare_project.repository;

import com.jinoh.welfare_project.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalfareRepository extends JpaRepository<Member, Long> {
}