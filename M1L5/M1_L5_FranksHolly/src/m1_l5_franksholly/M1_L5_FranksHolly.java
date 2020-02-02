/**
* Here is lab 5 from module 1 (Personal Information Class) using NetBeans!
* 8-28-2017
* CSC 251 Lab 5 - Personal Information Class
* @author Holly Franks
*/
package m1_l5_franksholly;

public class M1_L5_FranksHolly {
    
    public static void main(String[] args) {
        
        Person me = new Person();
        Person friend1 = new Person();
        Person friend2 = new Person();
        
        me.setName("Holly Franks");
        me.setAddress("2256 Second Street, Fayetteville NC 28306");
        me.setAge(21);
        me.setPhone("910-689-5793");
        
        friend1.setName("Paulette Boehler");
        friend1.setAddress("213 Walnut Street, Savanna IL 61074");
        friend1.setAge(73);
        friend1.setPhone("710-273-1125");
        
        friend2.setName("John Doe");
        friend2.setAddress("103 Hazel Lane, Somewhere NC 01010");
        friend2.setAge(28);
        friend2.setPhone("919-123-4567");
                
        displayRecord(me);
        displayRecord(friend1);
        displayRecord(friend2);
                         
    }
    
    public static void displayRecord(Person person)
    {
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Age: " + person.getAge());
        System.out.println("Phone: " + person.getPhone());
        System.out.print("\n");
    }  
}
