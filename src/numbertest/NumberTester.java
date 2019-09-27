/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertest;

/**
 *
 * @author vmaglov17
 */
public class NumberTester {
   
    public final String fileName;
    
    public interface NumberTest {
        boolean testNumber(int number);
    }

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }


    
    public void setOddEvenTester(NumberTest oddTester) {
        
    }

    public void setPrimeTester(NumberTest primeTester) {
        
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
    
    }

    public void testFile() {
        
    }

    
    
    
}
