package magnitudemaven.ae.Magnitude.Apps;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Data;

@Controller
public class ClientController {
	@RequestMapping(value="clients")
	public String client(Model model)
	{
		Data data = new Data();
		Map<String, String> settings = data.ClientSettings();
		
		
		model.addAttribute("settings", settings);
		
		model.addAttribute("styles", data.getExpertiseStyle());
		model.addAttribute("section", data.getExpertiseSection());
		return "clients";
	}
}
