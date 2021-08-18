package _01_intro_to_static;

public class Athlete {
	
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;
	    int i = 0;
	    Athlete (String name, int speed, int bibNumber){
	        this.name = "Zion";
	        this.speed = 9;
	        this.bibNumber = i+1;
	    System.out.println("Hi "+name+"your speed is "+speed+", and your bib number is "+bibNumber+". The location of the race is "+raceLocation+" at "+raceStartTime+".");
	    }
	    void Athlete2 (String name, int speed, int bibNumber){
	        this.name = "Billy";
	        this.speed = 8;
	        this.bibNumber = i+1;
	        System.out.println("Hi "+name+"your speed is "+speed+", and your bib number is "+bibNumber+". The location of the race is "+raceLocation+" at "+raceStartTime+".");
	    }

	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	//Athlete(String name, int speed){
	    	//this.name = "Billy";
	    	//this.speed =
	    	}
		    }
	//}

