package co.grandcircus.winterlab;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {
	
		@RequestMapping("/")
		public ModelAndView showHome()   {
			ModelAndView mav = new ModelAndView("index");
			return mav;
		
		}
		
		@RequestMapping("/mileageform")
		public ModelAndView showAddForm() {
			return new ModelAndView("milegeform");
		}
		
		@RequestMapping("/results")
		public ModelAndView showAddResult(
				@RequestParam("mpg") int mpg,
				@RequestParam("gallons") int gallons) {
					int results = mpg * gallons;
					
					ModelAndView mav = new ModelAndView("results");
					mav.addObject("mpg", mpg);
					mav.addObject("gallons", gallons);
					mav.addObject("results", results);
					return mav;
				}	
	}