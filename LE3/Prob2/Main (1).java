/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
        
        // AbsTest cannot be instantiated because it's abstract
        // AbsTest absTest = new AbsTest(); // This will cause a compile error
    }
}
