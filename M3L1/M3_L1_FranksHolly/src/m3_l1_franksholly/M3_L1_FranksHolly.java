/**
* Here is the Sentence Capitalizer assignment from module 3. I find this one
*           to be difficult every time it is assigned in programming classes.
*           I always want to implement a way to make it work with other forms
*           of punctuation, but I can never get it quite right. Furthermore,
*           I would have used tokens and a delimiter for this, but I noticed
*           the tutorial used the Stringbuilder in Java... Which is something
*           I'm unfamiliar with. That's why I decided to do it that way.
* 10-11-2017
* CSC 251 Lab 8 - Sentence Capitalizer 
* @author Holly Franks
*/
package m3_l1_franksholly;
import java.util.Scanner;

public class M3_L1_FranksHolly {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;
        
        System.out.println("***SENTENCE CAPITALIZER***\nType a paragraph:");
        input = kb.nextLine();
        input = input.toLowerCase();
        
        System.out.println(CapitalizeSentence(input));
        
    }
    
    public static String CapitalizeSentence(String input)
    {
        input = input.trim();
        int i = 0;
        StringBuilder temp = new StringBuilder(input);
        
        if (temp.length() > 0) 
        {temp.setCharAt(0, Character.toUpperCase(temp.charAt(0)));}
             
        i = temp.indexOf(". ");
        
        while (i != -1)
        {
            i++;
            while (i < temp.length() && temp.charAt(i) == ' ') { i++; }
            temp.setCharAt(i, Character.toUpperCase(temp.charAt(i)));
            i = temp.indexOf(". ", i);
        }
        
        return temp.toString(); 
    }    
}
