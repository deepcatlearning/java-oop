
public class TreeCalculator {

		
	public static int findMax(Node root)
	{	//****YOUR CODE HERE**
		if (root == null) {
			return -1;
		}
		 else {
        int rootID = root.id;
        int lroot = findMax(root.left);
        int Rroot = findMax(root.right);
  
        if (lroot > rootID) {
			rootID = lroot;
		}
            
        if (Rroot > rootID) {
			rootID = Rroot;
		}
            
        return rootID;
	}
		//*********************
	}
	
	
	public static int findMin(Node root)
	{	//****YOUR CODE HERE**
		if (root == null) {
			return -1;
		}

        int rootID = root.id;
        int lroot = findMin(root.left);
        int Rroot = findMin(root.right);
  
		if(lroot != -1) {

			if (lroot <= rootID) {
			rootID = lroot;
		}

		}
        
        if(Rroot != -1) {

			if (Rroot <= rootID) {
			rootID = Rroot;
		}  

		}  
        
        return rootID; 
	}
	
	//************* BONUS ****************//
	public static double sumTree(Node root)
	{	
		//****YOUR CODE HERE**
		return -1;
		//*********************
	}
	
	public static double avgTree(Node root)
	{
		//****YOUR CODE HERE**
		return -1;
		//*********************
	}
	
}
