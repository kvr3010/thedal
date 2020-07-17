import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class MyClass4 {
	
	
	public int userdab() {
		System.out.println("얼마게?");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	
	/*같은 타입 데이터 여러개 넘기기*/
	//배열사용
	public int[] rndNums() {
		Random rand = new Random();
		int[] nums = new int [2];
		nums[0] = rand.nextInt(90)+10;
		nums[1] = rand.nextInt(90)+10;
		return  nums;
	}
	
	//리스트 사용
	public ArrayList<Integer> rndNums2() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		list.add(rand.nextInt(90)+10);
		list.add(rand.nextInt(90)+10);
		return  list;
	}
	
	
	
	public int plus(ArrayList<Integer> list) {
		int corr = list.get(0) + list.get(1);
		return corr;
	 }
	
	
	public boolean ox(int wjdekq,int input) {
		
			if(input==wjdekq) {
				System.out.print("정답입니다.");
				return true;
			}else {
				System.out.print("틀렸습니다.");
				if(input>wjdekq) {
					System.out.println("커용");
				}else {
					System.out.println("작아용");
				}
				return false;
			}
			
		  }
		
	}


