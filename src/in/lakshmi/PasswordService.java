package in.lakshmi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String pwd = "laxmi@nara";
		MessageDigest md =  MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(pwd.getBytes());
		String str = new String(digest);
		System.out.println(str);
		Encoder encoder = Base64.getEncoder();
      byte[] encode = encoder.encode(pwd.getBytes());
      String encodePwd = new String(encode);
      System.out.println(encodePwd);
      Decoder decoder = Base64.getDecoder();
     byte[] decode = decoder.decode(encodePwd.getBytes());
     String decodePwd = new String(decode);
     System.out.println(decodePwd);
	}

}
