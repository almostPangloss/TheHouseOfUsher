package pictureDownloader;

import java.awt.Image;
import java.io.File;

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
	
	//private for now?
	private void putImage(){
		
		
		
	}

}
