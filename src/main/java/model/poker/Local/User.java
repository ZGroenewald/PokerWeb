package model.poker.Local;

//import sun.security.provider.SecureRandom;
import java.security.SecureRandom;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * Created by Zen on 2015/01/20.
 */
public class User {
    @Id
    @Size(max = 12)
    private String name;
    private String password;
    private String salt;
    //getters and setters
    public String getName(){
        return name;
    }

    public String getPassword() { return password;}

    public String getSalt() { return salt;}

    public  byte[] generateSalt(){
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        return bytes;
    }

    public String byteToString(byte[] input){
        return org.apache.commons.codec.binary.Base64.encodeBase64String(input);
    }
}
