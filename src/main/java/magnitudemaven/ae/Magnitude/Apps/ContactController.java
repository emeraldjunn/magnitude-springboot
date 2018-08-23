package magnitudemaven.ae.Magnitude.Apps;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import model.Data;

@Controller
public class ContactController {
	@RequestMapping(value="contact")
	private String index(Model model){
		
		Data data = new Data();
		
		Map<String, String> settings = data.ContactSettings();
		
		
		model.addAttribute("settings", settings);
		return "contact";
	}
}