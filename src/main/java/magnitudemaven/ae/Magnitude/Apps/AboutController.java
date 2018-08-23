package magnitudemaven.ae.Magnitude.Apps;


import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Data;

@Controller
public class AboutController {
	@RequestMapping(value="about")
	private String index(Model model){
		
		Data data = new Data();
		Map<String, String> settings = data.AboutSettings();
		
		Map<String,Map<String,String>> team = data.Team();
		Map<String, String> hussein = team.get("Hussein");
		Map<String, String> samantha = team.get("Samantha");
		Map<String, String> claire = team.get("Claire");
		Map<String, String> lishaa = team.get("Lishaa");
		Map<String, String> rangana = team.get("Rangana");
		Map<String, String> junn = team.get("Junn");
		Map<String, String> chesley = team.get("Chesley");
		
		
		
		
		model.addAttribute("hussein", hussein);
		model.addAttribute("samantha", samantha);
		model.addAttribute("claire", claire);
		model.addAttribute("lishaa", lishaa);
		model.addAttribute("rangana", rangana);
		model.addAttribute("junn", junn);
		model.addAttribute("chesley", chesley);
		
		model.addAttribute("settings",settings);
		model.addAttribute("teamColor","#3d3858");
		return "about";
	}
}