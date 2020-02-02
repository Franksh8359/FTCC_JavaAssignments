/**
* Here is the Month class for Month Class Exceptions.
* 11-06-2017
* CSC 251 Homework 4 - Month Class Exceptions
* @author Holly Franks
*/
package m3_l6_franksholly;

public class Month {
    
    private int monthNumber;
    
    private final String[] MONTHS = {"null", "january", "february", "march", "april", 
                                     "may", "june", "july", "august", 
                                     "september", "october", "november", "december"};
   
    //A no-arg constructor that sets the monthNumber field to 1.
    public Month()
    {
        monthNumber = 1;
    }
    
    //A constructor that accepts the number of the month as an argument. It should set the
    //monthNumber field to the value passed as the argument. If a value less than 1 or greater
    //than 12 is passed, the constructor should set monthNumber to 1.
    public Month(int num) throws InvalidMonthNumber
    {
        if (num < 1 || num > 12) {throw new InvalidMonthNumber();}
        else {monthNumber = num;}
    }
    
    //A constructor that accepts the name of the month, such as “January” or “February” as
    //an argument. It should set the monthNumber field to the correct corresponding value.
    public Month(String month) throws InvalidMonthName
    {
        for (int i = 1; i <13; i++) 
        {if (MONTHS[i] == month) {monthNumber = i; break;}
        else {throw new InvalidMonthName();}}
    }
    
    //A setMonthNumber method that accepts an int argument, which is assigned to the
    //monthNumber field. If a value less than 1 or greater than 12 is passed, the method
    //should set monthNumber to 1.
      public void setMonthNumber(int num) throws InvalidMonthNumber
    {
        if (num < 1 || num > 12) {throw new InvalidMonthNumber();}
        else {monthNumber = num;}
    }
    
    //A getMonthNumber method that returns the value in the monthNumber field.
    public int getMonthNumber()
    {
        int num = monthNumber;
        return num;
    }
    
    //A getMonthName method that returns the name of the month. For example, if the
    //monthNumber field contains 1, then this method should return “January”.
    public String getMonthName()
    {
        String name = MONTHS[monthNumber];
        return name;
    }
    
    //A toString method that returns the same value as the getMonthName method.
    public String toString()
    {
        return getMonthName();
    }
    
    //An equals method that accepts a Month object as an argument. If the argument object
    //holds the same data as the calling object, this method should return true. Otherwise,
    //it should return false
    public boolean equals(Month month)
    {
       boolean match = false;
       if (month.monthNumber == monthNumber) {match = true;}
       return match;
    }
    
    //A greaterThan method that accepts a Month object as an argument. If the calling
    //object’s monthNumber field is greater than the argument’s monthNumber field, this
    //method should return true. Otherwise, it should return false.
    public boolean greaterThan(Month month)
    {
        boolean greater = false;
        if (month.monthNumber > monthNumber) {greater = true;}
        return greater;
    }
    
    //A lessThan method that accepts a Month object as an argument. If the calling object’s
    //monthNumber field is less than the argument’s monthNumber field, this method should
    //return true. Otherwise, it should return false.
    public boolean lessThan(Month month)
    {
        boolean less = false;
        if (month.monthNumber < monthNumber) {less = true;}
        return less;
    }
    
}
