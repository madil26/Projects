/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passkeygenerator;

import java.security.SecureRandom;
import java.util.Base64;

/**
 *
 * @author muham
 */
public class PasswordGenerator {
    private String randomToken; 
    
    public String generatePassword6() {
	this.randomToken= generateSafeToken6();
	return this.randomToken;
	}
    public String generatePassword10(){
        this.randomToken = generateSafeToken10();
        return this.randomToken;
    }
    public String generatePassword16(){
        this.randomToken = generateSafeToken16();
        return this.randomToken;
    }
    
    public String generateSafeToken6() {
	    SecureRandom random = new SecureRandom();
	    byte bytes[] = new byte[6];
	    random.nextBytes(bytes);
	    Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
	    String token = encoder.encodeToString(bytes);
	    return token;
	}
    public String generateSafeToken10() {
	    SecureRandom random = new SecureRandom();
	    byte bytes[] = new byte[10];
	    random.nextBytes(bytes);
	    Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
	    String token = encoder.encodeToString(bytes);
	    return token;
	}
    public String generateSafeToken16() {
	    SecureRandom random = new SecureRandom();
	    byte bytes[] = new byte[16];
	    random.nextBytes(bytes);
	    Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
	    String token = encoder.encodeToString(bytes);
	    return token;
	}
    
}
