package pictureDownloader;


import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

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
	
	public String[][] getImageIDs() throws IOException, InterruptedException{
		
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
		String[][] aPODImageArray = new  String[last10ImageURLs.length][2];
		
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			last10ImageURLs[i] = (allImagePageElements.select("a").eachAttr("abs:href").get(i));
			
			TimeUnit.SECONDS.sleep(1);
			String picsHiRezLink = Jsoup.connect(last10ImageURLs[i]).get().select("a").eachAttr("abs:href").get(1);
			if (picsHiRezLink.contains((CharSequence) "apod")){
				// Filename
				aPODImageArray[cnt][0] = picsHiRezLink.substring( picsHiRezLink.lastIndexOf("/") + 1 );
				// Image URL
				aPODImageArray[cnt][1] = picsHiRezLink;
				System.out.println(cnt + ": " + aPODImageArray[cnt][0]);
				cnt++;
			}			
		
		}
		return Arrays.copyOf(aPODImageArray, cnt);
	}
	
	public void downloadImages(String[] toDownload) {
		
	}
	
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

}
