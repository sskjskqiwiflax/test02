package java_202304005;

public class Exam03 {

	public static void main(String[] args) {
 
		int num = 10;
		int sum = 0;
		int tmp = 0;
	
	//	num = num+1;
    // 	num += 1;
    //num = num-1;
	//num-=1;
		
	   tmp = --num;
       sum = num--; 
     	 
     	
		System.out.println("num:"+ num);
		System.out.println("tmp:"+ tmp);
		System.out.println("sum:"+ sum);
	
	}
	

}
