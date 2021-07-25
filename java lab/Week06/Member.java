//Created by 6388145 Prapakorn Saelim
//If this code leak, please do not copy
//Please do it by yourself, I'm not warning you, I'm helping you
import java.util.ArrayList;

public class Member {

//Variable
private String email;
private String password;
private ArrayList<Video> vdoList = new ArrayList<Video>();
//protected String email;
//protected String password;
//protected String vdoList;

public String getEmail() {
return email;
}
public String getPassword() {
return password;
}
public ArrayList<Video> getVdoList() {
return vdoList;
}

Member(String email,String password) {
    this.email = email;
    this.password = password;
}

/*If the vdo is not null, this method adds the vdo into the variable vdoList and returns true. 
If the vdo is null, return false.*/
public boolean addVideo(Video vdo) {

    if(vdo != null) {
        vdoList.add(vdo);
        return true;
    }

    else {
        return false;
    }

}//end addVideo


/*If the vdo is found in the vdoList, removes it from the list,
then prints a successful message and returns true.
If the vdo is not found in the vdoList, returns false.*/
public boolean removeVideo(Video vdo) {

for(int i = 0; i < vdoList.size(); ++i) {
    if(vdo == vdoList.get(i)) {
        vdoList.remove(i);
        System.out.println(vdo);
        System.out.println("is successfully removed.");
        return true;
    }
}

return false;
}//end removeVideo


/*Print information including email, password, and list of videos*/
public void printMemberInfo() {
    System.out.println("Email: "+email+" "+"(pwd: "+password+")");
    System.out.println("List of Videos");
    
    for(int i = 0; i < vdoList.size(); ++i) {
        int j = i+1;
        System.out.println("["+j+"] "+vdoList.get(i));
}
}//end printMemberInfo


}//end
