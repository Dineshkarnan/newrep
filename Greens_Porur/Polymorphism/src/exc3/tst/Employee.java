package exc3.tst;

public class Employee {
	
	public void empid(int empid)
	{
		System.out.println("int method" +empid);
	}
	public void empid(String name,long phnno,char block)
	{
		System.out.println("3 methods" +name +phnno  + block);
	}

	public void empid(float salary,int age) 
	{
	System.out.println("Age & Salary " +age +salary);	
	}
	public static void main(String[] args) 
	{
	Employee emp = new Employee();
	emp.empid(1236);
	emp.empid(56000, 25);
	emp.empid("Dinesh karunanithi", 8344210128l , 'A');
	}
}
