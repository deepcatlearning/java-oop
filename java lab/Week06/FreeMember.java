//Created by 6388145 Prapakorn Saelim
//If this code leak, please do not copy
//Please do it by yourself, I'm not warning you, I'm helping you
class FreeMember extends Member{
//Variable
private int FREE_LIMITED_VDOs_ = 3;
private int numDownloadedVDO = getVdoList().size();

FreeMember(String email, String password) {
super(email, password);
}

public boolean addVideo(Video vdo) {
    if(getVdoList().size() == FREE_LIMITED_VDOs_) {
        System.out.println(vdo);
        System.out.println("cannot be downloaded because the number of the video is reaching the limit.");
        return false;
    }

    else {
        getVdoList().add(vdo);
        return true;
    }
}

public boolean removeVideo(Video vdo) {
        for(int i = 0; i < getVdoList().size(); ++i) {
            if(vdo == getVdoList().get(i)) {
            getVdoList().remove(i);
            numDownloadedVDO--;
            System.out.println(vdo);
            System.out.println("is successfully removed.");
            return true;
        }
}
        
return false;
}

/*Print information including email, password, and list of videos*/
public void printMemberInfo() {
    System.out.println("---- FREE MEMBER ----");
    System.out.println("Email: "+getEmail()+" "+"(pwd: "+getPassword()+")");
    System.out.println("List of Videos");

    for(int i = 0; i < 3; ++i) {
        int j = i+1;
        System.out.println("["+j+"] "+getVdoList().get(i));
}
    System.out.println("---------------------");
}//end printMemberInfo

public int getNumVideo() {
return numDownloadedVDO;
}
}//end