package java_file;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties props = System.getProperties();
		Enumeration propNames = props.propertyNames();
		props.put("Avishi", "Aggarwal");
		 while ( propNames.hasMoreElements() ) {
		 String propName = (String) propNames.nextElement();
		 String property = props.getProperty(propName);
		 System.out.println("property ’" + propName
		 + "’ is ’" + property + "’");
		 }
	}
}
