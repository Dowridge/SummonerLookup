import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

/*
 * This example demonstrates using the RiotApi to request summoner information for a given summoner name
 */

public class League {

	public String sname;
	public long id;
	public long saccid;
	public int Sumlvl;
	public int ProIcon;
	public String regionn;
	
	public static void main(String[] args) throws RiotApiException {
		ApiConfig config = new ApiConfig().setKey("RGAPI-1e344920-5cb4-421f-948b-d9dbd6e8e338");
		RiotApi api = new RiotApi(config);

		Summoner summoner = api.getSummonerByName(Platform.NA, "iStefan");
		System.out.println("Name: " + summoner.getName());
		System.out.println("Summoner ID: " + summoner.getId());
		System.out.println("Account ID: " + summoner.getAccountId());
		System.out.println("Summoner Level: " + summoner.getSummonerLevel());
		System.out.println("Profile Icon ID: " + summoner.getProfileIconId());
		
	}	
	  
	public void setnamenamea(String user, String region){
		regionn = region;
		try {
			ApiConfig config = new ApiConfig().setKey("RGAPI-96714fce-b9a5-4d57-a10e-ba94e94b7366");
			RiotApi api = new RiotApi(config);
			
			switch(region) {
			
		    case "NA":
		    	Summoner summoner;
		    	summoner = api.getSummonerByName(Platform.NA, user);
		    	yeet(summoner);
		        break;
		    case "EU":
		        summoner = api.getSummonerByName(Platform.EUNE, user);
		        yeet(summoner);
		        break;
		    default:
		        System.out.println("hi");
		        break;
		}

			

			
			
		} catch (RiotApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}	
		
	public void setID(String User){
		

		sname = User;
	}
	
public Summoner yeet(Summoner st) {
	
	sname = st.getName();
	id = st.getId();
	saccid = st.getAccountId();
	Sumlvl = st.getSummonerLevel();
	ProIcon = st.getProfileIconId();	
return st;	
}	
		  
public String toString(){ //overriding the toString() method 
	
String image = "<img src=" + "http://opgg-static.akamaized.net/images/profile_icons/profileIcon" + ProIcon +".jpg" + " width=\"100\" height=\"100\" ></img>";
	 String ret = "\nUsername: "+ sname + "\nID: " + id + "\nAccount ID: " + saccid + "\nSummoner Level: " + Sumlvl + "\nRegion: " + regionn + image ;
	  return ret;  
	 }  
	 
	}
	
	
	
