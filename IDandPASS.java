
package registration;

import java.util.HashMap;


public class IDandPASS {
    HashMap<String,String> loginfo = new HashMap<String,String>();
    
    public IDandPASS(){
        loginfo.put("aditya", "1234");
        loginfo.put("Nischal", "5678");
        loginfo.put("indus", "9123");
        loginfo.put("Parasha", "6969");
    }
    
    protected HashMap getLoginfo(){
        return loginfo;
    }
}
