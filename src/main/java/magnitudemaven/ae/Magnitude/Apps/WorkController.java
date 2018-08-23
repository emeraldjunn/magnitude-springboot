package magnitudemaven.ae.Magnitude.Apps;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Data;




@Controller
public class WorkController {
	@RequestMapping(value="work")
	private String index(Model model)
	{
		Data data = new Data();
		Map<String, String> settings = data.WorkSettings();
		
		
		model.addAttribute("settings", settings);
		model.addAttribute("section", data.viewWork());
		return "work";
	}
}
