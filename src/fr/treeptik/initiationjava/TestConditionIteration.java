package fr.treeptik.initiationjava;

public class TestConditionIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean test = true;
		
		if(test) {
			System.out.println("true");			
		}else{
			System.out.println("false");
		}
		
		String[] superTab = {"ze","ttere","ere"};
		for (String string : superTab) {
			System.out.println(string);
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;	
		}
		
		do{
			System.out.println("ture");
		}while(i<10);
		
		char value = 'z';
		switch (value) {
		case 'a':
			System.out.println("ok");
			break;
			
		case 'b':
			System.out.println("faux");
			break;

		default:
			System.out.println("faux");
			break;
		}
		}

	}

