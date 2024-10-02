package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		
		/*
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("test");
		li.add("qtp");
		li.add("rpa");
		li.add("rft");
		li.add("ftp");
		
		System.out.println("content of linkedList:- "+ li);
		
		//addFirst
		li.addFirst("Kanchan"); 
		
		//addLast
		li.addLast("Goenka");
		
		System.out.println("content of linkedList:- "+li);
		
		//get
		System.out.println(li.get(0));
		
		//set
		li.set(0, "Karthik");
		
		System.out.println(li.get(0));
		
		//remove first and last element
		li.removeFirst();
		li.removeLast();
		
		System.out.println("content of linkedList :- "+li);
		
		
		
		
		li.remove(3);
		System.out.println("content of linkedList :- "+li);
		
		
		//A)  To print all the values
		//1) Use for loop
		System.out.println("*******Using for loop");
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		
		System.out.println("*******Advance for loop");
		
		//2) Use Advance for loop
		for(String lii: li)
		{
			System.out.println(lii);
		}
		
		
		
		//3) Using Iterator
		System.out.println("*******Using Iterator");
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//4) Using while loop
		
		System.out.println("*******Using while loop");
		
		int i=0;
		while(i<li.size())
		{
			System.out.println(li.get(i));
			i++;
		}
		
		
		*/
		
		
		
		LinkedList li=new LinkedList();
		li.add("test");
		li.add("qtp");
		li.add("rpa");
		li.add("htp");
		
		System.out.println("content of linkedlist: -> "+li);
		
		li.addFirst("Kanchan");
		
		li.addLast("Nikose");
		
		System.out.println("content of linkedlist:- >"+li);
		
		System.out.println(li.get(0));
		
		li.set(0, "Ankita");
		
		System.out.println(li.get(0));
		
		//remove first and last element
		
		li.removeFirst();
		li.removeLast();
		
		System.out.println("content of linkedlist :-> "+li);
		
		li.remove(2);
		
		//1)to print all the values--for loop
		
		  System.out.println("*******for loop");
		for(int i=0; i<li.size(); i++)
		{
			
			System.out.println(li.get(i));
		}
		
		
		
		//2)to print all the values--Advance for loop
           System.out.println("*******Advance for loop");
		
	  for( Object lii : li)     //here required String
	  {
		  System.out.println(lii);
	  }
		
         
	      //Using iterator
	     System.out.println("*******Using Iterator");
	  
	       Iterator it = li.iterator();
	       while(it.hasNext())
	       {
	    	 
	    	   System.out.println(it.next());
	       }
	       
	       
	       //Using while loop
	       System.out.println("*******Using while loop");  
	       
	       int i=0;
	       while(i<li.size())
	       {
	    	   System.out.println(li.get(i));
	    	   i++;
	       }
	       
	}

}
