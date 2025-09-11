package Ch04;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class C04Ex {
	public static void main(String[] args) {
		//1) 1~45 까지숫자를 6개를 랜덤으로 받아(Random클래스를 이용) set에 저장/출력
		Set<Integer> set = new HashSet<Integer>();
//		Set<Integer> set = new HashSet();	//오른쪽과 왼쪽의 제너릭타입이 같다면 오른쪽 제너릭타입 생략가능
		Random random = new Random();
		while(set.size()<6) 
			set.add(random.nextInt(45)+1);
		set.stream().forEach(e->System.out.print(e+" "));
		System.out.println();		

		
		//2) [추가]저장된 set의 오름차순정렬을 해보세요(검색으로 해결할 것)
		set.stream()
				.sorted()
				.forEach(e->System.out.print(e+" "));
	}	
}
