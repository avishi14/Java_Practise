
public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(2,3,2011); 
		MyDate date2 = new MyDate(2,3,2011);
		if(date1 == date2) {
			System.out.println("Date1 is identical to date 2");
		}
		else
		{
			System.out.println("Date1 is not identical to date 2");
		}

		if(date1.equals(date2)) {
			System.out.println("date1 is equals to date 2");
		}
		else
		{
			System.out.println("date1 is not equals to date 2");
		}
		System.out.println(date1.hashcode());
		System.out.println(date2.hashcode());

	}

}
