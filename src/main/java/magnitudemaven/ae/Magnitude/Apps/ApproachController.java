package magnitudemaven.ae.Magnitude.Apps;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Data;

@Controller
public class ApproachController {
	@RequestMapping(value="approach")
	private String index(Model model){
		
		Data data = new Data();
		
		Map<String, String> settings = data.ApproachSettings();
		
		
		model.addAttribute("settings", settings);
		
		model.addAttribute("section", data.getApproach(false));
		return "approach";
	}
}
