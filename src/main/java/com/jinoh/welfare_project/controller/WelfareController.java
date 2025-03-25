package com.jinoh.welfare_project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinoh.welfare_project.domain.Member;
import com.jinoh.welfare_project.service.WelfareService;

@Controller
public class WelfareController {
	
	private final WelfareService welfareService;
	
	public WelfareController(WelfareService welfareService) {
        this.welfareService = welfareService;
    }

	@RequestMapping("/home")
	public String home(Model model) {
        // member Data
		List<Member> members = welfareService.getAllMembers();
		
        model.addAttribute("members", members);

        return "home"; // templates/home.html 렌더링
    }
	
}
