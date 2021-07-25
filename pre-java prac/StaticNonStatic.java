public class StaticNonStatic {

    static void testStatic(){
        System.out.println("This is static method");//This can be called without object
    }
    public void testNonStatic(){
        System.out.println("This is non-static method");//This must use object to call
    }
    public static void main(String[] args) {
    //Call static
    testStatic();

    //Call Non-Static
    StaticNonStatic Nonstatic = new StaticNonStatic();//create object to call
    Nonstatic.testNonStatic();

    }
}