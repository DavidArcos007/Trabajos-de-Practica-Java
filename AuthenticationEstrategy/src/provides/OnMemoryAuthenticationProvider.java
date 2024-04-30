
package provides;

import impl.*;
import util.*;


/**
 *
 * @author Lenovo
 */
public class OnMemoryAuthenticationProvider implements IAuthenticationStrategy{

    public OnMemoryAuthenticationProvider() {
    }
    
    @Override
    public Principal authenticate(String userName, String passwrd) {
        User user = OnMemoryDataBase.findUserByName(userName);
        if(user!=null && user.getPassword().equals(passwrd)){
            return new Principal(user.getUserName(), user.getRol());
            }
        return null;
    }
}
