package java_202304005;

public class Exam05 {

	public static void main(String[] args) {
		   
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("계산형 초를 입력>>");
		int num = sc.nextint();
		
		int second = num %60;
		int hour = num / 3600;
		int minute = (num % 3600) /60;
		
		System.out.println(hour+"시," +minute+"분," + second+"초");
		
	}

}
