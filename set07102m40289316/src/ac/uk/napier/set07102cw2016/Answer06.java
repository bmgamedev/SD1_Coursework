package ac.uk.napier.set07102cw2016;

import java.util.ArrayList;
import weather.WeatherData;

//UNUSED:
//import java.util.HashMap;  //DELETE ONCE FINISHED - UNLESS USED OF COURSE
//import org.openstreetmap.gui.jmapviewer.Coordinate;  //DELETE ONCE FINISHED - UNLESS USED OF COURSE
//import mapgui.MapGui;

//ERRORS AND NOT NEEDED:
//import set07102.Airport; //DELETE ONCE FINISHED
//import set07102.Data; //DELETE ONCE FINISHED



/**
 * QUESTION 06
 * 
 * If you decide to answer question 06 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer06 {
	public static void main(String[] args) {
		System.out.println("Question 06");
		
		/*
		 * Question 6) Which weather station has the fewest weather readings? 
		 * Output the Id, name and coordinates of the weather station to the system console. 
		 * Plot the location using the MapGui class supplied. 
		 * Include a screenshot in your Word document.
		 */
		
		/*
		 * Solution:
		 * PART 1
		 * Initialise a list of the weather readings
		 * create arraylist weatherReadings
		 * Go through each line and split the data
		 * For each line, add to weatherReadings
		 * 
		 * PART 2
		 * for each element in weatherReadings:
		 * Using the station ID of the reading, check if a weatherstation instance exists
		 * if not, create one
		 * if yes, add this reading to the instance
		 * 
		 * PART 3
		 * Go through each weatherstation instance
		 * set "fewestreadingssiteid" (A.K.A "x") variable to 0
		 * check size of first weatherstation instance and set x as the ID
		 * first each weatherstation instance, compare size to x
		 * if x is lower, don't change
		 * if weatherstation[i] is lower, update x
		 * once finished, x should contain smallest arraylist
		 * print details of that station
		 * 
		 * EXTRA: PART 4
		 * Try to structure code like:
		 * Main(){ 
		 * 	call popWeatherReadings();
		 * 	call popWeatherStations();
		 * 	call smallestArray();
		 * }
		 * 
		 * public static void popWeatherReadings(){
		 * 	PART 1
		 * }
		 * 
		 * public static void popWeatherStations(){
		 * 	PART 2
		 * }
		 * 
		 * public static void smallestArray(){
		 * 	PART 3
		 * }
		 */
		
		//create an empty ArrayList to hold a list of weather readings:
		ArrayList<WeatherReading> weatherReadings = new ArrayList<>();
		
		//get the provided data as a string array
		String[] weatherData = WeatherData.getData(); //weatherData was airportData (DELETE THIS COMMENT ONCE FINISHED)
		
		// go through each line of data starting at index 1 (line 0 is the header)		
		for (int i = 1; i < weatherData.length; i++) {

			String line = weatherData[i];

			// Split the line of data into individual fields using the commas:
			//NOTE: the data is structure like: SiteId,SiteName,Latitude,Longitude,Year,Month,Date,Hour,WindSpeed,Temperature
			String[] elements = line.split(",");
			
			// Latitude and Longitude are of type String but need converted to the primitive type double:
				//String latString = elements[2];
				//String lonString = elements[3];
			//All the variables in WeatherReading need converted from String to the relevant data type:
			String yearString = elements [4];
			String monthString = elements [5];
			String dateString = elements [6];
			String hourString = elements [7];
			String windSpeedString = elements [8];
			String temperatureString = elements [9]; //(double)
			
			// Change the strings to a double
						//double lat = Double.parseDouble(latString);
						//double lon = Double.parseDouble(lonString);
			//Conversion:
			int year = Integer.parseInt(yearString);
			int month = Integer.parseInt(monthString);
			int date = Integer.parseInt(dateString);
			int hour = Integer.parseInt(hourString);
			int windSpeed = Integer.parseInt(windSpeedString);
			double temperature = Double.parseDouble(temperatureString);

			//create new WeatherReading instance:
			//Airport airport = new Airport (id, name, lat, lon);
			WeatherReading weatherReading = new WeatherReading (year, month, date, hour, windSpeed, temperature);
			
			
			//add the weather reading from WeatherData.getData() to our arrayList				
			weatherReadings.add(weatherReading);	

		}
		//Print list of weatherReadings
		//System.out.println(weatherReadings);
		
		// Print the size of the ArrayList
		//System.out.println("number of weather readings overall: " + weatherReadings.size()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		/* THE CODE BELOW IS TO BE USED FOR GET SIZE OF SMALLEST ARRAYLIST
//		 
//		int airEast = 0;
//		
//		for (int i = 1; i < airports.size(); i++) {
//			
//			System.out.println("airEast currently is index no: " + airEast);
//			
//			System.out.println("airport 1: Index no " + airEast + " longitude: " + airports.get(airEast).getLon());
//			System.out.println("airport 2: Index no " + (i) + " longitude: " + airports.get(i).getLon());
//			
//			if (airports.get(airEast).getLon() > airports.get(i).getLon()) {
//				//airEast = airEast; //i.e. do nothing
//			} else {
//				airEast = i;
//			}
//			
//			System.out.println("airEast is now index no: " + airEast);
//		}
//		
//		System.out.println("The most easterly airport is: " + airports.get(airEast));
//		
//		//Isolate the coordinates to map on the GUI map:
//		//specify a latitude and longitude  
//		double lat = airports.get(airEast).getLat(); 
//		double lon = airports.get(airEast).getLon();  
//		
//		// Create a new Coordinate using lat and lon 
//		Coordinate coordinate = new Coordinate(lat, lon);  
//		 
//		// Display the coordinates on a map 
//		MapGui.showMap(coordinate);
//		
//		CODE ENDS HERE */
		
		
	
//		/* THE CODE BELOW IS TO BE USED FOR CREATING A HASHMAP AND IS INCOMPLETE
//		
//		// Declare a new HashMap that maps the airport id to the Airport  
//		HashMap<String, Airport> airportMap = new HashMap<>();    
//
//		for(Airport airport : airports){
//		  String key = airport.getID();     
//		  // Put the airport into the map using its id as the key
//		  airportMap.put(key, airport); 
//		}    
//
//		// We can then get an Airport object easily using its id as the key, e.g:
//		//Airport airport = airportMap.get("9200MSE1"); 
//		
//		//System.out.println(airport);
//		System.out.println(airportMap.size());
//		
//		//Create flight for each line of data (using aggregation)
//		//to reference only 84 airport instances:		
//		
//		//get all flight data as a string array
//		String[] flightData = Data.getFlights();
//		
//		for (int i = 1; i < flightData.length; i++){
//			
//			String line = flightData[i];
//			
//			String[] elements = line.split(",");
//			
//			String id = elements[0];
//			
//			String departureCode = elements[1];
//			Airport departureAirport = airportMap.get(departureCode);
//			//potential for error - not sure if this is supposed to be 
//			//the HashMap or ArrayList reference in the .get() command
//			//it's currently the HashMap because using the ArrayList gives error
//			//because it will only do .get(int) not .get(String)
//			//and we've just declared the departureCode as a String in the line above
//			
//			String arrivalCode = elements[5];
//			Airport arrivalAirport = airportMap.get(arrivalCode); 
//			//potential for error - not sure if this is supposed to be 
//			//the HashMap or ArrayList reference in the .get() command
//			//it's currently the HashMap because using the ArrayList gives error
//			//because it will only do .get(int) not .get(String)
//			//and we've just declared the arrivalCode as a String in the line above
//			
//			String airline = elements[9];
//					
//			//convert numbers to the right data types:
//			int price = Integer.parseInt(elements[10]);
//			int hour = Integer.parseInt(elements[11]);
//			int day = Integer.parseInt(elements[12]);
//			int duration = Integer.parseInt(elements[13]);
//			
//			CODE ENDS HERE */
		
	}	
}
