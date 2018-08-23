package magnitudemaven.ae.Magnitude.Apps;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Data;

@Controller
public class ExpertiseController {
	@RequestMapping(value="expertise")
	private String expertise(Model model)
	{
		Data data = new Data();
		
		Map<String, String> settings = data.ExpertiseSettings();
		
		
		model.addAttribute("settings", settings);
		
		model.addAttribute("sectionDesktop", data.getExpertise(false));
		model.addAttribute("sectionMobile", data.getExpertise(true));
		return "/expertise";
	}
}
