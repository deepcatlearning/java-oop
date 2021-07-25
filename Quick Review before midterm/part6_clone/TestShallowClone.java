package part6_clone;


public class TestShallowClone {

	public static void main(String[] agrs){
		Animal[] pets1 = new Animal[3];
		pets1[0] = new Animal("rabbit");
		pets1[1] = new Animal("cat");
		pets1[2] = new Animal("dog");
		
		for(Animal a: pets1){
			System.out.println("pets1: " + a.toString());
		}
		
		Animal[] pets2 = new Animal[3];
		/********************************
		 * Shallow Clone
		 */
		pets2 = pets1;	
		
		for(Animal a: pets2){
			System.out.println("pets2: " + a.toString());
		}
		
		// change animal at index 0
		pets2[0].name = "bird";
		
		System.out.println("pets1[0]:" + pets1[0] + ", " + pets1[0].name);
		System.out.println("pets2[0]:" + pets2[0] + ", " + pets2[0].name);		
	}
}

