package Email;
import java.util.Random;
public class Emailid {
	private String Fristname;
	private String Lastname;
	private String Department;
	private String CompanyName;
	private long Password;
	private int MailBoxCapacity;
	private String EmailAddress;
	private String AlternateEmailAddress;
	public String getAlternateEmailAddress() {
		return AlternateEmailAddress;
	}
	public Emailid(String Firstname,String Lastname,int dept,String CompanyName)
	{
		this.Fristname=Firstname;
		this.Lastname=Lastname;
		this.CompanyName=CompanyName;
		this.setDepartment(dept);
		this.generateEmailAddress();
	}
	public void generateEmailAddress()
	{
		EmailAddress=Fristname+"."+Lastname+"@"+Department+"."+CompanyName+".com";
	}
	public int generatepassword()
	{
		Random rn=new Random();
		int n=100000+rn.nextInt(999999);
		return n;
	}
	public void setDepartment(int id)
	{
		Random r=new Random(3);
		if(id==1)
			this.Department="Sales";
		else if(id==2)
			this.Department="Devolpment";
		else if(id==3)
			this.Department="Accounting";
		else
			this.Department="None";
	}
	public int getMailBoxCapacity() {
		return this.MailBoxCapacity=1000;
	}
	public void setMailBoxCapacity(int mailBoxCapacity) {
		MailBoxCapacity = mailBoxCapacity;
	}
	public void setPassword(long password) {
		Password = password;
	}
	public void setAlternateEmailAddress(String alternateEmailAddress) {
		AlternateEmailAddress = alternateEmailAddress;
	}
	public String getName() {
		return this.Fristname+" "+this.Lastname;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public long getPassword() {
		return Password;
	}
}
