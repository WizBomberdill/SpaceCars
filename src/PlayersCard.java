import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class PlayersCard {
	double playersFame;
	public static double introductionToPlayersClub() {
	
		double playersFame = 100;//selected player.

	System.out.println("Welcome to the Players Club!");
	System.out.println("Congratulations!");
	System.out.println("You have been selected out of billions of candidates across four planets. Feel honored. ");
	System.out.println("Now you might be wondering what you have been selected for. Or why you were even selected. ");
	System.out.println("Let me first state this! You were selected! you can’t be unselected! ");
	System.out.println("Furthermore, I am monitoring ever actions you take. This is all for your own sake as ");
	System.out.println("to best place you in your future trials. You may ask questions but, a word of caution to the ");
	System.out.println("questions you ask. For example, don’t ask if you can be unselected, I have told you once and ");
	System.out.println("don’t like to repeat myself. Not being able to understand directions will place you in a ");
	System.out.println("less favorable position. And trust me you want to be in good favor.");
	System.out.println("");
	System.out.println("Do you have any questions or should I contiue with my Explanations? (note: type yes or no)");
	
	Scanner myObj = new Scanner(System.in);  
    String input = myObj.nextLine();
	
    switch (input) { 
    case "yes":
    case "Yes":
    case "YES":
    	for(int i = 0; playersFame<=100 && i < 2;) {
    		
    			System.out.println("Fine, I will give you 2 questions befor I move on...");
                System.out.println("What is it that you would like to ask?: (note select by Typing a number)");
                System.out.println("1. Why was I selected?");
            	System.out.println("2. What am I selected for?");         	
            	System.out.println("3. Can I be unselected?");           	
            	System.out.println("4. Can I go home?");
            	if (playersFame==100) {
            	System.out.println("5. Is it posible to Skip the Explanation?");
            	}
                int input1 = myObj.nextInt();

            if (input1 == 1) {
            	System.out.println("Sometimes it's best to wait for an explanations:");
            	playersFame = playersFame -1;
            	i++;
            }
            if (input1 == 2) {
            	System.out.println("Sometimes it's best to wait for an explanations:");
            	playersFame = playersFame -1;
            	i++;
            }
            if (input1 == 3) {
            	System.out.println("I want you to know I have just taken 10 points away from your fame and No you can't!");
            	System.out.println("Fame -10");
            	playersFame = playersFame -10;
            	i++;
            
            	if (playersFame <= 90) {
            		System.out.println("ARE THERE ANY OTHER QUESTIONS OR CAN WE MOVE ON?");
            		System.out.println("1. yes");
            		System.out.println("2. no");
            		int input2 = myObj.nextInt();

        	    	if (input2 == 1) {
        	    		System.out.println("-10 fame! This Had better be good? ");
                  		System.out.println("1. what is fame?");
                  		System.out.println("2. What am I selected for?");         	
                    	System.out.println("3. Can I be unselected?");           	
                    	System.out.println("4. Can I go home?");
                        System.out.println("5. Why was I selected?");

                  		int input3 = myObj.nextInt();
                  		
                  	if (input3 == 2||input3 == 3||input3 == 4 || input3 == 5 ) {
                  			
                  		System.out.println("I think thats anough questions for now lets move on...");
                  		playersFame =playersFame-1;
                  		i=4;
                  		}
                  	if (input3 ==1) {
            	    	System.out.println("Lets just say the more you have the better off you are. Best pay more atention. ");
            	    	playersFame=playersFame+50;
                  	}
        	    	}
            		}
            		}
            
            if (input1 == 4) {
            	System.out.println("Not at this moment little one. Best to lisen to the Explanation.");
            	playersFame = playersFame -1;
            	i++;
            }
            if (input1 == 5) {
            	System.out.println("Hah! It seems you have been here before. or maybe you up for a chalange? posibly both... Are you sure?");
            	System.out.println("1. yes");
        		System.out.println("2. no");
        		int input4 = myObj.nextInt();
        		
            	if (input4 == 1) {
            		playersFame= playersFame+51;//  fame will be at 151 use to skip the next for loop witch will run through
            
            	}
            	if (input4 == 2) {
            		playersFame = playersFame -1;
            		i++;
            	}
            if (playersFame <= 90) {
            		System.out.println("ARE THERE ANY OTHER QUESTIONS OR CAN WE MOVE ON?");
            		System.out.println("1. yes");
            		System.out.println("2. no");
            		int input2 = myObj.nextInt();

            	    	if (input2 == 1) {
            	    		System.out.println("-10 fame! This Had better be good? ");
                      		System.out.println("1. what is fame?");
                      		System.out.println("2. What am I selected for?");         	
                        	System.out.println("3. Can I be unselected?");           	
                        	System.out.println("4. Can I go home?");
                            System.out.println("5. Why was I selected?");

                      		int input3 = myObj.nextInt();
                      		
                      	if (input3 == 2||input3 == 3||input3 == 4 || input3 == 5 ) {
                      			
                      		System.out.println("I think thats anough questions for now lets move on...");
                      		playersFame =playersFame-1;
                      		i=4;
                      		}
                      	if (input3 ==1) {
                	    	System.out.println("Lets just say the more you have the better off you are. Best pay more atention. ");
                	    	playersFame=playersFame+50;

                      		}
            	    	}
            	}
            }
            	
            }
    	
                
    	break;
    case "no":
    case "No":
    case "NO":
    	playersFame= playersFame+1;
	break;
	
	}
    
     myObj.close(); //found out how to close scanner lol...
    
    
    
    
    if (playersFame<=150) {
    System.out.println("\r\n" + 
    		"As I was saying you will be partaking I a little game that I have created. \r\n" + 
    		"A game where you will be faced with many trials. \r\n" + 
    		"Each trial small or large will earn you fame and Exp ether positive or negative. \r\n" + 
    		"Fame can be used as a sort of currency and be traded between players or used to buy in-game items.\r\n" + 
    		"Wile exp will be used to lvl up! Each lvl will grant you 5 attribute points!\r\n" + 
    		"Witch you can then use to increase your primary stats. \r\n" + 
    		"");
    System.out.println("\r\n" + 
    		"Most planets now have a virtual player creation setup allowing them to create what they want to look \r\n" + 
    		"like before spawning. It seems that your planet likes to go with the out dated genetic random generator. \r\n" + 
    		"Thus I will give you this one opportunity to change any stats you would like. Now, Hold out your hand.\r\n" + 
    		"");
    
    }
    System.out.println("");
	return playersFame;
}
public static String name;	
public static String race;	
public static String age;
public static double strength;
public static double intellect;
public static double stamina;
public static double dex;
public static double luck = (Math.random() * ((100 - 0) + 1)) + 0;//this might be constantly changing. 


//String name, String race, int age, double strength, double intellect, double stamina, double dex

public static void introductionStatsReturningPlayer()throws Exception {
	BufferedReader myObj = new BufferedReader(new FileReader("PlayerCard.txt"));
	 String line = null;
	 while ((line = myObj.readLine()) != null) {
	      String[] values = line.split(",");
	    
	      for (String i : values) {
	        System.out.println(i);//trying to test this out.
	        
	        
	        
	      }
	 }
	 myObj.close(); 
  }	  
		  
//		  
//	name = name;
//	race = race;
//	age = age;
//	strength = strength;
//	intellect = intellect;
//	stamina = stamina;
//	dex = dex;
//
//	

public void introductionStatsNewPlayer() {
	 String name;
}

public static String setPlayerName() {
	System.out.println("Plz Enter your NAME: ");
	
	Scanner myObj = new Scanner(System.in);  
	String input = myObj.nextLine();
		
		 String name = input;
		 myObj.close(); 
		 return name;
	 }

public static String setPlayersRace() {
	System.out.println("1. Human \r\n" + 
					   "2. Elf \r\n" + 
					   "3. Giant \r\n" + 
						"");
	Scanner myObj = new Scanner(System.in); 
	int input1 = myObj.nextInt();
	if (input1 == 1) {
		System.out.println("Human eh, I see you... It's not a bad, with the proper traning.");
		race = "Human";
	}
	if (input1 == 2 ) {
		System.out.println("Human eh, I see you... It's not a bad, with the proper traning.");
		race = "Elf";
	}
	if (input1 == 3) {
		System.out.println("Human eh, I see you... It's not a bad, with the proper traning.");
		race ="Giant";
	
	}
	 myObj.close(); 
	return race;
}

public double getPlayersFame() {
	return playersFame; //trying to find a way to call fame in main.
}
	
	
	public static void main(String[] coolGameBro)throws Exception {
		introductionStatsReturningPlayer();
	//introductionToPlayersClub();
	//if (playersFame<150) {
		//setPlayerName();
		//setPlayersRace();
		
		
		
	}
	}



//figure out how to make hand. move hand.


