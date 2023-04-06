package java_202304005;

public class Exam02 {

	public static void main(String[] args) {
       
		double d = 85.4;
		int score =10;
				
		d = score;
	//	d = (double)score;
		System.out.println(d);
		d = 85.4;
		
		score =(int) d;
		System.out.println(score);
	    
		
		int sum = 10;
		long longsum = 3000000000l;
        
		sum =(int)longsum;
	
		
		//	longsum = (long)sum;
		//	System.out.println(longsum);
	    
		System.out.println((double)5/2 );
		System.out.println(5&2);
		System.out.println(5/2);
		}
	


}
