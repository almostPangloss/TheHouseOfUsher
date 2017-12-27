/*
 * This program is given a url and a local file location to store pictures from it. 
 * If there are new pictures, they're downloaded
 * 
 *  ------------              -------------
 * |WeberNetsPic|            |File Location|
 *  ------------              -------------
 *       |                          |
 *       |                          |
 *        ------>     |      <------
 *                    |
 *                    
 *             |Look at webpage and file to see 
 *              if any pictures are missing locally
 *              If so, download                |       
 *              
 *        
 */
package actualProjects;

import java.io.File;
import java.lang.reflect.Array;

public class pictureDownloader {

	public static void main(String[] args) {
		
		openAndBuildFileList();
		var = buildUnOwnedURLList(); // gets the first picture name and check if it's downloaded. 
									 // If not, add that picture name to an array, up to 20(?) members
		download(var, storage_location);
		
		

	}
	
	public Array openAndBuildFileList (){
		File file = new File ("********************ADD FILE NAME");
		
		
		return null;
		
	}

}
