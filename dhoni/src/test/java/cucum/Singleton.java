package cucum;

public class Singleton {
private loginpage lp;
private forgotpassword fp;
public loginpage getLp() {
	if (lp==null) {
		System.out.println("object created");
		lp=new loginpage();
	}
	return lp;
}
public forgotpassword getFp() {
if (fp==null) {
			fp= new forgotpassword();	
		}
return fp;}

}
