import java.util.ArrayList;
import java.util.Scanner;

// 메인 클래스
public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("메인 클래스..");
		
		MyClass mc = new MyClass();
		MyClass2 mc2 = new MyClass2();
		MyClass3 mc3 = new MyClass3();
		MyClass mc1 = null; //생성자 없이
		
		mc.method();
		mc.food();
		mc.nono();
		System.out.println(mc.sum());
	
		mc2.m1();
		mc2.m2();
		
		
		int i = mc3.r1();
		System.out.println("메인클래스에서 출력 i:"+i);
		mc3.r2();
		
		// 클래스 만들고 매소드를 만들기
		MyClass4 mc4 = new MyClass4();
		// 더달의 기능을 별도로 만들어서
		// 더하기 출력 해주는 매소드
		// 더하기의 답을 전달해주는 매소드
		// 메인에서 매소드만 이용해서 출력 또는 답을 비교
		
		
	
		int wjdekq = mc4.plus(mc4.rndNums2());
		
		for(;;) {
		int input = mc4.userdab();
		if(mc4.ox(wjdekq, input) == true) 
		  {
			break;
		  }
		}
		
	
		
		
		
	}

}

