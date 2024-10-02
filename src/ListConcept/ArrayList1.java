package ListConcept;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList ar1=new ArrayList();
		ar1.add("Italy");
		ar1.add("CES123");
		ar1.add('i');
		ar1.add(12345566);
		for(int i=0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
	}

}
