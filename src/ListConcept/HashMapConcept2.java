package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept2 {

	public static void main(String[] args) {
		
		/*
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(1, "Spiderman");
		hm.put(2, "Ironman");
		hm.put(3, "Superman");
		hm.put(4, "Hercules");
		
		System.out.println(hm);
		
		System.out.println(hm.get(4));
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm);
		
		//To print all values
		for(Entry hm1: hm.entrySet())
		{
			System.out.println(hm1.getKey() +" "+ hm1.getValue());
		}
		
		
		System.out.println("***********");
		
		
		
		//Create object for Employee
		
		Employee e1 =new Employee("Julie", 23, "CabinCrew");
		Employee e2= new Employee("Jack", 33, "Actor");
		Employee e3=new Employee("Jinni", 27, "Doctor");
		
		
		HashMap<Integer, Employee> hs=new HashMap<Integer, Employee>();
		hs.put(1, e1);
		hs.put(2, e2);
		hs.put(3, e3);
		
		for(Entry<Integer, Employee> hs1 : hs.entrySet())
		{
			Integer ky = hs1.getKey();
			Employee valu = hs1.getValue();
			{
				System.out.println("Emp "+ ky + " Info :");
				System.out.println(valu.name +" "+valu.age+" "+valu.org);
			}
		}
		
*/
		
		
		
		
		
		
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Diwali");
		hm.put(2, "Eid");
		hm.put(3, "Christmas");
		hm.put(4, "Holi");
		hm.put(5, "new-year");
		
		System.out.println(hm);
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		
		hm.remove(5);
		
		System.out.println(hm);
		
		
		//To print all the values
		
		for(Entry<Integer, String> hmm: hm.entrySet())
		{
			System.out.println(hmm.getKey()+" "+hmm.getValue());
		}
		
		
		System.out.println("**********");
		
		//Create Employee class object
		
		Employee e1=new Employee("Sia", 22, "Brodcast");
		Employee e2=new Employee("Tini", 18, "Health");
		Employee e3=new Employee("Priti", 25, "HotelManagement");

		
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> emm: emp.entrySet())
		{
			Integer keyy = emm.getKey();
			Employee valu = emm.getValue();
			
			System.out.println(keyy +"Info");
			System.out.println(valu.name + " "+valu.age+ " "+valu.org);
		}
		
	}

}
