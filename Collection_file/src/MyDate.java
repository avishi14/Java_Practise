
public class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate(int d, int m, int y) {
		this.day=d;
		this.month=m;
		this.year=y;
	}

	public boolean equals (Object o) {
		boolean result =false;
		if((o!=null) && (o instanceof MyDate))
		{
			MyDate d= (MyDate)o;
			if((day == d.day) &&(month == d.month) && (year == d.year))
			{
				result = true;
			}
		}
		return result;
	}

	public int hashcode() {
		System.out.println("hash");
		return (day*month*year);
	}
}

