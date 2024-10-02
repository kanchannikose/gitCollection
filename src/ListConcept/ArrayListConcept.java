package ListConcept;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		/*
		ArrayList ar= new ArrayList();  //Dynamic array
		
		ar.add(100);
		ar.add("Tom");
		ar.add('k');
		ar.add(1234566);
		ar.add(true);
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("**************");
		
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		
		ar2.add(122);//0
		ar2.add(122);//1
		ar2.add(1234);//2
		System.out.println(ar2.size());
		

		System.out.println("**************");	
		
		
		
		
		
		//To print all the values--->
		//1) Use for loop   2)Use interator
		
		
		
		
		
		
		//1) Employee class object
		Employee e1=new Employee("Kanchan",26, "QA");
		Employee e2=new Employee("Kia", 23, "developer");
		Employee e3=new Employee("Caren", 28, "BA");
		
		
		//2) Create ArrayList
		
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		
		//3) Iterator to traverse the values
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.org);
		}
		
		
		
		System.out.println("********************");
		
		
		
		
		
		
		
		//AddAllMethod
		
		ArrayList ar4= new ArrayList();
		
		ar4.add("Selenium");
		ar4.add("Cucumber");
		ar4.add("Postman");
		
		ArrayList ar5= new ArrayList();
		
		ar5.add("Rest Assured");
		ar5.add("Appium");
		ar5.add("Jmeter");
		
		ar4.addAll(ar5);
		
		for(int i=0; i<ar4.size(); i++)
		{
			System.out.println(ar4.get(i));
		}



*/
		
		
		
		
		
		
		ArrayList ar1=new ArrayList();
		ar1.add("Italy");
		ar1.add("CES123");
		ar1.add('K');
		ar1.add(12345566);
		ar1.add(true);
		for(int i=0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(123344); //0
		ar2.add(2345);  //1
		ar2.add(45667); //2
		ar2.add(4567); //3
		
		for(int i=0; i<ar2.size(); i++)
		{
			System.out.println(ar2.get(i));
		}
		System.out.println("size:-> "+ar2.size());
		

		System.out.println("************");
		
		//1) Create Employee class object
		Employee e1=new Employee("Bani", 34, "Space");
		Employee e2=new Employee("Sia", 28, "Health");
		Employee e3=new Employee("Lauren" , 45, "Labour");
		
		
		//2) Creatr ArrayList 
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		
		//3) Create Iterator
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext())
		{
			Employee itt = it.next();
			System.out.println(itt.name);
			System.out.println(itt.age);
			System.out.println(itt.org);
		}
		
		System.out.println("*************");
		
		
		ArrayList ar4=new ArrayList();
		ar4.add("Selenium");
		ar4.add("Robotics");
		ar4.add("Catalyst");
		
		ArrayList ar5=new ArrayList();
		ar5.add("Jenkins");
		ar5.add("OOps");
		
		ar4.addAll(ar5);
		for(int i=0; i<ar4.size(); i++)
		{
			System.out.println(ar4.get(i));
		}
		
		
		
		
		
		
		
		
	}

}
