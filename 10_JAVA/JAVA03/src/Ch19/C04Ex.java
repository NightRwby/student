package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class C04Ex {
	//01 func1완성 - List<String>에 저장된 문자열 리스트에서 길이가 5이상인 문자열의 개수를 반환
	public static Function<List<String>, Integer> func1 = li -> li.stream().filter(el -> el.length() >= 5)
			.map(el -> (String) el).collect(Collectors.toList()).size();
	//02 func2완성 - List<Integer>에 저장된 숫자들의 제곱한 값의 합을 반환
	public static Function<List<Integer>, Integer> func2 = li -> li.stream().reduce(0, (sum, el) -> sum + (el * el));

	//03 func3완성 - List<String>에서 각 문자열의 첫 글자를 추출하여 대문자로 변환하여 리턴
	public static Function<List<String>, List<String>> func3 = li -> li.stream()
			.map(s -> s.toUpperCase().substring(0, 1) + s.substring(1)).toList();
		

	public static void main(String[] args) {
		System.out.println(func1.apply(Arrays.asList("aaaaa", "bbbb", "cccccc", "dd", "eeeeeee"))); 
		// 3
		System.out.println(func2.apply(Arrays.asList(5, 7, 9, 4, 6)));
		// 207
		System.out.println(func3.apply(Arrays.asList("aaaaa", "bbbb", "cccccc", "dd", "eeeeeee")));
		// [Aaaaa, Bbbb, Cccccc, Dd, Eeeeeee]
	}
}
