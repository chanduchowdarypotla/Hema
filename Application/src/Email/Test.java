package Email;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Firstname");
		String FName=s.next();
		System.out.println("Enter the Last name");
		String LName=s.next();
		System.out.println("Enter the Department");
		System.out.println("Press 1 For-Sales; Press 2 For-Devolpment; Press 3 For-Accounting");
		int id=s.nextInt();
		System.out.println("Enter the Name of Company");
		String Cname=s.next();
		Emailid e= new Emailid(FName, LName, id, Cname);
		System.out.println(e.getEmailAddress());
		System.out.println("Mail Box Capacity is"+" "+e.getMailBoxCapacity());
		System.out.println("PASSWORD IS"+" "+e.generatepassword());
		System.out.println("First Name is"+" "+FName);
		System.out.println("Last Name is"+" "+LName);
		System.out.println(" IF YOU WANT To reset the Password PRESS 1 ");
		int setpwd=s.nextInt();
		System.out.println("enter new password");
		Long newpwd=s.nextLong();
		if(setpwd==1)
		{
			e.setPassword(newpwd);
			System.out.println(e.getPassword());
			System.out.println("password changed succesfully");
		}else
		{
			System.out.println("password not changed");
		}
		System.out.println("if you to change email id press 2");
		int newemail=s.nextInt();
		System.out.println("enter the alternate email");
		String altemail=s.next();
		if(newemail==2){
			e.setAlternateEmailAddress(altemail);
			System.out.println(e.getAlternateEmailAddress());
		}else{
			System.out.println(".........");
		}
	}
}
