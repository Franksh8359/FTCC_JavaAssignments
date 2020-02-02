/**
* Here is the Person class for Personal Information Class (M1_L5_FranksHolly).
* 8-28-2017
* CSC 251 Lab 5 - Personal Information Class
* @author Holly Franks
*/
package m1_l5_franksholly;

public class Person {
   
    private String name;
    private String address;
    private int age;
    private String phone;
    
    public Person()
    {
        name = "";
        address = "";
        age = 0;
        phone = "";
    }
    
    public Person(String n, String add, int a, String ph)
    {
        name = n;
        address = add;
        age = a;
        phone = ph;
    }

    public void setName(String n) {name = n;}
    public void setAddress(String add) {address = add;}
    public void setAge(int a) {age = a;}
    public void setPhone(String ph) {phone = ph;}

    public String getName() {return name;}
    public String getAddress() {return address;}
    public int getAge() {return age;}
    public String getPhone() {return phone;}

}

