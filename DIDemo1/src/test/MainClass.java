package test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javasoft.Hello;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx= 
				new GenericXmlApplicationContext("config/beans.xml");
		Hello hello = (Hello)ctx.getBean("hello");
		//hello.setNames(names);//beans.xml에 이미 
/*		List<String> mylist=hello.getNames();
		for(String str: mylist) {
			System.out.println(str);
		}*/
		/*Set<String> myeditors=hello.getEditors();
		for(String str: myeditors) {
			System.out.println(str);
		}//중복값이 제거됨
*/		
		/*Map<String,Integer>mymap =hello.getAges();
		Set< String> keys= mymap.keySet();
		for(String str: keys) {
			System.out.println(str+"-->"+mymap.get(str));
		}//중복값이 제거됨
*/	
		Properties myadd= hello.getAddresses();
		Set<Object> keys=myadd.keySet();
		for(Object obj:keys) {
			String key= (String)obj;
			System.out.println(obj+"-->"+myadd.getProperty(key));
		}
	}
}
