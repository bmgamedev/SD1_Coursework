package ac.uk.napier.set07102cw2016;

public class WeatherReading {

//Variables
	private int year;
	private int month;
	private int date;
	private int hour;
	private int windSpeed;
	private double temperature;
	
	
//Constructor
	/**
	 * @param year
	 * @param month
	 * @param date
	 * @param hour
	 * @param windSpeed
	 * @param temperature
	 */
	public WeatherReading(int year, int month, int date, int hour, int windSpeed, double temperature) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hour;
		this.windSpeed = windSpeed;
		this.temperature = temperature;
	}


//Getters
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}


	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}


	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}


	/**
	 * @return the windSpeed
	 */
	public int getWindSpeed() {
		return windSpeed;
	}


	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}


	
//toString
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WeatherReading [year=" + year + ", month=" + month + ", date=" + date + ", hour=" + hour
				+ ", windSpeed=" + windSpeed + ", temperature=" + temperature + "]";
	}
	
	
}
