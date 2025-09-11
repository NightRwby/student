package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

//제공되는 함수형 인터페이스들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
//
//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
//
//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.


public class C03FunctionalInterfaceMain {
	//01
	public static Function<Integer, Integer> func1=x->x*x;
	//02
	public static Function<Integer, Integer> func2=x->x+x;
	//03
	public static Function<List<Integer>, Integer> func3=(x)->x.stream().reduce(0,(sum,el)->sum+el);
//			x.stream().reduce(누적변수의초기값,(누적변수,요소변수)->{return 누적연산;});
	//04
	public static Function<List<Object>, Integer> func4=li->
		//01 List의 각요소중 Integer만 filter	
		//02 필터링된 Integer의 재구성(map)
		//03 누적합(reduce)
		li.stream()
			.filter(el->el instanceof Integer)
			.map(el->(Integer)el)
			.reduce(0,(sum,el)->sum+el);
	
	//05 입력된 배열의 문자열만 필터링해서 새로운 배열생성
	public static Function<List<Object>, List<String>> func5 = li->
		li.stream()
			.filter(el->el instanceof String)
			.map(el->(String)el)
			.collect(Collectors.toList());
		
	//06
	public static Function<Integer, Integer> func6 = func1.andThen(func2);
	
	//07
	public static Function<Integer, Integer> func7 = func2.andThen(func1);
	
	//08
	public static Function<List<Integer>, Integer> func8 = func3.andThen(func2).andThen(func1);
	
	//09
	public static Function<Integer, Function<Integer, Integer>> func9 = (x)->{
		//
		System.out.println("func9 x : " + x);
		return(n)->{
			//
			System.out.println("func9 n : " + n);
			return n+x;
		}; 
	};
	//10
	public static Function<Integer, Function<Integer, Integer>> func10 = x->y->x+y;
	
	public static void main(String[] args) {
		
		//01
		System.out.println(func1.apply(7));
		//02
		System.out.println(func2.apply(7));
		//03
		System.out.println(func3.apply(Arrays.asList(10,20,30,40)));
		//04
		System.out.println(func4.apply(Arrays.asList("dd",10,20,30.6,55.5,'A',"dad",52)));
		//05
		System.out.println(func5.apply(Arrays.asList("dd",10,20,30.6,55.5,'A',"dad",52)));
		//06
		System.out.println(func6.apply(5));	//	(5*5) + (5*5) = 50
		//07
		System.out.println(func7.apply(5));	//	(5+5) * (5+5) = 100
		//08
		//( (10+20+30+40) + (10+20+30+40) ) * ( (10+20+30+40) + (10+20+30+40) ) = 200 * 200 = 40000
		System.out.println(func8.apply(Arrays.asList(10,20,30,40))); 
		//09
		System.out.println(func9.apply(10).apply(20)); 
		//10
		System.out.println(func10.apply(10).apply(20)); 
	
	}

}
