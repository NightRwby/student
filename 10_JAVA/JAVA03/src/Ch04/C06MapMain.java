package Ch04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class C06MapMain {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		 //<  키값 ,  벨류값 >
		//추가
		map.put("aaa",1111);
		map.put("bbb",2222);
		map.put("ccc",3333);
		map.put("ddd",4444);	//old : new에 덮어씌워져 사라짐
		map.put("ddd",5555);	//new : 5555값이 재정의됨
		
		//확인
		map.forEach((e,r)->{map.get(e);System.out.print(r);});
		
		//삭제
		map.remove("aaa");
		
		//확인
//		System.out.println("SIZE : "+map.size());
//		System.out.println("첫번째줄 : "+map.get("aaa"));
//		System.out.println("두번째줄 : "+map.get("bbb"));
//		System.out.println("두번째줄 : "+map.get("ddd"));

	}
}
