package captcha;
import java.io.*;
import java.util.*;
import java.util.Random;

public class Captcha
{
	public String getCaptcha()
	{
		char data[]= {'a','b','c','d','e','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0','!','@','#','$','%','&','*'}; 
		char index[]=new char[7];
		Random r=new Random();
		int i=0;
		for(i=0;i<index.length;i++)
		{
			int ran=r.nextInt(data.length);
			index[i]=data[ran];
		}
		return new String(index);
	}
	static boolean checkCaptcha(String captcha, String user_captcha)
    {
        return captcha.equals(user_captcha);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Captcha c=new Captcha();
		String captcha=c.getCaptcha();
		System.out.println(captcha);
		System.out.println("Enter above CAPTCHA: ");
	    String usr_captcha =sc.nextLine();
	      
	    // Notify user about matching status
	    if (checkCaptcha(captcha, usr_captcha))
	        System.out.println("CAPTCHA Matched");
	    else
	        System.out.println("CAPTCHA Not Matched");

	}

}