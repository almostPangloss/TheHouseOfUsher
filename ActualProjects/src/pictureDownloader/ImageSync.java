package pictureDownloader;

/*
 * ImageSync - This is all the GUI stuff & and sync code
 *  + DiskImageLibrary
 *  + APODImageLibrary
 *  - syncLibraries 
 *  	Maybe create an iterator here which removes matches?
 *  - Whatever GUI stuff you need
 */

public class ImageSync {
	
	private String[] DiskImageLibrary;
	private String[][] APODImageLibrary = new String[10][2];
	
	
	public ImageSync(String[] newDiskImageLibrary, String[][] newAPODImageLibrary) {
		DiskImageLibrary = newDiskImageLibrary;
		APODImageLibrary = newAPODImageLibrary;
	}
	
	public ImageSync() {
		DiskImageLibrary = null;
		APODImageLibrary = null;
	}
	
	public String[][] findMissingURLs() {
		String[][] missingImages = new String[10][2];
		
		int isOwned = 0;
		int cnt = 0;
		for (int i = 0; i < (APODImageLibrary.length - 1); i++) {
			for (String s : DiskImageLibrary) {
				if (APODImageLibrary[i][0].equals(s)) {
					isOwned = 1;
				}
			}
			if (isOwned == 0) {
				missingImages[cnt][0] = APODImageLibrary[i][0];
				missingImages[cnt][1] = APODImageLibrary[i][1];
				cnt++;
			}
			
			isOwned = 0;
			 
		}
		
		return missingImages;
	}
}
