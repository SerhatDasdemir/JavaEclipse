package day9_controlFlowStatements_Part3;

public class task_39_trafficLight {

	public static void main(String[] args) {
	
	     
        /*Write a program to display traffic light colors using following logic:
        if code (R/r)-->"Red"
        if code (O/o)-->"Orange"
        if code (G/g)-->"Green"*/
        
        String color="g";
       
        switch (color) {
            case "R" : case "r":
              System.out.println("Red");
                break;
            case "O": case "o":
                System.out.println("Orange");
                break;
            case "G": case "g":
               System.out.println("Green");
              
            default:
               System.out.println("Check color for lights.");    
        }
       

	}

}
