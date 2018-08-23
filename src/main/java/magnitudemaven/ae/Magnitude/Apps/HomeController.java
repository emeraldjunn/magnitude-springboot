package magnitudemaven.ae.Magnitude.Apps;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Data;



@Controller
public class HomeController {
	@RequestMapping(value="")
	private String index(HttpServletRequest request, Model model){
		
		HttpSession session = request.getSession();
		
		if(session.isNew() ||  Integer.parseInt(session.getAttribute("seq").toString()) == 2)
		{
			 session.setAttribute("seq", 0);
		}
		else
		{
			Integer  tmp = Integer.parseInt(session.getAttribute("seq").toString());
			session.setAttribute("seq",  tmp+1);
		}
		int random = (int) session.getAttribute("seq");
		
		Data data = new Data();
		
		Map<String, String> settings = data.IndexSettings(data.getSetting(random));
		
		
		model.addAttribute("settings", settings);
		model.addAttribute("section", data.Section(settings));
		return "index";
	}
}
