package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {
		
		/*
		
		Hashtable h1=new Hashtable();
		
		h1.put(1, "Tom");
		h1.put(2, "Selenium");
		h1.put(3, "Test");
		
		//1) clone copy or shallow copy
		
		Hashtable h2=new Hashtable();
		
		h2  =(Hashtable) h1.clone();
		
		System.out.println("The value of h1 "+h1);
		System.out.println("The value of h2 "+h2);
		
		h1.clear();
		
		System.out.println("The value of h1 "+h1);
		System.out.println("The value of h2 "+h2);
		
		
		
		//2)Contains value
		
		Hashtable ht=new Hashtable();
		ht.put("A", "Dom");
		ht.put("B", "Kanchan");
		ht.put("C", "Dolli");   //It contain unique value
	//	ht.put("C", "Dolli");
	//	ht.put("D", null); NullPointerException
		
		if(ht.containsValue("Kanchan"))
		{
			System.out.println("value found");
		}
		
		
		
		
		//3) print all the values in Hashtable using Enumeration--element
		
		Enumeration ee = ht.elements();
		System.out.println("All the values");
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
		}
		
		
		
		//3) Print value from hashtable using--entry set--set of hashtable values
		
		Set h = ht.entrySet();
		System.out.println(h);
		
		
		Hashtable ht1=new Hashtable();
		ht1.equals(ht);
		{
			System.out.println("both are equal");
		}
		
		
		System.out.println(ht.get("B"));
		
		System.out.println("the hash code value  "+ht.hashCode());


*/
		
		
		
		
		
		
		
		
		
		Hashtable ht1=new Hashtable();
		ht1.put(1, "Tom");
		ht1.put(2, "Dom");
		ht1.put(3, "Bom");
		ht1.put(4, "Wom");
		
		System.out.println("The value of ht1:-> "+ht1);
		
		//Copy-->clone
		
		Hashtable ht2=new Hashtable();
		
		ht2=(Hashtable) ht1.clone();
		
		System.out.println("The value of ht2 :-> "+ht1);
		ht1.clear();
		System.out.println("The value of ht1:-> "+ht1);
		//Contains value
		
		Hashtable ht3=new Hashtable();
		ht3.put("A", "Anna");
		ht3.put("B", "Bella");
		ht3.put("C", "Caty");
		ht3.put("D", "Duke");
		
		
		if(ht3.contains("Bella"))
		{
			System.out.println("value found");
		}
		else
		{
			System.out.println("value not found");
		}
		
		
		
		//1) print all the value using Enumeration--->element
		Enumeration ee = ht3.elements();
		System.out.println("All the values:-> ");
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
		}
		
		
		
		//2) print all the value using Entry set-->Set of hashtable
		
		Set htt = ht3.entrySet();
		System.out.println(htt);
		
		
		//equal
		
		Hashtable ht4=new Hashtable();
		if(ht4.equals(ht3))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		
		System.out.println(ht3.get("B"));
		System.out.println("Hashcode value:-> "+ht3.hashCode());
		
	}

}
