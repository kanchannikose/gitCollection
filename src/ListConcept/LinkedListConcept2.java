package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept2 {

	public static void main(String[] args) {
		
		/*
		LinkedList<String> li=new LinkedList<String>();
		li.add("spiderman");
		li.add("Superman");
		li.add("Xman");
		li.add("Hulk");
		li.add("BlackPanther");
		
		System.out.println("Content of LinkedList :->"+li);
		
		
		li.addFirst("CaptainMarvel");
		li.addLast("Thor");
		
		System.out.println("Content of LinkdList:->"+li);
		
		
		li.remove(4);
		System.out.println("Content of LinkdList:->"+li);
		
		
		System.out.println(li.get(0));
		li.set(2, "Hercules");
		System.out.println(li.get(2));
		
		li.removeFirst();
		li.removeLast();
		
		System.out.println("content of LinkedList :->"+li);
		
		
		
		
		//To print all the values
		//1) Use for loop
		System.out.println("*******Use for loop");
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		
		//2) Use Advance for loop
		System.out.println("*******Use Advance for loop");
		for(String lii:li)
		{
			System.out.println(lii);
		}
		
		
		
		//3)Use Iterator
		System.out.println("*******Use Iterator");
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//4) Use While loop
		System.out.println("*******Use While loop");
		int i=0;
		while(i<li.size())
		{
			System.out.println(li.get(i));
			i++;
		}
		
		
		*/
		
		
		
		
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("Rajgopalachari");
		li.add("Sudarshan");
		li.add("Chakrpani");
		li.add("Kulkarni");
		
		
		System.out.println("content of linkedlist:-> "+ li);
		
		li.addFirst("Prakash");
		li.addLast("Bhosale");
		
		System.out.println("content of linkedlist:-> "+ li);
		
		System.out.println(li.get(0));
		System.out.println(li.get(5));
		
		li.set(1, "Abhinav");
		
		System.out.println("content of linkedlist:-> "+ li);
		
		li.removeFirst();
		li.removeLast();
		
		System.out.println("content of linkedlist:-> "+ li);
		
		
		//1) To print all the values--Use for loop
		System.out.println("**************Use for loop");
		
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		
		//2) To print all the values--Use Advance for loop
		System.out.println("**************Use Advance for loop");
		
		for(String lii: li)
		{
			System.out.println(lii);
		}
		
		//3) To print all the values--Use Iterator
		System.out.println("**************Use Iterator");
		
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//To print all the values--Use while loop
		System.out.println("**************Use while loop");
		
		int i=0;
		while(i<li.size())
		{
			System.out.println(li.get(i));
			i++;
		}

	}

}
