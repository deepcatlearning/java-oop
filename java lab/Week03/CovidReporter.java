public class CovidReporter {

public static void main(String[] args) {
CovidProfile country1 = new CovidProfile();//Create India object
CovidProfile country2 = new CovidProfile("2021-2-1", "Brazil", 9204731, 8176373, 224504);//Create Brazil object
CovidProfile country3 = new CovidProfile("2021-2-1", "Tanzania", 509,183,21);//Create Brazil object

CovidProfile acessProfile = new CovidProfile();

country1.setDate("2021-2-1");
country1.setLocation("India");
country1.setAccCases(10757610);//10,757,610
country1.setCuredCases(10434983);//10,434,983
country1.setDeathCases(154392);//154,392
country1.printCovidInfo();//Print India covid info
System.out.println("Death cases more than 10,000: "+country1.isSevere(154392));//Bonus2
country1.isDanger();//Bonus3
System.out.println("");

country2.printCovidInfo();
System.out.println("Death cases more than 10,000: "+country2.isSevere(224504));//Bonus2
country2.isDanger();//Bonus3
System.out.println("");

country3.printCovidInfo();
System.out.println("Death cases more than 10,000: "+country3.isSevere(224504));//Bonus2
country3.isDanger();//Bonus3

acessProfile.allProfile();//check created profile
}
}