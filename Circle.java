import java.util.Scanner; //THIS CALLS THE UTILITY LIBARY THE SCANNER IS IN
public class Circle {
	

    //WHEN CREATING A NEW CLASS, BEFORE YOU START CODING, REMOVE ALL THE SKELETON METHODS BEFORE YOU START.
    //DO NOT REMOVE THIS CODE.
    //ALWAYS REMEMBER!! THERE ARE THOUSANDS OF WAYS TO CODE JAVA, THE MAIN IDE'S INCLUDE, NETBEANS, ELCIPSE, 
    //INTELLIJ. YOU CAN EVEN CODE IT IN NOTEPAD++. NB! JAVA IS CASE-SENSETIVE
    //THE CODE ADD HERE MIGHT NOT WORK IN OTHER IDE'S, IT'S A CHALLENGE FOR YOU TO CODE IT ON YOUR OWN.

	public Circle() {
		//IGNORE THIS CONSTRUCTOR FOR NOW
	}

	public static void main(String[] args) { //THIS IS THE MAIN METHOD THAT MAKES YOUR PROJECT RUN
		        //CASE STUDY:
		        /**
		         * You need to solve the diameter, area, surface area and volume of a cirle. You need to use a form of input
		         * to get the radius from the user.
		         */
		        //STEP 1: CREATE VARIABLES
		        double diameter; //DOUBLE IS BASCICALLY DECIMAL VALUES
		        double area;
		        double surfaceArea;
		        double volume;
		        double radius;
		       
		        //STEP 2: DEFINE THE SCANNER
		        @SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in); //CREATES A SCANNER OBJECT
		        System.out.print("Enter the radius: ");
		        radius = scan.nextDouble(); //ASSIGNS THE SCANNER TO THE RADIUS VARIABLE
		        
		        //STEP 3: CODE THE CALCULATIONS NEEDED IN THE CASE STUDY 
		        diameter = radius * 2; 
		        //REMEMEBER FOR THIS CASE PI = 3.14
		        area = ((3.14)*radius)*2;
		        surfaceArea = (4*(3.14)*radius)*2;
		        volume = (4/3)*(3.14)*(radius * radius * radius);
		        
		        //STEP 4: DISPLAYING THE OUTPUT
		        //NB! PRINTLN - EVERYTHING WILL BE IN THE SAME LINE. SHORTCUT \n WILL PUT IT IN A NEW LINE   
		        System.out.print("Diameter: " + diameter);
		        System.out.print("\nArea: " + area);
		        System.out.println("\nSurface Area: " + surfaceArea + "\nVolume: " + volume);
		    }
		

	}


