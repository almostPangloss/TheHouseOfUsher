package textBook;

public class WeatherForecast {

	private double temp = 0.0;
	private enum conditions{SUNNY, SNOWY, RAINY, CLOUDY}; // Again I feel the need for a .contains
	private String condition;
	
	public WeatherForecast(double temp, String condition) {
		setWeather(temp, condition);
	}
	
	public WeatherForecast() {
		this.temp = 70.0;
		this.condition = "SUNNY";
	}
	
	
	
	public void setWeather (double temp, String condition) {
		if ((temp < 32 && condition != "SNOWY")) {
			System.out.println("It can't be below freezing without being snowy.");
			defaultWeather();
		} else if ((temp >= 100) && (condition != "SUNNY")){
			System.out.println("It can't be 100 or above without being sunny.");
			defaultWeather();
		} else if ((temp < -50.0) || (temp > 150)){
			System.out.println("The temperature can't be below -50 or above 150.");
			defaultWeather();
		} else {
			this.temp = temp;
			this.condition = condition;
		}
	}
	
	public void showTempToC() {
		System.out.println("The temperature, " + this.temp + ", in Celsius is "
				+ ( (double)(this.temp - 32) * (double)(5.0/9.0) ) + " degrees.");
	}
	
	public void setTemp(double temp) {
		setWeather(temp, this.condition);
	}
	
	public void setCondition(String condition) {
		setWeather(this.temp, condition);
	}
	
	private void defaultWeather() {
		this.temp = 70.0;
		this.condition = "SUNNY";
		System.out.println("Temperature and condition set to 70 and SUNNY, respectively.");
	}
	
	public double getTemp() {
		return this.temp;
	}
	
	public String getCondition() {
		return this.condition;
	}
	
	public String getWeather() {
		return ("Temperature: " + this.temp + "\nCondition: " + this.condition);
	}
}
