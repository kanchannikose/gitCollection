package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HahMapConcept {

	

	public static void main(String[] args) {
		
		/*
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "Qtp");
		hm.put(2, "Rft");
		hm.put(3, "Selenium");
		hm.put(4, "Ftp");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		
	
		
		
		//To print all the values
		for(Entry mm: hm.entrySet())
		{
			System.out.println(mm.getKey() +" "+mm.getValue());
		}
		
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		
		
		
		
		
		
		
		
		System.out.println("*************");
		
		
		
		//Create object of Employee
		Employee e1 =new Employee("Tom", 23, "admin");
		Employee e2=new Employee("Peter", 34, "Hr");
		Employee e3=new Employee("Julie", 30, "dev");
		
		//Create HashMap
		
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> em: emp.entrySet())
		{
			int ky = em.getKey();
			Employee val = em.getValue();
			
			System.out.println(ky + "Info");
			System.out.println(val.name +" "+ val.age+" "+val.org);
		}
		
*/
		
		
		
		
		HashMap <Integer, String> hm=new HashMap <Integer, String>();
		
		hm.put(1, "quick");
		hm.put(2, "wake");
		hm.put(3, "thick");
		hm.put(4, "fix");
		hm.put(5, "weak");
		hm.put(6, "weak");
		hm.put(null, null);
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(4));
		System.out.println(hm);
		
		//To print all the values
		for(Entry<Integer, String> mm : hm.entrySet())
		{
			System.out.println(mm.getKey() +" "+ mm.getValue());
		}
		
		hm.remove(2);
		System.out.println(hm);
		
		
		
		
		//create employee class object
		Employee e1=new Employee("Ravi", 34, "Civil");
		Employee e2=new Employee("Kiran", 35, "Space");
		Employee e3=new Employee("Raj", 33, "Retail");
		
		//Create HashMap
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> em: emp.entrySet())
		{
			
			Integer keyy = em.getKey();
			Employee valu = em.getValue();
			System.out.println(keyy +" Info");
			System.out.println(valu.name +" "+valu.age+" "+valu.org);
					
		}
		
		
		
		
	}

}
