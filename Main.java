import java.util.Random;
import java.util.Scanner;

public class Main{
  public static void main (String[]args) {
    
Scanner scan = new Scanner (System.in);
    
Random gen = new Random ();
    
int userDoor, openDoor, otherDoor;
    
    int prizeDoor = gen.nextInt (3) + 1;
    
int goatDoor1 = prizeDoor;
    
while (goatDoor1 == prizeDoor) {
	goatDoor1 = gen.nextInt (3) + 1;}
    
int goatDoor2 = goatDoor1;

while (goatDoor2 == goatDoor1 || goatDoor2 == prizeDoor) {
	goatDoor2 = gen.nextInt (3) + 1;}
    
    
System.out.print ("Select the door (1, 2, or 3): ");
userDoor = scan.nextInt ();
      if (userDoor > 3 || userDoor <= 0)
      {
	
System.out.print ("Please select door 1, 2, or 3");
userDoor = scan.nextInt ();
      }
    else
      { if (userDoor == goatDoor1){
openDoor = goatDoor2;
otherDoor = prizeDoor; }
	
	else if (userDoor == goatDoor2){
openDoor = goatDoor1;
otherDoor = prizeDoor;}

    else{
openDoor = goatDoor1;
otherDoor = goatDoor2;}
	
 
 
System.out.println ("\nDoor" + openDoor +" is a goat door");
System.out.println ("You selected door number " + userDoor);
System.out.print ("\nWould you like to switch your door (y/n)? ");
	char userReply = scan.next ().charAt (0);
	
while (userReply != 'y' && userReply != 'n'){
System.out.print ("Please enter either y/n");
userReply = scan.next ().charAt (0);}
	
if (userReply == 'y'){
userDoor = otherDoor;
System.out.println ("Your choice switched to door " +userDoor);}
System.out.println ("The prize is behind door number: " +prizeDoor);
 
	  if (userDoor == prizeDoor){
	    System.out.println ("Win");}
	
	else {
System.out.println ("lose");}
scan.close ();
      
        }
    }

}
