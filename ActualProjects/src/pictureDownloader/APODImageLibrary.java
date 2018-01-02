package pictureDownloader;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *  - getImageIdentifiers
 *  - getImage
 *  - getImages (if you want)
 */

public class APODImageLibrary {
	
	private String URL;
	
	public APODImageLibrary(){
		URL = "https://apod.nasa.gov/apod/astropix.html";
	}
	
	public String[] getImageIDs() throws IOException{
		
		Document doc = Jsoup.connect(URL).get();
		Elements listOfPages;
		String image;
		
		System.out.println("-> " + doc.attributes().iterator());
		
		String[] aPODImageArray = null;
		
		listOfPages = doc.selectFirst("b").children();
		List<String> listAsList = listOfPages.select("a").eachAttr("abs:href");
//		for ( int i = 0; i < 5; i++ ){
//			buildListOfImages (listAsList.get(i).toString());
//		}
		
		try{
			
			
		} catch (NullPointerException e) {
			
		}
		
		return null;
		
	}
	
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

}
