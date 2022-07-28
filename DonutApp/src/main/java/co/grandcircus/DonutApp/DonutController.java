package co.grandcircus.DonutApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DonutController {

	@Autowired
	DonutService ds;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("donuts", ds.getAllDonuts());
		return "home";
	}
	
	@RequestMapping("/donut-details")
	public String donutDetails(Model model, @RequestParam Integer id) {
		model.addAttribute("donut", ds.getDonutById(id));
		return "donut-details";
	}
}
