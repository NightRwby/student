package Ch04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03SetMain {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		//추가
		set.add("HTML/CSS/JS");
		set.add("NODEJS");
		set.add("SCSS");
		set.add("REACT");
		set.add("JAVA");	//old (미적용)
		set.add("JAVA");	//new (적용)
		set.add("JSP/SERVLET");
		set.add("STS");
		set.add("SPRING BOOT");
		set.add("SPRING BOOT");
		
		//삭제
		set.remove("JAVA");	//new "JAVA" 삭제됨 old "JAVA"는 여전히 미적용
		
		//중복은 개수에 추가안함
		System.out.println(set.size());		
		
		//탐색(고전) - Iterator
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//탐색(최근)
		for(String el : set) {
			System.out.println(el);
		}
		
		//전체삭제
		set.clear();
	}
}
