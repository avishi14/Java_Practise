

class accessEmp{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



}
public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessEmp e1 = new accessEmp();
		e1.setId(1);
		e1.setName("avishi");
		System.out.println(e1.getId());
		System.out.println(e1.getName());
	}
	
}
