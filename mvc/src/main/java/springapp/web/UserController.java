package springapp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import springapp.domain.User;
import springapp.service.UserService;

public class UserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserService userService = new UserService();
		User user = userService.getUser(1);
		// TODO Auto-generated method stub
		return new ModelAndView("user", "user",user);
	}
	

}
