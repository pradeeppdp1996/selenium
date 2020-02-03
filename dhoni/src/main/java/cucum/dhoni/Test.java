package cucum.dhoni;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test extends Login {

	public static void main(String[] args) throws Throwable {
		
launch();
website("https://www.amazon.in/");
Thread.sleep(3000);
Login l=new Login();
text(l.getSearch(),"mobiles");
click(l.getSearchbutton());
click(l.getRedmi());
Set<String> s=driver.getWindowHandles();
List<String> e=new ArrayList<String>();
e.addAll(s);
e.get(2);
click(l.getAddtocart());
	}}
