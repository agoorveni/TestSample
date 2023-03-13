
import java.util.ArrayList;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.openqa.selenium.interactions.Actions;

public class JavaCodeTest {

	public static void main(String[] args) {

		
		List<Integer> lo = new ArrayList<>();
		
		lo.add(100);
		lo.add(101);
		lo.add(102);
		lo.add(103);
		lo.add(100);
		System.out.println("with duplicate:" + lo);
		
		
		ListIterator<Integer> li = lo.listIterator();
		
		while (li.hasNext()) {
		
			li.next();
			
		}
				Vector<Integer> v = new Vector<>();
		
		v.add(100);
		v.add(101);
		v.add(102);
		v.add(103);
		
	Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
					
			Integer xt = it.next();
			System.out.println(xt);
			
		}

		
		
		
//		Set<Integer> uu= new HashSet<>();
//		
//		uu.addAll(lo);
//		System.out.println("Remove duplicate:" + uu);
//		
//		
//Map<Integer, String> m6 = new HashMap<>();
//		
//		m6.put(10, "Veni");
//		m6.put(11, "Veni");
//		m6.put(12, "Vani");
//		m6.put(13, "Weni");
//		m6.put(14, "Jeni");
//		
//		
//		
//				
//		String string3 = m6.get(12);
//		System.out.println("12 value: " + string3);
//		
//		
//		
//		System.out.println(m6);
//		Set<Entry<Integer, String>> es3 = m6.entrySet();
//		
//		for (Entry<Integer, String> ittt : es3) {
//			
//			System.out.println("Map irt:" + ittt);
//			
//			
//		}
//		
//		System.out.println(m6);
//		
//		Set<Entry<Integer, String>> entrySet2 = m6.entrySet();
//		
//		for (Entry<Integer, String> itr22 : entrySet2) {
//			System.out.println(itr22);
//		}
//		
//		List<Integer> l = new ArrayList<>();
//		
//		HashSet<Integer> s = new HashSet<>();
//		
//		
//		
//		l.add(100);
//		l.add(101);
//		l.add(102);
//		l.add(103);
//		l.add(100);
//		
//		System.out.println(l);
//		
//		s.addAll(l);
//		
//		System.out.println(s);
//		
//		List<String> m = new ArrayList<>();
//
//m.add("Veni");
//m.add("Vani");
//m.add("Harshith");
//m.add("Hi hello");
//		
//System.out.println(m);
//		
//		String string = m.get(2);
//		System.out.println(string);
//
//		String remove = m.remove(1);
//		
//	l.add(3, 1063);
//	System.out.println(l);
//	
//	l.set(1, 500);
//	System.out.println(l);
//	
//	Integer integer = l.get(3);
//	
//	Integer remove2 = l.remove(2);
//	System.out.println(l);
//	
//	
//	int indexOf = l.indexOf(100);
//	System.out.println(indexOf);
//	
//	
//	
//	List<Integer> l1 = new ArrayList<>();
//	l.add(500);
//	l.add(600);
//	l.add(700);
//	l.addAll(l1);
//	System.out.println(l);
//	
//	l.addAll(l1);
//	
//	l.retainAll(l1);
//	System.out.println(l);
//	
//	l.removeAll(l1);
//	System.out.println(l);
//	
//	
//	int size = l.size();
//	
//	
//	
//	Map<Integer, String> m1 = new HashMap<>();
//	
//	m1.put(1, "Hello");
//	m1.put(2, "Hi");
//	m1.put(3, "Morning");
//	m1.put(4, "Evening");
//	
//	System.out.println(m1);
//	int size2 = m1.size();
//	System.out.println(size2);
//	
//	String string2 = m1.get(2);
//	System.out.println(string2);
//	
//	String remove3 = m1.remove(3);
//	System.out.println(remove3);
//	System.out.println(m1);
//	boolean containsKey = m1.containsKey(5);
//	System.out.println(containsKey);
//	
//	boolean containsValue = m1.containsValue("evening");
//	System.out.println(containsValue);
//	
//	
//	Set<Integer> keySet = m1.keySet();
//	System.out.println(keySet);
//	
//	Collection<String> values = m1.values();
//	System.out.println(values);
//	
//	Set<Entry<Integer, String>> entrySet = m1.entrySet();
//	System.out.println(entrySet);
//	
//	
	
	
	
	
		//String l= "Veni";
//		
//		String s = "Welcome";
//		
//		String substring = s.substring(3);
//		System.out.println(substring);
//		
//		
//	String substring2 = s.substring(1, 5);	
//	System.out.println(substring2);
//	
//	
//	int compareTo = s.compareTo(l);
//	System.out.println(compareTo);
//	
//	
//		int indexOf = s.indexOf("e");
//		System.out.println(indexOf);
//		
//		
//		
//		int lastIndexOf = s.lastIndexOf("e");
//		System.out.println(lastIndexOf);
		
//		char charAt = s.charAt(4);
//		System.out.println(charAt);
//		int length = s.length();
//		
//		String upperCase = s.toUpperCase();
//		boolean startsWith = s.contains("s");
//		System.out.println(startsWith);
//		
//		String replace = s.replace("W", "H");
//		System.out.println(replace);
//		
//		
//		String replaceAll = s.replaceAll("Welcome", "Hi");
//		System.out.println(replaceAll);
		
		
//	}
	
//		List a = new ArrayList();
//		
//		a.add("Veni");
//		a.add(12345);
//		a.add(12345.67f);
//		a.add(123456789012l);
//		a.add(null);
//		a.add(30);
//		a.add(null);
//		a.add('a');
//		
//		
//		System.out.println(a);
//		System.out.println(a.get(4));
//		
//		for (int i = 0; i < a.size(); i++) {
//			Object object = a.get(i);
//			
//			System.out.println(object);
//		}
//		a.add(2, "Vani");
//		System.out.println(a);
//		a.set(2, "Bhuvana");
//		System.out.println(a);
//		
//		List b = new LinkedList();
//		b.add("harshith");
//		b.add("Veni");
//		b.add(30);
//		b.add(12345);
//		b.add("Naga");
//		b.add("Karthik");
//		
//		System.out.println(b);
//		b.addAll(a);
//		System.out.println(b);
//		
//		a.retainAll(b);
//		System.out.println("updtaed list:" + a);
//		a.removeAll(b);
//		System.out.println("updtaed list1:" + a);
//		
//		
//		//Set
//		
//Set<Integer> s =  new HashSet<>();
//	s.add(12);
//	s.add(13);
//	s.add(14);
//	s.add(15);
//	s.add(null);
//	
//	System.out.println("Random order:" + s);
//	
//		for (Integer itr : s) {
//			System.out.println(itr);
//		}
//		
//		Set<Integer> ls = new LinkedHashSet<>();
//		ls.add(1);
//		ls.add(2);
//		ls.add(5);
//		ls.add(10);
//		ls.add(null);
//		
//		System.out.println("Insertion order:" +ls);
//		
//		for (Integer itr1 : ls) {
//			
//			System.out.println(itr1);
//			
//		}
//		
//		Set<Integer> ts = new TreeSet<>();
//		ts.add(16);
//		ts.add(19);
//		ts.add(20);
//		ts.add(21);
//		ts.add(9);
//		ts.add(7);
//		
//		System.out.println("Ascending order: " + ts);
//		for (Integer itr3 : ts) {
//			System.out.println(itr3);
//		
//		}
//		
//		System.out.println("Map task");
//		
//		Map<Integer, String> m = new HashMap<>();
//		
//		m.put(10, "Veni");
//		m.put(11, "Veni");
//		m.put(12, "Vani");
//		m.put(13, "Weni");
//		m.put(14, "Jeni");
//		
//		
//		
//		System.out.println(m);
//		
//		Set<Entry<Integer, String>> entrySet = m.entrySet();
//		System.out.println(entrySet);
//		
//		for (Entry<Integer, String> itr5 : entrySet) {
//			System.out.println(itr5);
//			
//			}
		
//		}
		
//		
//		String string = m.get(12);
//		System.out.println("Value:" + string);
//		
//		String remove = m.remove(13);
//		System.out.println(remove);
//		System.out.println(m);
//		Set<Integer> keySet = m.keySet();
//		System.out.println(keySet);
//		
//		Collection<String> values = m.values();
//		System.out.println(values);
//		
//		
//		for (Integer entry : m.keySet()) {
//			System.err.println("Key:" + entry);
//		}
//		
//		for (String valueonly : m.values()) {
//			System.out.println("Values: " + valueonly);
//			
//		}
//		
//		
//		
//	}
//	
	
	}
}