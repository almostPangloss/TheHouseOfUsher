package textBook;

public class Main {

	public static void main(String[] args) {
		RationalNumber rn1 = new RationalNumber(12,15);
		RationalNumber rn2 = new RationalNumber(3,5);
		
		RationalNumber rnAns = rn1.multiplyRationalNumbers(rn2);
		System.out.println(rnAns.getNumerator() + "/" + rnAns.getDenominator());
		
		
//		WeatherForecast wf = new WeatherForecast(82.3, "RAINY");
//		System.out.println(wf.getTemp());
//		wf.showTempToC();
//		wf.setCondition("SUNNY");
//		System.out.println(wf.getWeather());
//		wf.setTemp(-75);
//		wf.setWeather(30, "SNOWY");
//		wf.setTemp(-75);
//		System.out.println(wf.getWeather());
	}

}
