//Created by 6388145 Prapakorn Saelim
//If this code leak, please do not copy
//Please do it by yourself, I'm not warning you, I'm helping you
import java.util.ArrayList;

public class PremiumMember extends Member{
private double fee;
private static double Family_FEE = 80;
ArrayList<String> family = new ArrayList<String>();

PremiumMember(String email, String password, double fee) {
super(email, password);
this.fee = fee;
}

/*Print information including email, password, and list of videos*/
public void printMemberInfo() {
//First call, family member still not add yet
    if(family.size() == 0) {
        System.out.println("---- Premium MEMBER ----");
        System.out.println("Member fee: "+fee);
        System.out.println("Email: "+getEmail()+" "+"(pwd: "+getPassword()+")");
        System.out.println("List of Videos");
    
        for(int i = 0; i < getVdoList().size(); ++i) {
            int j = i+1;
            System.out.println("["+j+"] "+getVdoList().get(i));
        }
        System.out.println("---------------------");
}

//Second call family member added (BONUS)
    else {
        System.out.println("---- Premium MEMBER ----");
        System.out.println("Member fee: "+fee);
        System.out.println("Email: "+getEmail()+" "+"(pwd: "+getPassword()+")");
        System.out.println("List of Videos");
        
        for(int i = 0; i < getVdoList().size(); ++i) {
            int j = i+1;
            System.out.println("["+j+"]"+getVdoList().get(i));
        }
        System.out.println("---------------------");
        System.out.println("List of Family");

        if(family.size() == 2) {
            System.out.println(family.get(0)+", "+family.get(1));  
        }
        else {
            System.out.println(family.get(0)+", ");  
        }
}
}//end printMemberInfo(Premium)+Family info
    

//BONUS!!!!!!!!!!!!!!!!!!
/*If the username is not empty, adds it to the list, prints the successful message and returns true.
Otherwise, it returns false.*/
public boolean addFamily(String username) {
    if(family.size() < 2 || family.size() == 0) {
        family.add(username);
        System.out.println(username+" is added successfully.");
        return true;
    }

    else {
        System.out.println("user: "+username+" cannot be added, the Family user is reached the limit");
        return false;
    }
}//end addFamily


/*If the username is found, removes it from the list and returns true.
Otherwise, it prints a warning message and returns false.*/
public boolean removeFamily(String username) {
    for(String check : family) {
        if(check == username) {
            family.remove(username);
            System.out.println(username+" is removed successfully.");
            return true;
        }
}
    System.out.println("user: "+username+" does not exist and cannot be removed.");
    return false;
}//end removeFamily


/*The monthly bill includes the premium member fee and family fee.
The member has to pay 80.00 per month per family.*/
public double getMonthlyBill() {
return fee+Family_FEE;
}
//END BONUS


}//end
