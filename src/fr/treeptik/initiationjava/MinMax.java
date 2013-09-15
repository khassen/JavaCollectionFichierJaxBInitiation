package fr.treeptik.initiationjava;

public class MinMax {
	public Integer a1;
	public Integer b1;
	
	public MinMax(){
		
	}
public MinMax(Integer a, Integer b){
	this.a1 = a1;
	this.b1 = b1;
}

	public  static Integer max(Integer a , Integer b){
	int result = 0;
		
		if(a < b){
			
			result = b;
		}else{
			result = a;
		}
		return result;
		
		
		
		
	}
	public  static Integer min(Integer a , Integer b){
		
			int result = 0;
				
				if(a < b){
					
					result = a;
				}else{
					result = b;
				}
				return result;
		
		
		
		
	}

}
