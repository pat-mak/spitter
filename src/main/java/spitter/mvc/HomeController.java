package spitter.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spitter.service.SpitterService;

@Controller
public class HomeController {
	private SpitterService spitterService = new SpitterService();

	public HomeController() {
	}

	public HomeController(SpitterService spitterService) {
		this.spitterService = spitterService;
	}

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Map<String, Object> model) {
		model.put("spittles", spitterService.getRecentSpittles());
		return "home";
	}
}
