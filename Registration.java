
package registration;

public class Registration {

    public static void main(String[] args) {
       IDandPASS ip = new IDandPASS();
       
       
       LoginPage LP = new LoginPage(ip.getLoginfo());
       
    }
    
}
