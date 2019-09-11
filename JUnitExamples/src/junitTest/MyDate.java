package junitTest;

public class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate(int year, int month, int day) {

		this.day=day;
		this.month=month;
		this.year=year;
	}

	public MyDate() {

	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void addDays(int Days) {
		int sumd=day; 
		sumd=sumd+Days; //28+4=32 =sumd
		int dm=daysInMonth();

		if(dm==31 && month==12)
		{
			if(sumd>31)
			{
				year=year+1;
				month=1;
				int extra = sumd - 31;
				sumd=extra;
			}
		}

		else if(dm==31)
		{
			if(sumd>31)
			{
				month=month+1;
				int extra = sumd - 31;
				sumd=extra;
			}

		}
		else if(dm==29) 
		{
			if(sumd>29)
			{
				month=month+1;
				int extra = sumd - 29;
				sumd=extra;
			}
			}
		else if(dm==28) {
			if(sumd>28)
			{
				month=month+1;
				int extra = sumd - 28;
				sumd=extra;
			}
		}

		else if(sumd>30)
		{
			month=month+1;
			int extra = sumd - 30;
			sumd=extra;
		}

		day= sumd;
		System.out.println("day is: "+ day + " month is:" + month + " Year is:" + year);

	}

	public int daysInMonth() {
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			day=31;
		else if(isLeapYear())
			day=29;
		else if(month==2)
			day=28;
		else day= 30;

		return day;
	}

	public String dayOfWeek(int d) {

		String weekDay=null;
		switch(d) {
		case 1 : weekDay="Monday";
		break;
		case 2 : weekDay="Tuesday";
		break;
		case 3 : weekDay="Wednesday";
		break;
		case 4 : weekDay="Thursday";
		break;
		case 5 : weekDay="Friday";
		break;
		case 6 : weekDay="Saturday";
		break;
		case 7 : weekDay="Sunday";
		break;
		default: System.out.println("Wrong input");
		}

		return weekDay;
	}

	public boolean equals(Object o) {
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

	public boolean isLeapYear() {
		boolean flag = false;
		if(year % 400 == 0)
		{
			flag = true;
		}
		else if (year % 100 == 0)
		{
			flag = false;
		}
		else if(year % 4 == 0)
		{
			flag = true;
		}
		else
		{
			flag = false;
		}	
		return flag;
	}

	public void nextDay() {
		//advance by 1 day
		day=day+1;
		System.out.println("Day is: " + day);
	}

	public String toString() {
		return "Date is:"+ day +"/"+ month+"/" + year;
	}
}
