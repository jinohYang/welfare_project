package com.jinoh.welfare_project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jinoh.welfare_project.domain.Member;
import com.jinoh.welfare_project.repository.WalfareRepository;

@Service
public class WelfareService {
	
	private static final Logger log = LoggerFactory.getLogger(WelfareService.class);
	
	private final WalfareRepository walfareRepository;
	
	public WelfareService(WalfareRepository memberRepository) {
		this.walfareRepository = memberRepository;
	}
	
	public List<Member> getAllMembers() {
		log.info("모든 회원 조회 요청");
        List<Member> members = walfareRepository.findAll();
        
        log.debug("조회된 회원 수: {}", members.size());
        return members;
    }
}
