package com.bridgelabz.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller	// Whenever you get a request your spring boot application will
			//  make sure that this controller will handle the request
public class HomeController {
	@RequestMapping("home")	 // Mentions Which request you want to handle
	 // @ResponseBody        // It Will Print data but we don't need data we want to call the home.jsp page 
	 						 // Unfortunately Spring Boot Doesn't Support Jsp 
	 public ModelAndView home(Student student)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("object",student);
		mv.setViewName("home");
		return mv;    
	}
	
	 
	/*Using HttpSession
	 * public String home(@RequestParam("name") String myName,HttpSession session)
	{
	System.out.println("Hi..." +myName);
	session.setAttribute("name", myName); // Data
	return "home";    // View Name
	}*/
	
	/* Using HttpServletRequest
	 * 
	 * public String home(HttpServletRequest request)
		{
			HttpSession session = request.getSession(); 
			String name=request.getParameter("name");
			System.out.println("Hi..." +name);
			session.setAttribute("name", name);
			return "home";
		}*/
}
