import java.util.Scanner;

public class ParkingTicket {

    public static void main(String[] args) {
 /*This code written by 6388145 Prapakorn Saelim DO NOT COPY!
You can copy if you want but i think you will regret it in the future, so go ahead :)*/

//Scan time section
Scanner time = new Scanner(System.in);

//Entering time
String enterTime = time.nextLine();

//Leaving Time
String leaveTime = time.nextLine();
time.close();//Always close scanner to prevent memory leak

printParkingDuration(enterTime, leaveTime);

}

    public static void printParkingDuration(String enterTime, String leaveTime){

int enter = Integer.parseInt(enterTime);
int leave = Integer.parseInt(leaveTime);
//Not overnight
if(enter<leave)
{
System.out.println("Entering time -> "+enterTime);
System.out.println("Leaving time  -> "+leaveTime);
        

int enterHour = enter/100;
int enterMin = enter%100;

int enterHour2Min = (enterHour*60)+enterMin;

int leaveHour = leave/100;
int leaveMin = leave%100;

int leaveHour2Min = (leaveHour*60)+leaveMin;

int minute = (enterHour2Min-leaveHour2Min);

if(minute < 0)
  {
	minute = minute*-1;
  }

int hour  = minute/60;
minute%=60;//to collect the left over minute

System.out.println("Parking Duration: "+hour+" Hours "+minute+" Minutes");

if(hour > 0)
  {
	for(int i = 0; i <= hour; ++i)
	   {
          fullHour();
          System.out.print(" " +i +" hr");
          System.out.println("\n");
       }
  }

if(minute > 0)
  {
    notFullHour(minute);
  }

printParkingFee(hour, minute);
}//End not over night


//Start overnight
// 1 day = 1440 minutes

if(enter>leave)
  {
     System.out.println("Entering time -> "+enterTime);
     System.out.println("Leaving time  -> "+leaveTime+" (overnight)");

     int enterHour = enter/100;
     int enterMin = enter%100;

     int enterHour2Min = 1440-((enterHour*60)+(enterMin));

     int leaveHour = leave/100;
     int leaveMin = leave%100;

     int leaveHour2Min = (leaveHour*60)+leaveMin;

     int minute = (enterHour2Min+leaveHour2Min);

if(minute < 0)
  {
     minute = minute*-1;
  }

int hour  = minute/60;
minute%=60;//to collect the left over minute

System.out.println("Parking Duration: "+hour+" Hours "+minute+" Minutes");

if(hour > 0)
  {
     for(int i = 0; i <= hour; ++i)
        {
           fullHour();
           System.out.print(" " +i +" hr");
           System.out.println("\n");
        }
  }

if(minute > 0)
  {
     notFullHour(minute);
  }

printParkingFee(hour, minute);
}
}//End Overnight

    public static void fullHour() {

for(int i = 0; i < 4; ++i)
   {
      System.out.print("|***************");
   }
      System.out.print("|");
}


    public static void notFullHour(int minute) {
        
System.out.print("|");
for(int i = 0; i <= minute; ++i)
   {
      System.out.print("*");
   }
      System.out.println("| -> and "+minute+" minutes, "+(60-minute)+" minutes left until full hour.");
}


    public static void printParkingFee(int hour, int minute) {
        
hour-= 2;
float pay = hour*99;

if(minute == 25)
  {
     minute += 5;
     System.out.println("Parking Fee: "+(pay+49.5));
  }
        
else if(minute > 30)
       {
          System.out.println("Parking Fee: "+(pay+99));
       }
        
else
{
   System.out.println("Parking Fee: "+pay);
}
}
}