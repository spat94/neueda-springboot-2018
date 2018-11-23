package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import uk.ac.belfastmet.buildings.domain.Floor;
import uk.ac.belfastmet.buildings.domain.Foot;
import uk.ac.belfastmet.buildings.domain.Vol;

public class BuildList {
	
	public BuildList()
	{
		super();
	}
	
	//Array list method for buildings organised by volume
	public ArrayList<Vol> getVols()
	{
		ArrayList<Vol> vols = new ArrayList<Vol>();
		Vol byVol1 = new Vol("Boeing Everett Factory", "USA", "Everett, Washington", "398,000", "13.3 million", "Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.", "bef.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d13623553.595744!2d-119.17955540700302!3d46.30976207957499!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900169ae7fa435%3A0x82f74b4126a482f4!2sBoeing!5e1!3m2!1sen!2suk!4v1542976702197\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Vol byVol2 = new Vol("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000", "8 million", "The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.", "mosque.png", "<iframe src=\"https://www.google.com/maps/embed?pb=\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Vol byVol3 = new Vol("Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "122,500", "5.6 million", "The assembly hall of the Airbus A380, the world's largest airliner.", "airbus.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3626.125726982642!2d1.3713130218441942!3d43.61163906282716!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12aebaa26ac3b92d%3A0x40766c715295cb69!2sAirbus+France!5e1!3m2!1sen!2suk!4v1542978064191\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Vol byVol4 = new Vol("Aerium", "Germany", "Halbe, Brandenburg", "70,000", "5.2 million", "A hangar originally intended to house the construction of a giant airship, this building now houses an indoor theme park, called Tropical Islands Resort.", "aerium.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3080.583629402772!2d13.74642295171294!3d52.03892397962648!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47a804edb23f5915%3A0x20148692752fbd91!2sTropical+Islands!5e1!3m2!1sen!2suk!4v1542978335083\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Vol byVol5 = new Vol("Boeing Composite Wing Center", "USA", "Everett, Washington", "111,500", "3.7 million", "Boeing's assembly site for the production of composite wings for the 777-8 and 777-9.", "bcw.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d13353.042933761948!2d-122.27746502076211!3d47.91667498078102!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x82f74b4126a482f4!2sBoeing!5e1!3m2!1sen!2suk!4v1542978278751\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		
		vols.add(byVol1);
		vols.add(byVol2);
		vols.add(byVol3);
		vols.add(byVol4);
		vols.add(byVol5);
		
		return vols;
	}
	
	//Array list method for buildings organised by footprint
	public ArrayList<Foot> getFoots()
	{
		ArrayList<Foot> footprint = new ArrayList<Foot>();
		Foot byFoot1 = new Foot("Aalsmeer Flower Auction Building", "Netherlands", "Aalsmeer", "518,000", "740m x 700m", "The auction building of the flower auction in Aalsmeer.", "aalsmeer.png", "<iframe src=\"https://www.google.com/maps/embed?pb=\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Foot byFoot2 = new Foot("The Dubai Mall", "United Arab Emirates", "Dubai", "500,000", "N/A", "N/A", "dubaimall.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d9063.034458661925!2d55.279497899999996!3d25.197438000000002!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f682829c85c07%3A0xa5eda9fb3c93b69d!2sThe+Dubai+Mall!5e1!3m2!1sen!2suk!4v1542980788680\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Foot byFoot3 = new Foot("Tesla Factory", "United States", "Fremont, California", "427,354", "N/A", "Automobile production facility of Tesla Motors.", "tesla.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3975.914229652062!2d-121.9453135321117!3d37.49198547871413!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fc7027b4e88bf%3A0x6ad902d97df92303!2sTesla+Fremont+Factory!5e1!3m2!1sen!2suk!4v1542981022110\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Foot byFoot4 = new Foot("Boeing Everett Factory", "United States", "Everett, Washington", "398,000", "900m x 495m", "Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.", "bef.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d13623553.595744!2d-119.17955540700302!3d46.30976207957499!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900169ae7fa435%3A0x82f74b4126a482f4!2sBoeing!5e1!3m2!1sen!2suk!4v1542976702197\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Foot byFoot5 = new Foot("Daikin Texas Technology Park", "United States", "Waller Texas", "393,000", "N/A", "Factory and distribution center for heating and air conditioning products.", "daikin.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4332.178327120898!2d-95.86487916438983!3d30.049001148348342!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8646d2de861ed379%3A0xb685128a4a3f270b!2sDaikin+Texas+Technology+Park!5e1!3m2!1sen!2suk!4v1542981159077\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");

		footprint.add(byFoot1);
		footprint.add(byFoot2);
		footprint.add(byFoot3);
		footprint.add(byFoot4);
		footprint.add(byFoot5);
		
		return footprint;
	}
	
	//Array list method for buildings organised by usable floor space
	public ArrayList<Floor> getFloors()
	{
		ArrayList<Floor> floorspace = new ArrayList<Floor>();
		Floor byFloor1 = new Floor("New Century Global Center", "China", "Chengdu", "1,760,000", "global.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4316.473440407287!2d104.06816945350425!3d30.572094286034602!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x36efc66e38e922db%3A0x523ef7736d271b8c!2sNew+Century+Global+Center%2C+Wuhou+Qu%2C+Chengdu+Shi%2C+Sichuan+Sheng%2C+China!5e1!3m2!1sen!2suk!4v1542981674881\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Floor byFloor2 = new Floor("Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai", "1,760,000", "airport.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4527.071955077744!2d55.35804678960076!3d25.24520619409752!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f5da0ce60ccf9%3A0x5c05e74f801639a1!2sAirport+Terminal+3!5e1!3m2!1sen!2suk!4v1542981696322\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Floor byFloor3 = new Floor("Abraj Al-Bait Endowment ", "Saudi Arabia", "Mecca", "1,760,000", "abraj.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4662.177281446621!2d39.82354760103775!3d21.418793985718686!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204c82533f16f%3A0xca0cff6480eeca59!2sAbraj+Al+Bait+Mall+(Kingdom+Clock+Tower)!5e1!3m2!1sen!2suk!4v1542981738540\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Floor byFloor4 = new Floor("CentralWorld", "Thailand", "Bangkok", "1,024,000", "central", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4864.603320852229!2d100.53716745095149!3d13.746596590303499!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x30e29ecfc2f455e1%3A0xc4ad0280d8906604!2sCentralWorld!5e1!3m2!1sen!2suk!4v1542981759253\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		Floor byFloor5 = new Floor("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "1,024,000", "aalsmeer.png", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3065.4459989789234!2d4.782008328187071!3d52.259858045037745!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c5de25f43ac82d%3A0x7e6ba34cf4c92c79!2sVba+bloemenveiling!5e1!3m2!1sen!2suk!4v1542980489974\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
	
		floorspace.add(byFloor1);
		floorspace.add(byFloor2);
		floorspace.add(byFloor3);
		floorspace.add(byFloor4);
		floorspace.add(byFloor5);
		
		return floorspace;
	}	
}


