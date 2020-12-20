
package Model;

public class Customer {
    private String name;
    private String address;
  
    public Customer()
    {
        name="";
        address="";
    }
    
    public Customer(String n, String a)
    {
        name=n;
        address= a;
       
    }

    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
