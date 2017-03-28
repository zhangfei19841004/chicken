package com.zf.controller.login;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zf.info.LoginInfo;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Map<String, Object> map) {
		return "login";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(HttpSession session, Map<String, Object> map) {
		String username = (String) session.getAttribute("username");
		map.put("username", username);
		return "welcome";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginInfo info, HttpSession session) {
		session.setAttribute("username", info.getUsername());
		return "redirect:/welcome";
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.setAttribute("username", null);
		return "redirect:/";
	}
	
}
