/*  Name:  Jacob Schleith
     COP 3330 – Summer 2011
Assignment title: Program 1: Creating A Java Application From A UML Diagram
Date:  Wednesday June 2, 2011
*/

import java.util.Scanner;  //Scanner is a java.util
import java.text.*; //import decimal format 

//Main class
public class HeatIndexCalculator {
 
	public static void main(String arg[]) {
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompts user for input temperature 
		System.out.println("Please input the temperature:");
		int temperature = input.nextInt();
		
		 
		//Prompts user for input humidity
		System.out.println("Please input the humidity:");	
		
		double humidity = input.nextDouble();
		
		
		double HeatIndex=calculateHeatIndex(temperature, humidity);
		
		printHeatIndex(temperature, humidity, HeatIndex);
		
	}//end main method public 
	
	//Declare method to calculate HeatIndex
	private static double calculateHeatIndex (int currentTemp, double currentHumidity){
		
		double c1 = -42.379;
		double c2 = 2.04901523;
		double c3 = 10.14333127;
		double c4 = -0.22475541;
		double c5 = -0.00683783;
		double c6 = -0.05481717;
		double c7 = 0.00122874;
		double c8 = 0.00085282;
		double c9 = -0.00000199;
		double HeatIndex;
		
		//Heat index equation
		HeatIndex=c1+
		(c2*currentTemp)+
		(c3*currentHumidity)+
		(c4*currentTemp*currentHumidity)+
		(c5*(currentTemp*currentTemp))+
		(c6*(currentHumidity*currentHumidity))+
		(c7*(currentTemp*currentTemp)*currentHumidity)+
		(c8*currentTemp*(currentHumidity*currentHumidity))+
		(c9*(currentTemp*currentTemp)*(currentHumidity*currentHumidity));
		
		return HeatIndex;
		
	}//end method calculateHeatIndex 
	
	//Declare method to print the HeadIndex
	private static void printHeatIndex(int currentTemp, double currentHumidity, double calculatedHeatIndex){
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("At a temperature of " + currentTemp + "F and a humidity of " + df.format(currentHumidity) + " precent . . .");
		
		System.out.println("It actually feels like " + df.format(calculatedHeatIndex) + "F");
		
	}//end method printHeatIndex
	
}//end class HeatIndexCalculator 

