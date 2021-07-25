public class CovidProfile {

private String date;
private String location;
private int accumulatedCases;
private int curedCases;
private int deathCases;
//Bonus1 (Use static int to count the profile that created)
static int profileCount = 0;

//Bonus3
public void isDanger()
{
if(this.accumulatedCases > 100000)
{
System.out.println("This country is in danger, please do not travel.");
}
    
else
{
System.out.println("This country is not in danger, but please be aware if travel.");
}
}


public CovidProfile()
{
date = "none";
location = "none";
accumulatedCases = 0;
curedCases = 0;
deathCases = 0;
}

public CovidProfile(String _date,String loc,int noACC,int noCured,int noDeath)
{
date = _date;
location = loc;
accumulatedCases = noACC;
curedCases = noCured;
deathCases = noDeath;  
profileCount += 1;
}

public String getDate(){
return this.date;
}
public void setDate(String _date)
{
this.date = _date;
}

public String getLocation(){
return this.location;
}
public void setLocation(String loc)
{
this.location = loc;
profileCount += 1;
}

public int getAccCases(){
return this.accumulatedCases;
}
public void setAccCases(int value)
{
this.accumulatedCases = value;
}

public int getCuredCases(){
return this.curedCases;
}
public void setCuredCases(int value)
{
this.curedCases = value;
}

public int getDeathCases(){
return this.deathCases;
}
public void setDeathCases(int value)
{
this.deathCases = value;
}

public void printCovidInfo()
{
System.out.println(location+" at "+date);
System.out.println("Accumulative Patient: "+accumulatedCases);
System.out.println("Cured Patient: "+curedCases);
System.out.println("Death Case: "+deathCases);
}


public void allProfile()//Bonus
{
System.out.print("\n");
System.out.println("CovidProfile created: "+profileCount);
}

public boolean isSevere(int deathCases)
{
boolean trueOrfalse;

if(deathCases > 10000){
trueOrfalse = true;
}

else{
trueOrfalse = false;
}

return trueOrfalse;
}
}//end