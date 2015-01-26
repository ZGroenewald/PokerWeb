package model;

//import sun.security.provider.SecureRandom;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * Created by Zen on 2015/01/20.
 */
@Entity(name = "poker_user")
public class User {
    @Id
    @Size(max = 12)
    private String name;
    private String password;
    private String salt;

    public String getName() {return this.name;}

    public String getPassword() {return this.password;}

    public String getSalt() {return this.salt;}

    public String byteToString(byte[] input) {return org.apache.commons.codec.binary.Base64.encodeBase64String(input);}

    public void setName(String name) {this.name = name;}

    public void setPassword(String password) {this.password = password;}

    public void setSalt(){
        final Random r = new SecureRandom();
        byte[] salt = new byte[32];
        r.nextBytes(salt);
        this.salt = byteToString(salt);
    }

    public void encrypt(){
        String newPass = password + salt;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(newPass.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < bytes.length; i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            newPass = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
