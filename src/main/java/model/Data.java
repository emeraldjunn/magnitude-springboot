package model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
	private List<Settings> settings = new ArrayList<>( Arrays.asList(
			new Settings("#174154","gloves2.png","left"),
			new Settings("#7c2d4a","bilyard_ball.png","right"),
			new Settings("#58595b","engine.png","left")
			
			));
	private Map<String, String> options = new HashMap<>();
	private String[] works = {
			"Pink Caravan~Pink Caravan Ride 2018 Press Conference~add-ppc1.jpg~full/add-ppc1.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Press Conference~add-ppc2.jpg~full/add-ppc2.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Press Conference~add-ppc3.jpg~full/add-ppc3.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Press Conference~add-ppc4.jpg~full/add-ppc4.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc1.jpg~full/add-poc1.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc2.jpg~full/add-poc2.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc3.jpg~full/add-poc3.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc4.jpg~full/add-poc4.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc5.jpg~full/add-poc5.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc6.jpg~full/add-poc6.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc7.jpg~full/add-poc7.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc8.jpg~full/add-poc8.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc9.jpg~full/add-poc9.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Opening Ceremony~add-poc10.jpg~full/add-poc10.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~pink-abudhabi-6.jpg~full/pink-abudhabi-6.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~pink-abudhabi-8.jpg~full/pink-abudhabi-8.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~pink-abudhabi-9.jpg~full/pink-abudhabi-9.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~add-pcc1.jpg~full/add-pcc1.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~add-pcc3.jpg~full/add-pcc3.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~add-pcc4.jpg~full/add-pcc4.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~add-pcc5.jpg~full/add-pcc5.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~pink-abudhabi-3.jpg~full/pink-abudhabi-3.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~6.jpg~full/6.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 Closing Ceremony~120.jpg~full/120.jpg",
			"Pink Caravan~Pink Caravan Ride 2018 ~pink-abudhabi-5.jpg~full/pink-abudhabi-5.jpg",
			"Pink Caravan~Pink Caravan Ride 2018  Roadshow Event~1.jpg~full/1.jpg",
			"Pink Caravan~Pink Caravan Ride 2018  Roadshow Event~3.jpg~full/3.jpg",
			"Pink Caravan~Pink Caravan Ride 2018  Roadshow Event~pink-dubai-2.jpg~full/pink-dubai-2.jpg",
			"Pink Caravan~Pink Caravan Ride 2018  Roadshow Event~add-alqudra1.jpg~full/add-alqudra1.jpg",
			"Pink Caravan~Pink Caravan Ride 2018  Roadshow Event~add-alqudra2.jpg~full/add-alqudra2.jpg",
			"Pink Caravan~Pink Caravan Ride 2018  Roadshow Event~add-alqudra3.jpg~full/add-alqudra3.jpg",
			"Pink Caravan~Pink Caravan Ride 2018  Roadshow Event~add-alqudra4.jpg~full/add-alqudra4.jpg",
			"Gulf Business Machine~Workshop~gbm-1.jpg~full/gbm-1.jpg",
			"Gulf Business Machine~Workshop~gbm-2.jpg~full/gbm-2.jpg",
			"Gulf Business Machine~Workshop~gbm-4.jpg~full/gbm-4.jpg",
			"Gulf Business Machine~Workshop~gbm-5.jpg~full/gbm-5.jpg",
			"Gulf Business Machine~Workshop~gbm-6.jpg~full/gbm-6.jpg",
			"Gulf Business Machine~Workshop~gbm-7.jpg~full/gbm-7.jpg",
			"Gulf Business Machine~Exhibition Booth~gbm-8.jpg~full/gbm-8.jpg",
			"Gulf Business Machine~Exhibition Booth~gbm-3.jpg~full/gbm-3.jpg",
			"Gulf Business Machine~Exhibition Booth~gbm-9.jpg~full/gbm-9.jpg",
			"Gulf Business Machine~Workshop~add-gbm1.jpg~full/add-gbm1.jpg",
			"Gulf Business Machine~Workshop~add-gbm2.jpg~full/add-gbm2.jpg",
			"Gulf Business Machine~Workshop~add-gbm3.jpg~full/add-gbm3.jpg",
			"Canon Middle East ~World Art Dubai ~add-01.jpg~full/add-01.jpg",
			"Canon Middle East ~World Art Dubai ~canon-3.jpg~full/canon-3.jpg",
			"Canon Middle East ~World Art Dubai ~canon-6.jpg~full/canon-6.jpg",
			"Canon Middle East ~World Art Dubai ~add-wad2017-1.jpg~full/add-wad2017-1.jpg",
			"Canon Middle East ~World Art Dubai ~add-wad2017-2.jpg~full/add-wad2017-2.jpg",
			"Canon Middle East ~World Art Dubai ~add-wad2017-3.jpg~full/add-wad2017-3.jpg",
			"Canon Middle East ~World Art Dubai ~add-wad2017-4.jpg~full/add-wad2017-4.jpg",
			"Canon Middle East ~World Art Dubai ~add-wad2017-5.jpg~full/add-wad2017-5.jpg",
			"Canon Middle East ~World Art Dubai ~add-wad2017-6.jpg~full/add-wad2017-6.jpg",
			"Canon Middle East ~World Art Dubai ~add-wad2017-7.jpg~full/add-wad2017-7.jpg",
			"Canon Middle East ~World Art Dubai ~add-wad2017-8.jpg~full/add-wad2017-8.jpg",
			"Friends Of Cancer Patients (FOCP)~Kick Cancer Press Launch~p-3.jpg~full/p-3.jpg",
			"Friends Of Cancer Patients (FOCP)~Kick Cancer Press Launch~kick-cancer-1.jpg~full/kick-cancer-1.jpg",
			"Friends Of Cancer Patients (FOCP)~Kick Cancer Press Launch~kick-cancer-2.jpg~full/kick-cancer-2.jpg",
			"Friends Of Cancer Patients (FOCP)~Kick Cancer Press Launch~add-kc1.jpg~full/add-kc1.jpg",
			"Friends Of Cancer Patients (FOCP)~Kick Cancer Press Launch~add-kc2.jpg~full/add-kc2.jpg",
			"Friends Of Cancer Patients (FOCP)~Kick Cancer Press Launch~add-kc3.jpg~full/add-kc3.jpg",
			"Friends Of Cancer Patients (FOCP)~Kick Cancer Press Launch~add-kc5.jpg~full/add-kc5.jpg",
			"MenaLabs Management~Exhibition stand at Arab Health~menalabs-3.jpg~full/menalabs-3.jpg",
			"MenaLabs Management~Exhibition stand at Arab Health~menalabs-4.jpg~full/menalabs-4.jpg",
			"MenaLabs Management~Exhibition stand at Arab Health~menalabs-5.jpg~full/menalabs-5.jpg",
			"MenaLabs Management~Exhibition stand at MedLab~menalabs-6.jpg~full/menalabs-6.jpg",
			"MenaLabs Management~Exhibition stand at MedLab~menalabs-7.jpg~full/menalabs-7.jpg",
			"MenaLabs Management~Menalabs Website~menalabs-desktop.jpg~full/menalabs-desktop.jpg",
			"MenaLabs Management~Menalabs Website (Responsive)~menalabs-laptop.jpg~full/menalabs-laptop.jpg",
			"NAMA Women Advancement Establishment~Women Economic Empowerment Global Summit Reception Dinner~nama-2.jpg~full/nama-2.jpg",
			"NAMA Women Advancement Establishment~Women Economic Empowerment Global Summit Reception Dinner~add-nama1.jpg~full/add-nama1.jpg",
			"NAMA Women Advancement Establishment~Women Economic Empowerment Global Summit Reception Dinner~add-nama2.jpg~full/add-nama2.jpg",
			"NAMA Women Advancement Establishment~Women Economic Empowerment Global Summit Reception Dinner~nama-3.jpg~full/nama-3.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 Breakfast Meeting~ncd-5.jpg~full/ncd-5.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 Breakfast Meeting~ncd-6.jpg~full/ncd-6.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~4.jpg~full/4.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~5.jpg~full/5.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~ncd-4.jpg~full/ncd-4.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~ncd-7.jpg~full/ncd-7.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~add-ncd1.jpg~full/add-ncd1.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~add-ncd4.jpg~full/add-ncd4.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~add-ncd5.jpg~full/add-ncd5.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~add-ncd6.jpg~full/add-ncd6.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~add-ncd7.jpg~full/add-ncd7.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 ~add-ncd9.jpg~full/add-ncd9.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 Workshops~ncd-1.jpg~full/ncd-1.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 Workshops~ncd-2.jpg~full/ncd-2.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 Workshops~ncd-3.jpg~full/ncd-3.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 Workshops~add-ncd2.jpg~full/add-ncd2.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 Workshops~add-ncd3.jpg~full/add-ncd3.jpg",
			"NCD Alliance~Global NCD Alliance Forum 2017 Reception Dinner~add-ncd8.jpg~full/add-ncd8.jpg",
			"~~oracle-2.jpg~full/oracle-2.jpg",
			"Oracle ~Workshop ~oracle-1.jpg~full/oracle-1.jpg",
			"Oracle ~Workshop~add-08.jpg~full/add-08.jpg",
			"Oracle ~Workshop~add-09.jpg~full/add-09.jpg",
			"Oracle ~Workshop~add-19.jpg~full/add-19.jpg",
			"Oracle ~Workshop~add-20.jpg~full/add-20.jpg",
			"Oracle ~Workshop~add-21.jpg~full/add-21.jpg",
			"Oracle ~Workshop~add-05.jpg~full/add-05.jpg",
			"MenaLabs Management~Microsite~menalabs-microsite.jpg~full/menalabs-microsite.jpg",
			"MenaLabs Management~Microsite~menalabs-microsite2.jpg~full/menalabs-microsite2.jpg",
			"CBRE~Promotional Stand at Dalma Mall Abu Dhabi~cbre-1.jpg~full/cbre-1.jpg",
			"CBRE~Promotional Stand at Dalma Mall Abu Dhabi~cbre-2.jpg~full/cbre-2.jpg",
			"CBRE~Promotional Stand at Dalma Mall Abu Dhabi~cbre-3.jpg~full/cbre-3.jpg",
			"CBRE~Promotional Stand at Dalma Mall Abu Dhabi~cbre-4.jpg~full/cbre-4.jpg",
			"CBRE~Promotional Stand at Dalma Mall Abu Dhabi~cbre-5.jpg~full/cbre-5.jpg",
			"~~p-5.jpg~full/p-5.jpg",
			"Canon Middle East ~Walk For A Cause Abu Dhabi~canon-10.jpg~full/canon-10.jpg",
			"Canon Middle East ~Walk For A Cause Abu Dhabi~canon-11.jpg~full/canon-11.jpg",
			"Canon Middle East ~Walk For A Cause Abu Dhabi~canon-13.jpg~full/canon-13.jpg",
			"Canon Middle East ~Walk For A Cause Abu Dhabi~canon-14.jpg~full/canon-14.jpg",
			"Canon Middle East ~Walk For A Cause Abu Dhabi~canon-12.jpg~full/canon-12.jpg",
			"~~p-1.jpg~full/p-1.jpg",
			"ICD Brookfield ~ICD-Brookfield Place Dubai Ground breaking~icd-1.jpg~full/icd-1.jpg",
			"ICD Brookfield ~ICD-Brookfield Place Dubai Ground breaking~icd-2.jpg~full/icd-2.jpg",
			"ICD Brookfield ~ICD-Brookfield Place Dubai Ground breaking~icd-3.jpg~full/icd-3.jpg",
			"Genetika~Genetika Website~genetika-desktop.jpg~full/genetika-desktop.jpg",
			"Genetika~Genetika Website (Responsive)~genetika-laptop.jpg~full/genetika-laptop.jpg",
			"Canon Middle East ~Recycling Initiative with Dubai Municipality~add-canon-recycle1.jpg~full/add-canon-recycle1.jpg",
			"Canon Middle East ~Recycling Initiative with Dubai Municipality~add-canon-recycle2.jpg~full/add-canon-recycle2.jpg",
			"Canon Middle East ~Recycling Initiative with Dubai Municipality~add-canon-recycle3.jpg~full/add-canon-recycle3.jpg",
			"~~p-14.jpg~full/p-14.jpg",
			"LinkedIn~Christmas Party~christmas1.jpg~full/christmas1.jpg",
			"LinkedIn~Christmas Party~christmas2.jpg~full/christmas2.jpg",
			"LinkedIn~Christmas Party~christmas3.jpg~full/christmas3.jpg",
			"LinkedIn~Christmas Party~christmas4.jpg~full/christmas4.jpg",
			"Dubai Dance Out~Launch Event~add-10.jpg~full/add-10.jpg",
			"Dubai Dance Out~Launch Event~add-11.jpg~full/add-11.jpg",
			"Dubai Dance Out~Launch Event~add-12.jpg~full/add-12.jpg",
			"Dubai Dance Out~Launch Event~add-13.jpg~full/add-13.jpg",
			"Dubai Dance Out~Launch Event~add-15.jpg~full/add-15.jpg",
			"Canon Middle East ~Earth Hour Dubai ~add-03.jpg~full/add-03.jpg",
			"Canon Middle East ~Earth Hour Dubai ~add-canon-earthhour1.jpg~full/add-canon-earthhour1.jpg",
			"Canon Middle East ~Earth Hour Dubai ~add-07.jpg~full/add-07.jpg",
			"Canon Middle East ~Earth Hour Dubai ~add-canon-earthhour2.jpg~full/add-canon-earthhour2.jpg",
			"MenaLabs Management~Menalabs Annual Kick Off ~add-menalabs-alhamra1.jpg~full/add-menalabs-alhamra1.jpg",
			"MenaLabs Management~Menalabs Annual Kick Off ~add-menalabs-alhamra2.jpg~full/add-menalabs-alhamra2.jpg",
			"MenaLabs Management~Menalabs Annual Kick Off ~add-menalabs-alhamra3.jpg~full/add-menalabs-alhamra3.jpg",
			"MenaLabs Management~Menalabs Kick Off ~menalabs-ko-4.jpg~full/menalabs-ko-4.jpg",
			"MenaLabs Management~Menalabs Annual Kick Off ~menalabs-ko-1.jpg~full/menalabs-ko-1.jpg",
			"MenaLabs Management~Menalabs Annual Kick Off ~menalabs-ko-2.jpg~full/menalabs-ko-2.jpg",
			"Canon Middle East ~Showroom Inauguration Abu Dhabi~add-cso1.jpg~full/add-cso1.jpg",
			"Canon Middle East ~Showroom Inauguration Abu Dhabi~add-cso2.jpg~full/add-cso2.jpg",
			"Canon Middle East ~Showroom Inauguration Abu Dhabi~add-cso4.jpg~full/add-cso4.jpg",
			"Canon Middle East ~Showroom Inauguration Abu Dhabi~add-cso5.jpg~full/add-cso5.jpg",
			"Canon Middle East ~Showroom Inauguration Abu Dhabi~add-cso3.jpg~full/add-cso3.jpg",
			"Canon Middle East ~Special Olympics Middle East and North Africa (MENA) Regional Games~add-canon-so1.jpg~full/add-canon-so1.jpg",
			"Canon Middle East ~Special Olympics Middle East and North Africa (MENA) Regional Games~add-canon-so2.jpg~full/add-canon-so2.jpg",
			"Canon Middle East ~Standard Chartered Marathon 2018~add-cscm1.jpg~full/add-cscm1.jpg",
			"Canon Middle East ~Standard Chartered Marathon 2018~add-cscm2.jpg~full/add-cscm2.jpg",
			"Canon Middle East ~Standard Chartered Marathon 2018~add-cscm3.jpg~full/add-cscm3.jpg",
			"Canon Middle East ~Standard Chartered Marathon 2018~add-cscm4.jpg~full/add-cscm4.jpg",
			"Canon Middle East ~Standard Chartered Marathon 2018~add-cscm5.jpg~full/add-cscm5.jpg",
			"Canon Middle East ~Standard Chartered Marathon 2018~2.jpg~full/2.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Press Conference~139.jpg~full/139.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Press Conference~153.jpg~full/153.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Press Conference~154.jpg~full/154.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Press Conference~169.jpg~full/169.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Press Conference~170.jpg~full/170.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Press Conference~179.jpg~full/179.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Press Conference~184.jpg~full/184.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Opening Ceremony~187.jpg~full/187.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Opening Ceremony~189.jpg~full/189.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Opening Ceremony~048.jpg~full/048.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Opening Ceremony~049.jpg~full/049.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Opening Ceremony~037.jpg~full/037.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Opening Ceremony~047.jpg~full/047.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Closing Ceremony~185.jpg~full/185.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Closing Ceremony~193.jpg~full/193.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Closing Ceremony~194.jpg~full/194.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 Closing Ceremony~186.jpg~full/186.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 in the Press~190.jpg~full/190.jpg",
			"Pink Caravan~Pink Caravan Ride 2017 in the Press~191.jpg~full/191.jpg",
			"Linkedln~Dubai Office Inauguration~add-04.jpg~full/add-04.jpg",
			"Linkedln~Dubai Office Inauguration~add-linkedln.jpg~full/add-linkedln.jpg",
			"Linkedln~Dubai Office Inauguration~add-16.jpg~full/add-16.jpg",
			"Linkedln~Dubai Office Inauguration~add-17.jpg~full/add-17.jpg",
			"Linkedln~Dubai Office Inauguration~add-18.jpg~full/add-18.jpg",
			"Canon Middle East ~Blood Donation Drive~canon-26.jpg~full/canon-26.jpg",
			"Canon Middle East ~Blood Donation Drive~add-canon-bd1.jpg~full/add-canon-bd1.jpg",
			"Canon Middle East ~Blood Donation Drive~add-02.jpg~full/add-02.jpg",
			"Canon Middle East ~Blood Donation Drive~canon-28.jpg~full/canon-28.jpg",
			"Canon Middle East ~American School of Dubai Activation~canon-30.jpg~full/canon-30.jpg",
			"~~p-4.jpg~full/p-4.jpg",
			"Canon Middle East ~American School of Dubai Activation~canon-29.jpg~full/canon-29.jpg",
			"Canon Middle East ~American School of Dubai Activation~canon-31.jpg~full/canon-31.jpg",
			"Diagnostika~E-Commerce Website~diagnostika-desktop.jpg~full/diagnostika-desktop.jpg",
			"Diagnostika~E-Commerce Website (Responsive)~diagnostika-laptop.jpg~full/diagnostika-laptop.jpg",

	};
	
	public String viewWork()
	{
		String workTmp = "";
		for(String work: this.works)
		{
			String[] getImage = work.split("~");
			String[] tmp = getImage[3].split("/");
			String getRaw = tmp[1];
			String title = getImage[0]==""?"":"data-title=\""+getImage[0]+"<br/>"+getImage[1]+"\"\r\n";
			workTmp += "<article class=\"portfolio-item\" style=\"padding: 0px 6px 6px 0px !important;\">\r\n";
			workTmp += "<div class=\"portfolio-image\">\r\n";
			workTmp += "<a href=\"portfolio-single.html\">\r\n";
			workTmp += "<img class=\"lazy\" width=\"600\" height=\"525\" src=\"images/work/clients/"+getImage[2]+"\" alt=\""+getImage[1]+"\">\r\n";
			workTmp += "</a>\r\n";
			workTmp += "<a data-lightbox=\"work\""+title+"\" href=\"images/work/clients/"+getImage[3]+"\">\r\n";
			workTmp += "<div class=\"portfolio-overlay\"  "+(getImage[0]==""?"style=\"background-color:rgba(0,0,0,0); !important\"":"")+">\r\n";
			workTmp += "<div class=\"portfolio-desc\" data-image=\""+"images/work/clients/full/raw/"+getRaw+"\">\r\n";
			workTmp += "<h3>"+getImage[0]+"</h3>\r\n";
			workTmp += "<p>"+getImage[1]+"</p>\r\n";
			workTmp += "</div>\r\n";
			workTmp += "</div></a>\r\n";
			workTmp += "</div>\r\n";
			workTmp += "</article>\r\n"; 
			
		}
		return workTmp;
	}
	private String[] clients = {
			"hh",
			"canon",
			"friends_cancer",
			"icd",
			"nama",
			"axa",
			"diagnostika",
			"valrhona",
			"cbre",
			"linkedin",
			"pink",
			"gbm",
			"skyn",
			"smile",
			"menalab",
			"csc",
			"british_council",
			"ncd",
			"genetika",
			"oracle",
			"skidubai",
			"bin",
			"dubai_dance_out",
			"fitnessfirst",
			"exceed",
			"blank"
	};
	private List<PageData> approach = new ArrayList<> (
		 Arrays.asList(
			 new PageData("Approach","#59595c",	1,"left","From concept to reality.",
					 "APPROACH", 12, true, "",
					 "full-screen","<a href=\"#\" data-scrollto=\".2Desktop\" data-offset=\"0\" class=\"dark one-page-arrow\"><br/><i class=\"icon-angle-down infinite animated fadeInDown\"></i></a>"),
			 new PageData("Commited","#ff672e",	2,"right","We don’t take that statement lightly; Our promise to you? Total peace of mind and work that offers you the results you’re looking for.\r\n" + 
			 		"We thrive on a challenge, excel in creative execution, deliver in a comprehensive manner and guarantee you are in safe hands.",
					 "WE ARE/COMMITTED/TO YOU", 6, false, "bonsai.png", "",""),
			 new PageData("Listen","#8560a8",	3,"left","We keep up-to-date with what’s going on with your brand and business as well \r\n" + 
			 		"as ours, so we can deliver inspired marketing solutions that will leave a lasting impression.",
					 "WE LISTEN/AND GET TO<br>KNOW YOU", 7, true, "chair.png", "",""),
			 new PageData("Love","#41a69e",	4,"right","Passion is at the heart of all we do. We’re dedicated to getting the best results, We love nothing more than seeing our ideas and the satisfaction of a job well done.",
					 "WE LOVE/WHAT WE DO", 7, true, "ice-cream.png","",""),
			 new PageData("Team","#d53156",	5,"left","We like to think ourselves as an extension of your team, we like to have fun, but we’re serious about results and never lose sight of your goals.",
					 "WE ARE/TEAM/PLAYERS", 6, false, "dragon_ball.png", "",""),
			 new PageData("Honest","#9263cd",	6,"right","One size doesn’t fit all. You can count on us to find what fits your brand and the most effective method to achieve your objectives.",
					 "WE ARE/HONEST", 6, false, "mirror.png", "",""),
			 new PageData("Impact","#96c93d",	7,"left","We’re hard-working and dedicated to getting the best results. From the first stages of concept to the final stages of delivery we go above and beyond every day to ensure it.",
					 "WE LIVE FOR/THE IMPACT", 7, false, "bee.png", "","") 
			 ));
	private List<PageData> expertise = new ArrayList<> (
			 Arrays.asList(
				 new PageData("Expertise","#174154",	1,"left","",
						 "EXPERTISE/& SKILLS", 12, true, "",
						 "full-screen","<a href=\"#\" data-scrollto=\".2Desktop\" data-offset=\"0\" class=\"dark one-page-arrow arrow-offset\"><i class=\"icon-angle-down infinite animated fadeInDown\"></i></a>"),
				 new PageData("Advertising","#8560a8",	2,"right","Reaching an audience is one thing, reaching the right audience is another.\r\n" + 
				 		"			Our integrated and result-driven approach allows us to engage with your customer at multiple points, delivering a consistent message based on your specific campaign objective.",
						 "Advertising/& Marketing", 6, true, "claw.png",
						 "full-screen",""),
				 new PageData("Creative","#41a59c",	3,"right","Whether it's brand creation, reinvention, repositioning or a targeted campaign, we offer strategic brand services that aim to support your needs, requirements and <span class=\"isDesktop\"></span>business direction.",
							 "Creative<br>Design/& Branding", 7, true, "mortar.png",
							 "full-screen",""),
				 new PageData("Digital","#D53156",	4,"left","Within such a dynamic media, our team is consistently trying and testing new market innovations and delivering bespoke packages for you to achieve your goals.",
							 "Online/& Digital", 7, true, "bug.png",
							 "full-screen",""),
				 new PageData("Events","#96c93d",	5,"right","Offering effective, custom packages to suit your needs. We provide a range of solutions from event management support and advice through to full concept design development, planning, management and execution.",
							 "Events/& Exhibitions", 6, true, "chocolate-cake.png",
							 "full-screen","")
			));
	public String getExpertise(Boolean isMobile )
	 {
		return this.pageSection(expertise, isMobile);
	 }
	
	public String getApproach(Boolean isMobile )
	 {
		return this.pageSection(approach, isMobile);
	 }
	public String pageSection(List<PageData> fragments, Boolean isMobile)
	{
		String pageValue="";
		for( PageData framnent: fragments)
		{
			if(!isMobile && (framnent.getSection()=="Team" || framnent.getSection()=="Advertising") )
			{
				if(framnent.getSection()=="Team")
				{
					pageValue+= "<section id=\"content\" class=\"content full-screen makeheightfull 5Desktop\"  style=\"background-color:"+framnent.getBgCcolor()+"\">\r\n" + 
							"				   <div class=\"content-wrap h-100\" >\r\n" + 
							"				      <div class=\"container clearfix justify-content-center align-self-center h-100\">\r\n" + 
							"									<div class=\"row clearfix h-100\"><div class=\"col-md-6  justify-content-center align-self-center \">\r\n" + 
							"							    <span class=\"display-1 ultralight linepoint9\">WE ARE</span><br/><span class=\"display-1 bold linepoint9\">TEAM</span><br/><span class=\"display-1 ultralight linepoint9\">PLAYERS</span><br/>\r\n" + 
							"								<p class=\"myLead line-1point3\">\r\n" + 
							"								    We like to think ourselves as an extension of your team, we like to have fun, but we’re serious about results and never lose sight of your goals.\r\n" + 
							"								</p>\r\n" + 
							"						          </div>\r\n" + 
							"				<div class=\"col-md-9 justify-content-center align-self-center \" style=\"margin-left:-300px\">\r\n" + 
							"											<img src=\"images/"+framnent.getImage()+"\"><br/>&nbsp;<br/>&nbsp;<br/>&nbsp;<br/>&nbsp;<br/>&nbsp;<br/>&nbsp;\r\n" + 
							"										</div>\r\n" + 
							"							</div>\r\n" + 
							"						</div>\r\n" + 
							"					</div>\r\n" + 
							"					</section>";
				}
				if(framnent.getSection()=="Advertising")
				{
					pageValue+= "<section id=\"content\" class=\"content full-screen makeheightfull 2Desktop\"  style=\"background-color:"+framnent.getBgCcolor()+"\">\r\n" + 
							"						   <div class=\"content-wrap h-100\" style=\"padding:0px\">\r\n" + 
							"						      <div class=\"container clearfix h-100\">\r\n" + 
							"											<div class=\"row clearfix h-100\"><div class=\"col-md-5  h-100\">\r\n" + 
							"													<img src=\"images/"+framnent.getImage()+"\">\r\n" + 
							"												</div>\r\n" + 
							"						<div class=\"col-md-7  justify-content-center align-self-center \">\r\n" + 
							"									    <span class=\"display-1 bold linepoint9\">Advertising</span><br/><span class=\"display-1 ultralight linepoint9\">& Marketing</span><br/>\r\n" + 
							"										\r\n" + 
							"										<p class=\"myLead line-1point3\">\r\n" + 
							"										    Reaching an audience is one thing, reaching the right audience is another.\r\n" + 
							"						Our integrated and result-driven approach allows us to engage with your customer at multiple points, delivering a consistent message based on your specific campaign objective.\r\n" + 
							"										</p>\r\n" + 
							"									\r\n" + 
							"								          </div>\r\n" + 
							"\r\n" + 
							"								</div>\r\n" + 
							"										</div>\r\n" + 
							"									</div>\r\n" + 
							"							</section>";
				}
			}
			else
			{
				if(framnent.getSection()=="Advertising")
				{
					pageValue+= "<section id=\"content\" class=\"content full-screen 1m\"  style=\"background-color:"+framnent.getBgCcolor()+"\">\r\n" + 
							"						<div class=\"content-wrap h-100\" >\r\n" + 
							"						    <div class=\"container clearfix justify-content-center align-self-center h-100\" style=\"padding:0px !important\">\r\n" + 
							"								<div class=\"row clearfix h-100\"><div class=\"col-md-6  justify-content-center align-self-center \" style=\"padding-left:45px; padding-right:45px\">\r\n" + 
							"									<span class=\"display-1 bold linepoint9\">Advertising</span><br/><span class=\"display-1 ultralight linepoint9\">& Marketing</span><br/>\r\n" + 
							"									<p class=\"myLead line-1point3\">\r\n" + 
							"										    Reaching an audience is one thing, reaching the right audience is another.\r\n" + 
							"						Our integrated and result-driven approach allows us to engage with your customer at multiple points, delivering a consistent message based on your specific campaign objective.\r\n" + 
							"									</p>\r\n" + 
							"									\r\n" + 
							"								</div>\r\n" + 
							"								<div class=\"col-md-6 justify-content-center align-self-center \" style=\"padding-left:100px\">\r\n" + 
							"									<img src=\"images/claw2.png\">\r\n" + 
							"								</div>\r\n" + 
							"							</div>\r\n" + 
							"						</div>\r\n" + 
							"						</div>\r\n" + 
							"					</section>";
				}
				else
				{
					Map<String, String> options = new HashMap<>();
					
					options.put("bgColor", framnent.getBgCcolor());
					options.put("class_id", String.valueOf(framnent.getClass_id()) + (isMobile?"Mobile":"Desktop"));
					options.put("text-align", (isMobile?"left" : framnent.getText_align()) );
					options.put("description", framnent.getDescription());
					options.put("text-big", framnent.getText_big());
					options.put("column1", String.valueOf(framnent.getColumn1()) );
					options.put("start_bold", String.valueOf( framnent.isStart_bold()) );
					options.put("header-class",  framnent.getHeader_class());
					options.put("image", framnent.getImage());
					
					
					pageValue += this.Section(options);
				}
				
			}
		}
		
		return pageValue; 
	}
	public String getExpertiseSection()
	{
		String section = "";
		section += "<section id=\"content\" style=\"background-color:#9263cd; \" class=\"clients pad-top80\">\r\n";
		section += "<div class=\"content-wrap \" style=\"padding:0px; \">\r\n";
		section += "<div class=\"container clearfix\">\r\n";
		section += "<ul class=\"clients-grid nobottommargin clearfix\">\r\n";
		section += this.clientSection(clients);
		section += "</ul>\r\n";
		section += "</div>\r\n";
		section += "</div>\r\n";
		section += "</section>\r\n";
		return section;
	}
	public String getExpertiseStyle()
	{
		return this.clientStyle(clients);
	}
	public String clientStyle(String[] clients)
	{
		int x=1;
		String style="";
		
		for (String client : clients) 
		{
			style += ".clients-grid li img.i" + String.valueOf(x) + " {\r\n"; 
			style += "background-image: url(images/clients/"+client+".png) !important;\r\n"; 
			style += "transition: .4s; background-size:cover;\r\n"; 
			style += "} \r\n";
			x++;
		}
		return style;
	}
	public String clientSection(String[] clients)
	{
		int x=1;
		String section = "";
		for (String client : clients) 
		{
			if(client == "blank")
			{
				section += "<li class=\"blank\" data-img=\""+ client +"\"><img class=\"client-img i "+ String.valueOf(x) + "\" src=\"images/clients/blank.png\"></li>\r\n";
			}
			else
			{
				section += "<li data-img=\"" + client + "\"><img class=\"client-img i"+ String.valueOf(x) + "\" src=\"images/clients/blank.png\"></li>\r\n";
			}
			x++;
		}
		return section;
	}
	
	public List<Settings> getSettings()
	{
		return settings;
	}
	public String Section(Map<String, String> options)
	{
		String section = "";
		
		section = "<section id=\"content\" class=\"content ";
		section += (options.containsKey("header-class")?options.get("header-class"):"full-screen makeheightfull")+" ";
		section += options.get("class_id")+ "\" ";
		section += "style=\"background-color:"+options.get("bgColor")+" \">\r\n";
		section += "<div class=\"content-wrap h-100 \" "+(options.containsKey("no-padtop-image")?"style=\"padding:0px\"":"")+">\r\n";
		section += "<div class=\"container clearfix justify-content-center align-self-center h-100\">";
		
		
		section += "<div class=\"row clearfix h-100\">\r\n";
		
		String[] tmp = options.get("text-big").split("/");
		String grab = "";
		int cnt = 0;
		String classCss = "";
		for (String txt: tmp) 
		{ 
			if( Boolean.parseBoolean( options.get("start_bold")) == true)
			{
				classCss = (cnt % 2 == 0?"bold":"ultralight");
			}
			else
			{
				classCss = (cnt % 2 == 0?"ultralight":"bold");
			}
			grab += "<span class=\" display-1 " + classCss + " linepoint \"  >" + txt + "</span>\r\n";
			grab += (cnt<tmp.length ?"<br/>":"");
			cnt++;
		}
		if(options.containsKey("text-custom"))
		{
			grab = options.get("text-custom");
		}
		String text_align  = (options.containsKey("text-align-custom")? options.get("text-align-custom"):(options.get("text-align")=="right"?"":""));
		String column = "<div class=\"col-md-"+ options.get("column1") + "  " + text_align;
		column += "justify-content-center align-self-center \">\r\n " + grab;
		column += " <p class=\"myLead myLeadAbout line-1point3\">";
		column += options.get("description")  + "</p> \r\n";
		column += "</div>\r\n";
		
		if(Integer.parseInt(options.get("column1"))<12)
		{
			
			String columnTmp = String.valueOf( 12 - Integer.parseInt(options.get("column1") ));
			String column2 = "<div class=\"col-md-" + columnTmp;
			column2 += " justify-content-center align-self-center ";
			column2 += (options.containsKey("no-padtop-image")?"h-100":"")+"\">\r\n";
			column2 +=	"<img src=\"images/"+ options.get("image")+"\" alt=\"magnitude image\">\r\n";
			column2 +=	"</div>\r\n";
			if(options.get("column1") == "left")		
			{
				section += column + column2 + "\r\n";
			}
			else				
			{					
				section += column2 + column + "\r\n";
			}	 
		}
		else
		{
			section += column+"\r\n";
		}				
		if(options.containsKey("add-on") )	
		{
			section += options.get("add-on")+"\r\n";
		}				
		section	+= "</div>\r\n</div>\r\n</div>\r\n</section>";
				
		
		return section;
	}
	public Map<String, String> FeedsSettings()
	{
		options.put("bgColor", "#ff672e");
		options.put("meta-description", "Instagram@magnitude.ae #CreateAnImpact");
		return options;
	}
	public Map<String, String> AboutSettings()
	{
		options.put("bgColor", "#41A69E");
		options.put("title", "ABOUT");
		options.put("description", "Magnitude is a full-service communications agency, staffed by a multidisciplinary team of talented and passionate individuals working together to meet and exceed clients’ expectations. We offer impact, peace of mind and results through a multitude of valuable services, from concept to reality and everything in between.");
		options.put("title2", "&nbsp;<br/>&nbsp;<br/>WORK WITH US");
		options.put("description2", "We love the little jobs as much as the big ones and hierarchy \r\n" + 
				"									doesn’t get in the way. Send us your resume and a note about yourself and we’ll get in touch if we think it’s fit:&nbsp;<a href=\"mailto:careers@magnitude.ae\" style=\"color:#ccc\">careers@magnitude.ae</a>");
		options.put("meta-description", "Magnitude is a full-service communications agency, staffed by a multidisciplinary team of talented and passionate individuals working together to meet and exceed clients’ expectations. We offer impact, peace of mind and results through a multitude of valuable services, from concept to reality and everything in between.");
		
		return options;
	}
	public Map<String, Map<String,String>> Team()
	{
		
		
		Map<String,String> hussein;
		Map<String, Map<String,String>> team = new HashMap<String, Map<String,String>>();
		
		hussein = new HashMap<String, String>();
		
		hussein.put("first-name","HUSSEIN");
		hussein.put("last-name","ELSAFTY");
		hussein.put("designation","Managing Director");
		hussein.put("jobdescription","Patient and calm, Hussein keeps the team centred. Hussein’s multidisciplinary set of tools and passion for design stems from his architectural engineering background. His expertise lies in project management. Detail orientated he’s the first one on-site and the last to leave, making sure each project is up to the Magnitude standard.");
		hussein.put("background-color","#d33155");
		team.put("Hussein", hussein);
		
		Map<String,String> samantha;
		samantha = new HashMap<String, String>();
		samantha.put("first-name","SAMANTHA");
		samantha.put("last-name","BARKER");
		samantha.put("designation","Head of Operations");
		samantha.put("jobdescription","The problem solver, Samantha has a solution for everything! Samantha has over 15 years of experience in the region working with high profile clients both locally and internationally. Although her expertise spans through the line her real passion lies in Events. Samantha lives for being on site at all hours of the day and night making the concept become a reality, coffee in one hand, paint brush in the other.");
		samantha.put("background-color","#543099");
		team.put("Samantha", samantha);
		
		Map<String,String> claire;
		claire = new HashMap<String, String>();
		claire.put("first-name","CLAIRE");
		claire.put("last-name","CARLILE");
		claire.put("designation","Account Director");
		claire.put("jobdescription","Isn’t afraid to get her hands dirty and knows how to get things done. Claire has more than a decade worth of experience in servicing prestigious accounts for agencies both in London and Dubai. She has a knack for catching all your ideas and helping the creative and production team translate them into the final masterpieces that you see. A lover of lists (as well as the first person to pick up a vacuum cleaner), Claire is skilled at running projects and really understanding our clients’ needs quickly.");
		claire.put("background-color","#993030");
		team.put("Claire", claire);
		
		Map<String,String> lishaa;
		lishaa = new HashMap<String, String>();
		lishaa.put("first-name","LISHAA");
		lishaa.put("last-name","GROVES");
		lishaa.put("designation","Account Manager");
		lishaa.put("jobdescription","Lishaa moved to the UAE from the UK in 2015, to push her professional boundaries and experience another part of the world. \r\n" + 
				"She has the ability to figure out what makes a particular brand stand out and use that unique selling point to gain exposure through thoughtful and eye-catching marketing campaigns.");
		lishaa.put("background-color","#8560a8");
		team.put("Lishaa", lishaa);
		
		Map<String,String> rangana;
		rangana = new HashMap<String, String>();
		rangana.put("first-name","RANGANA");
		rangana.put("last-name","FERNANDO");
		rangana.put("designation","Graphic Designer");
		rangana.put("jobdescription","Rangana has the patience of a saint! Which has served him well with client service and the forever stream of comments like \"this will just take you a minute\". Rangana has been in the industry for more than 17 years and has worked on multiple award-winning projects.");
		rangana.put("background-color","#59595c");
		team.put("Rangana", rangana);
		
		Map<String,String> junn;
		junn = new HashMap<String, String>();
		junn.put("first-name","JUNN");
		junn.put("last-name","MENDOZA");
		junn.put("designation","Full-Stack Developer");
		junn.put("jobdescription","Our Geek! Taking the term \"computer whizz\" to a whole new level, Junn has more than 23 years’ experience in development, which includes UI/front-end web development and database management. He is the person who takes all of our ideas and translates them into responsive, fast loading, and attention-grabbing websites.");
		junn.put("background-color","#26b6d8");
		team.put("Junn", junn);
		
		Map<String,String> chesley;
		chesley = new HashMap<String, String>();
		chesley.put("first-name","CHESLEY");
		chesley.put("last-name","MANCAO");
		chesley.put("designation","Account Executive");
		chesley.put("jobdescription","Always full of energy, Chesley is enthusiastic to work with clients and get stuck in to a brief. Her background in design allows her to visualise and produce bespoke concepts.");
		chesley.put("background-color","#96c93d");
		team.put("Chesley", chesley);
		
		return team;
	}
	public Map<String, String> IndexSettings(Settings settings)
	{
		options.put("bgColor", settings.getColor());
		options.put("class_id", "0");
		options.put("text-align", settings.getAlignment());
		options.put("text-align-custom", "text-center");
		options.put("description", "");
		options.put("meta-description", "Magnitude is a full-service communications agency, staffed by a multidisciplinary team of talented and passionate individuals working together to meet and exceed clients’ expectations. We offer impact, peace of mind and results through a multitude of valuable services, from concept to reality and everything in between.");
		options.put("text-big", "Create an <span class=\"display-3 bold magnitude_green\">Impact</span>");
		options.put("text-custom", "<span class=\"display-3 ultralight\">Create an <span class=\"display-3 bold magnitude_green\">Impact</span></span>");
		options.put("column1", "6");
		options.put("start_bold", "false");
		options.put("image", settings.getImage());
		options.put("add-on1", "<a href=\"#\" data-scrollto=\".1\" data-offset=\"0\" class=\"dark one-page-arrow\"><i class=\"icon-angle-down infinite animated fadeInDown\"></i></a>");
		
		return options;
	}
	public Map<String, String> ApproachSettings()
	{
		options.put("bgColor", "#59595c");
		options.put("meta-description", "Advertising & Marketing - Creative Design & Branding - Online & Digital - Events & Exhibitions");
		
		return options;
	}
	
	public Map<String, String> WorkSettings()
	{
		options.put("bgColor", "#d53156");
		options.put("title", "WORK");
		options.put("meta-description", "Our diverse portfolio is something we’re very proud of, as it helps us to keep on our toes and continue to find innovative ways of communicating messages to a variety of audiences.");
		options.put("description", "Our diverse portfolio is something we’re very proud of, as it helps us to keep on our toes and continue to find innovative ways of communicating messages to a variety of audiences.");
		
		return options;
	}
	public Map<String, String> ClientSettings()
	{
		options.put("bgColor", "#9263cd");
		options.put("title", "CLIENTS");
		options.put("meta-description", "We have had the pleasure of working with some incredible clients over the years, from both the private and public sector.");
		options.put("description", "We have had the pleasure of working with some incredible clients over the years, from both the private and public sector.");
		
		return options;
	}
	
	public Map<String, String> ExpertiseSettings()
	{
		options.put("bgColor", "#174154");
		options.put("meta-description", "Reaching an audience is one thing, reaching the right audience is another.\r\n" + 
				"			Our integrated and result-driven approach allows us to engage with your customer at multiple points, delivering a consistent message based on your specific campaign objective.");
		
		return options;
	}
	public Map<String, String> ContactSettings()
	{
		options.put("bgColor", "#543099");
		options.put("mobile", "Emarat Atrium, Office  401, <br/>Sheikh Zayed Road<br/>" + 
				"P.O. Box 334547, Dubai, <br/>United Arab Emirates<br/>" + 
				"Tel: <a href=\"tel:+971 4 338 7742\">+971 4 338 7742</a><br/>" + 
				"Fax: <a href=\"tel:+971 4 338 7746\">+971 4 338 7746</a><br/>" + 
				"Email: <a href=\"mailto:info@magnitude.ae\">info@magnitude.ae</a>");
		options.put("desktop", "Emarat Atrium, Office  401, Sheikh Zayed Road<br/>" + 
				"P.O. Box 334547, Dubai, United Arab Emirates<br/>" + 
				"Tel: <a href=\"tel:+971 4 338 7742\">+971 4 338 7742</a>" + 
				"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + 
				"Fax: <a href=\"tel:+971 4 338 7746\">+971 4 338 7746</a><br/>" + 
				"Email: <a href=\"mailto:info@magnitude.ae\">info@magnitude.ae</a>");
		
		options.put("meta-description", "Emarat Atrium, Office  401, Sheikh Zayed Road, P.O. Box 334547, Dubai, United Arab Emirates - Tel: +971 4 338 7742 - Fax: +971 4 338 7746 - Email: info@magnitude.ae");
		options.put("title", "CONTACT");
		options.put("description", "We are hard-working, friendly and would love to hear from you.");
		
		return options;
		
	}
	
	public Settings getSetting(int idx)
	{
		return settings.get(idx);
	
	}
	
	
	
}
