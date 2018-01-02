package pictureDownloader;


import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
		URL = "https://apod.nasa.gov/apod/archivepix.html";
	}
	
	public String[] getImageIDs() throws IOException{
		
		Document doc = Jsoup.connect(URL).get();
		Elements listOfPages;
		String image;
		
		Path file = Paths.get("APODArchive.txt");
//		Just trying to make sure it all looks right, and I find it easier to look at a .txt file than the console. 
//		Files.newBufferedWriter(file).write(doc.select("a").eachAttr("abs:href").toString());;

		// Acts weird; I can see this flash on the screen, but then the console flips to starting at the body of the page
		// Possibly just overflowing the size of the console display?
		System.out.println("The Document as a String: " + doc.toString());
		
		String[] aPODImageArray = null;
		
		listOfPages = doc.selectFirst("b").children();
		List<String> listAsList = listOfPages.select("a").eachAttr("abs:href");
		
		// For each image description page, this goes in and gets the link to the high res picture
		// Working, though it looks to be SUPER slow
		// Add: put just the names in an array, to compare against owned files.
		for (String i : listAsList) {
			String picsDescPage = Jsoup.connect(i).get().select("a").eachAttr("abs:href").get(1);
			System.out.println(picsDescPage);
		}

//		Same as above, just looking
//		Files.newBufferedWriter(file).write(listAsList.toString());
		
		
		
		
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
