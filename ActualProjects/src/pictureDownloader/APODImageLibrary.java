package pictureDownloader;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
	
	private String URL; //Why can't I refactor this to "archiveURL"?
	
	public APODImageLibrary(){
		URL = "https://apod.nasa.gov/apod/archivepix.html";
	}
	
	public String[] getImageIDs() throws IOException, InterruptedException{
		
		Document doc = Jsoup.connect(URL).get();
		Elements allImagePageElements;
		
//		Path file = Paths.get("APODArchive.txt");
//		Just trying to make sure it all looks right, and I find it easier to look at a .txt file than the console. 
//		Files.newBufferedWriter(file).write(doc.select("a").eachAttr("abs:href").toString());;

		// Acts weird; I can see this flash on the screen, but then the console flips to starting at the body of the page
		// Possibly just overflowing the size of the console display?
//		System.out.println("The Document as a String: " + doc.toString());
		
		
		/************/
		
		allImagePageElements = doc.selectFirst("b").children();
		String[] last10ImageURLs = new String[10];
		String[] aPODImageArray = new  String[last10ImageURLs.length];
		
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			last10ImageURLs[i] = (allImagePageElements.select("a").eachAttr("abs:href").get(i));
			
			TimeUnit.SECONDS.sleep(1);
			String picsHiRezLink = Jsoup.connect(last10ImageURLs[i]).get().select("a").eachAttr("abs:href").get(1);
			if (picsHiRezLink.contains((CharSequence) "apod")){
				aPODImageArray[cnt] = picsHiRezLink.substring( picsHiRezLink.lastIndexOf("/") + 1 );
				System.out.println(cnt + ": " + aPODImageArray[cnt]);
				cnt++;
			}			
			
			// Oops, accidently trimmed off the HTMLs when I didn't even need to be doing anything here
			// Was trying to get the names of the images
			//last10ImageNames[i] = last10ImageNames[i].substring(last10ImageNames[i].lastIndexOf("/")+1);
			
			//System.out.println(last10ImageURLs[i]);
		}
		
		
		
		// For each image description page, this goes in and gets the link to the high res picture
		// Working, though it looks to be SUPER slow
		// Add: put just the names in an array, to compare against owned files.
//		int cnt = 0;
//		for (String i : last10ImageURLs) {
//			TimeUnit.SECONDS.sleep(1);
//			String picsHiRezLink = Jsoup.connect(i).get().select("a").eachAttr("abs:href").get(1);
//			if (picsHiRezLink.contains((CharSequence) "apod")){
//				aPODImageArray[cnt] = picsHiRezLink;
//			}
//			System.out.println(cnt + ": " + aPODImageArray[cnt]);
//			cnt++;
//		}
//		
		

//		Same as above, just looking
//		Files.newBufferedWriter(file).write(listAsList.toString());
		
		
		
		
		try{
			
			
		} catch (NullPointerException e) {
			
		}
		
		return aPODImageArray;
		
	}
	
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

}
