package fr.treeptik.initiationjava;

import java.util.AbstractList;
import java.util.ArrayList;


public class TestAbsractList extends AbstractList {

		ArrayList<String> list = new ArrayList<>();

		@Override
		public Object get(int i) {
			System.out.println(list.get(i));
			return null;
		}

		@Override
		public int size() {
			 System.out.println(list.size());

			return 0;
		}
	
		 public boolean add(String str)

		  {

//		    list.add(str);
//
//		    System.out.println(list);

		    return false;

		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAbsractList listNonModif = new TestAbsractList();
		
		listNonModif.add("ee");
		listNonModif.add("bb");
		listNonModif.add("aa");
		
		for (Object object : listNonModif) {
			System.out.println(object);
		}
		
	}

}
