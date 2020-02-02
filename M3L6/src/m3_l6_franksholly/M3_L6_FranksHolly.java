/**
* Here is the updated Month Class assignment with added exceptions.
* 11-06-2017
* CSC 251 Homework 4 - Month Class Exceptions
* @author Holly Franks
*/
package m3_l6_franksholly;

public class M3_L6_FranksHolly {

    public static void main(String[] args) throws InvalidMonthName, InvalidMonthNumber {
     
        //test 1
        Month month1 = new Month();
        System.out.println("Test 1: The month number is " + month1.getMonthNumber());
        
        //test 2
        try{Month month2 = new Month(8);
        System.out.println("Test 2: The month number is " + month2.getMonthNumber());}
        catch (InvalidMonthNumber e) {System.out.print(e.getMessage());}
        
        //test 2.1
        try{Month month3 = new Month(0);
        System.out.println("Test 2.1: The month number is " + month3.getMonthNumber());}
        catch (InvalidMonthNumber e) {System.out.print(e.getMessage());}
        
        //test 2.2
        try{Month month4 = new Month(13);
        System.out.println("Test 2.2: The month number is " + month4.getMonthNumber());}
        catch (InvalidMonthNumber e) {System.out.print(e.getMessage());}
        
        //test 3
        try{Month month5 = new Month("February");
        System.out.println("Test 3: The month is number " + month5.getMonthNumber());}
        catch (InvalidMonthName e) {System.out.print(e.getMessage());}
        
        //test 3.1
        try{Month month6 = new Month("sdfsdf");
        System.out.println("Test 3.1: The month is number " + month6.getMonthNumber());}
        catch (InvalidMonthName e) {System.out.print(e.getMessage());}
        
        //test 4
        try{month1.setMonthNumber(7);
        System.out.println("Test 4: The month is " + month1.getMonthNumber());}
        catch (InvalidMonthNumber e) {System.out.print(e.getMessage());}
        
        //test 4
        try{month1.setMonthNumber(0);
        System.out.println("Test 4.1: The month is " + month1.getMonthNumber());}
        catch (InvalidMonthNumber e) {System.out.print(e.getMessage());}
        
        //test 4
        try{month1.setMonthNumber(13);
        System.out.println("Test 4.2: The month is " + month1.getMonthNumber());}
        catch (InvalidMonthNumber e) {System.out.print(e.getMessage());}
        
        //test 5 & test 6
        System.out.println("Test 5&6: The month " + month1.getMonthNumber() + " is " + 
                                                    month1.getMonthName());
        //test 7
        System.out.println("Test 7: " + month1.toString());
        
        //test 8 
        Month month0 = new Month();
        month1.setMonthNumber(2);
        month0.setMonthNumber(3); 
        boolean isTrue = month0.equals(month1);
        Equals(isTrue, month1.toString(), month0.toString());
        
        //test 8.1 
        month1.setMonthNumber(12);
        month0.setMonthNumber(12); 
        isTrue = month0.equals(month1);
        Equals(isTrue, month1.toString(), month0.toString());
        
        //test 9
        month1.setMonthNumber(9);
        month0.setMonthNumber(10);
        isTrue = month1.greaterThan(month0);
        GreaterThan(isTrue, month0.toString(), month1.toString());
        
        //test 9.1
        isTrue = month0.greaterThan(month1);
        GreaterThan(isTrue, month1.toString(), month0.toString());
        
        //test 10
        isTrue = month1.lessThan(month0);
        LessThan(isTrue, month0.toString(), month1.toString());
        
        //test 10.1
        isTrue = month0.lessThan(month1);
        LessThan(isTrue, month1.toString(), month0.toString());
        
    }
    
    public static void Equals(boolean isTrue, String month1, String month2)
    {          
        if (isTrue) {System.out.println("Test 8: The months " + month1 +
                                         " and " + month2 + 
                                         " are the same.");}
        else {System.out.println("Test 8: The months " + month1 +
                                         " and " + month2 + 
                                         " are the NOT same.");}    
    }
    
    public static void GreaterThan(boolean isTrue, String month1, String month2)
    {          
        if (isTrue) {System.out.println("Test 9: The month " + month1 +
                                         " is greater than " + month2 + ".");}
        else {System.out.println("Test 9: The month " + month1 +
                                         " is NOT greater than " + month2 + 
                                        ".");}      
    }
    
    public static void LessThan(boolean isTrue, String month1, String month2)
    {          
        if (isTrue) {System.out.println("Test 10: The month " + month1 +
                                         " is less than " + month2 + ".");}
        else {System.out.println("Test 10: The month " + month1 +
                                         " is NOT less than " + month2 + 
                                        ".");}      
    }
    
}
