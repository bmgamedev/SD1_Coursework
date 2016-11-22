package ac.uk.napier.set07102cw2016;

import org.openstreetmap.gui.jmapviewer.Coordinate;

public class WeatherStation extends Coordinate {
	
	//Each weather station instance should maintain a list of weather readings
	//obtained at that station
	
	//need to override constructor:
	//Coordinate (double lat, double lon)
	
//Variables	
	private int siteID;
	private String siteName;
	private double lat;
	private double lon;
	
//constructor: 
	//need to override super constructor:
		//Coordinate (double lat, double lon)
	/**
	 * @param lat
	 * @param lon
	 * @param siteID
	 * @param siteName
	 * @param lat2
	 * @param lon2
	 */
	public Postcode(int siteID, String siteName, double lat, double lon) {
		//super(lat, lon);
		this.siteID = siteID;
		this.siteName = siteName;
		@Override
		this.lat = lat;
		@Override
		this.lon = lon;
	}

	
	
	
	
//getters
	/**
	 * @return the siteID
	 */
	public int getSiteID() {
		return siteID;
	}

	/**
	 * @return the siteName
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * @return the latitude
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * @return the longitude
	 */
	public double getLon() {
		return lon;
	}

	
	
//toString():
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WeatherStation [siteID=" + siteID + ", siteName=" + siteName + ", lat=" + lat + ", lon=" + lon + "]";
	}

}
