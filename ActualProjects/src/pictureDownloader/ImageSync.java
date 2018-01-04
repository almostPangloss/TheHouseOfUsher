package pictureDownloader;

import java.util.Arrays;

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
		
		boolean isOwned = false;
		int cnt = 0;
		for (int i = 0; i < (APODImageLibrary.length - 1); i++) {
			for (String s : DiskImageLibrary) {
				if ( APODImageLibrary == null || APODImageLibrary[i] == null || APODImageLibrary[i][0] == null){
					System.out.println("Fuckels");
				}
				if (APODImageLibrary[i][0].equals(s)) {
					isOwned = true;
				}
			}
			if (!isOwned) {
				missingImages[cnt][0] = APODImageLibrary[i][0];
				missingImages[cnt][1] = APODImageLibrary[i][1];
				cnt++;
			}
			
			isOwned = false;
			 
		}
		
		return Arrays.copyOf(missingImages, cnt);
	}
}
