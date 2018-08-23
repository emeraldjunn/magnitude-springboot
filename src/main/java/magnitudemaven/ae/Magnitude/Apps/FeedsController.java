package magnitudemaven.ae.Magnitude.Apps;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Data;

@Controller
public class FeedsController {
	@RequestMapping(value="feeds")
	public String feeds(Model model) {
		Data data = new Data();
		Map<String, String> settings = data.FeedsSettings();
		model.addAttribute("settings", settings);
		return "feeds";
	}
}
