package com.a.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a.project.model.CreateUser;
import com.a.project.model.JoinUser;
import com.a.project.service.UserService;

@Controller
public class JoinController {
	@Autowired
	private UserService us;
	
	@RequestMapping("main")
	public String main() {
		
		
		return "main";
		
	}
	@RequestMapping("loginsuccess")
	public String loginsuccess() {
		return "loginsuccess";
	}
	
	@RequestMapping("joinform")
	public String joinform(Model model,HttpServletRequest request) {

		return "joinform";
	}
	
	@RequestMapping("joinsuccess")
	public String joinsuccess(Model model,HttpServletRequest request) {
		JoinUser joinuser =new JoinUser();
		
		joinuser.setId(request.getParameter("userID"));
		joinuser.setPassword(request.getParameter("userPW"));
		joinuser.setName(request.getParameter("userName"));
		joinuser.setEmail(request.getParameter("userEmail"));
		joinuser.setNickname(request.getParameter("nickname"));
		
		if(joinuser!=null) {
			us.insert(joinuser);
		}
		model.addAttribute("joinuser", joinuser);
		
		return "joinsuccess";
		
		
	}
	
	@RequestMapping("createform")
	public String createform() {
		return "createform";
	}
	
	@RequestMapping("createsuccess")
	public String createsuccess(Model model,HttpServletRequest request) {
		CreateUser createuser = new CreateUser();
		
		createuser.setCardnum(request.getParameter("cardnum"));
		createuser.setCardpwd(request.getParameter("cardpwd"));
		createuser.setBank(request.getParameter("bank"));
		
		return "createsuccess";
	}
	
	@RequestMapping("boardform")
	public String boardform() {
		return "boardform";
	}
	
}
