
public class StringBEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This is Sample StringBuffer");
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer(50);
		sb2.insert(0,"Hello");
		sb2.insert(1, "Java");
		//sb2.append(sb);
		System.out.println(sb2);
		System.out.println("character at: "+sb2.charAt(2));
		System.out.println("first index of: "+sb.indexOf("is"));
		System.out.println("Last occurence of: "+sb.lastIndexOf("is"));

		System.out.println("Find substring: "+sb2.substring(1, 4));


		/*System.out.println("reverse string: "+ sb.reverse());
		System.out.println(sb);*/
		
		System.out.println(sb2.length());
	}

}
