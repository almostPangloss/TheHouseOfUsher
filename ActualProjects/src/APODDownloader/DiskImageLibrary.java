package APODDownloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *  - getImageIdentifiers
 *  - getImage
 *  - getImages
 *  - putImage
 */

public class DiskImageLibrary {
	
	private File selectedFile = null;
	
	public DiskImageLibrary(File newlySelectedFile) {
		
		selectedFile = newlySelectedFile;
				
	}
	
	public String[] getImageIdentifiers(){
		
		File[] fileArray = selectedFile.listFiles();
		String[] fileNameArray = new String[fileArray.length];
		
		for (int i = 0; i < fileArray.length; i++){
			fileNameArray[i] = fileArray[i].getName();
			System.out.println(fileNameArray[i]);
		}
		
		return fileNameArray;
		
	}
	
	public void downloadMissing(String[][] missingImageURLs) throws MalformedURLException, IOException {
		
		
		try {
			for (String[] s : missingImageURLs) {
				if (!(s[1] == null)) {
					System.out.println("s[1]: >" + s[1] + "<");
					try(InputStream in = new URL(s[1]).openStream()){
						Files.copy(in, Paths.get(selectedFile.getPath() + "\\" + s[0]));
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
