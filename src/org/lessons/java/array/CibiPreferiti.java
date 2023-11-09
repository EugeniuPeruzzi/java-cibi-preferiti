package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		//Initializing array
		// String[] topFood = {"carbonara","kebab","pad thai","big mac","bbq ribs","chips","pop corn",}
		String[] topFood = new String[8];
		
		// adding values to array (string[n-1]):
		topFood[0]= "Pad Thai";
		topFood[1]= "Carbonara";
		topFood[2]= "Bbq Ribs";
		topFood[3]= "Chicken and Cashewnuts";
		topFood[4]= "Papaya Salad";
		topFood[5]= "Kebab";
		topFood[6]= "Pop Corn";
		topFood[7]= "Big Mac";
		
		 // stamp lenght of array
        System.out.println("Lunghezza della classifica: " + topFood.length);
        
        // stamp first position
        System.out.println("Top position: " + topFood[0]);
        
        //stamp last position
        System.out.println("Lasta position: " + (topFood.length-1));
        

	}

}
