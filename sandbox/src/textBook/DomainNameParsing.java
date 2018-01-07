package textBook;

public class DomainNameParsing {
	public String[] domainNameArray;
	
	public DomainNameParsing(String domainName) {
		domainNameArray = domainName.split("\\.");
		System.out.println(domainNameArray.length);
	}
	
	public boolean wwwName() {
		if (domainNameArray[0].equals("www")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String extName() {
		if (domainNameArray.length == 3){
			return domainNameArray[2];
		} else {
			return "unknown";		
		}
	}
}
