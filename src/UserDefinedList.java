import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode;

import java.util.Set;

public class UserDefinedList {

	public static void main(String[] args) {
	
		
		UserDefinedClass e= new UserDefinedClass();
		e.setEmpId(100);
		e.setEmpAddr("Guindy");
		
		UserDefinedClass e1 = new UserDefinedClass();
		e1.setEmpId(101);
		e1.setEmpAddr("Kerala");
		
		ArrayList<UserDefinedClass> a = new ArrayList<UserDefinedClass>();
		a.add(e1);
		a.add(e);
		
		for (int i = 0; i < a.size(); i++) {
			
			System.out.println(a.get(i).getEmpId());
			System.out.println(a.get(i).getEmpAddr());
		}
		
		HashSet<UserDefinedClass> s = new HashSet<UserDefinedClass>();
		s.add(e);
		s.add(e1);
		for (UserDefinedClass itr : s) {
			
			System.out.println(itr.getEmpAddr());
			System.out.println(itr.getEmpId());
			
						
		}
		
		System.out.println("Map starts");
		
		HashMap<Integer, UserDefinedClass> m = new HashMap<Integer, UserDefinedClass>();
		m.put(1, e);
		m.put(2, e1);
	Set<Entry<Integer, UserDefinedClass>> sets = m.entrySet();
		for (Entry<Integer, UserDefinedClass> entries : sets) {
			System.out.println(entries.getKey());
			System.out.println(entries.getValue().getEmpAddr());
			System.out.println(entries.getValue().getEmpId());
		}
		
		
		UserDefinedClass r = new UserDefinedClass();
		r.setEmpAddr("Tambaram");
		r.setEmpId(2000);

		
		LinkedList<UserDefinedClass> ll = new LinkedList<UserDefinedClass>();
		ll.add(r);
		
		for (int i = 0; i < ll.size(); i++) {
			
			System.out.println(ll.get(i).getEmpId());
			System.out.println(ll.get(i).getEmpAddr());
			
		}
		
		
	}
	
	
}
