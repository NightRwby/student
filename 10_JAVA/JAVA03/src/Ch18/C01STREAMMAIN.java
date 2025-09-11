package Ch18_;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person
{
	protected String name;
	protected Integer age;
	//디폴트 생성자
	public Person() {}
	//모든인자 생성자
	//getter and setter
	//toString
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

class Employee extends Person{
	private String department;
	private String role;
	//디폴트 생성자
	public Employee() {}
	public Employee(Person person) {
		this.name =person.getName();
		this.age =person.getAge();
		//super(이름,나이)
	}
	//모든인자 생성자
	public Employee(String department, String role) {
		super();
		this.department = department;
		this.role = role;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", role=" + role + ", name=" + name + ", age=" + age + "]";
	}


	//getter and setter 
	
	//toString
	
	
}


public class C01STREAMMAIN {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		//filter
		List<Integer> list2 = list.stream()
							.filter((n)->{return n%2==0;})
							.collect(Collectors.toList());
		System.out.println(list2);
		
		//map
		List<Integer> list3 =
		list.stream()
			.filter((n)->{return n%2==1;})
			.map((n)->{return n*n;})
			.collect(Collectors.toList());
		System.out.println(list3);
		
		//sorted
		List<Person> list4 = Arrays.asList(
					new Person("홍길",45),
					new Person("김범수수수",35),
					new Person("유재석",53),
					new Person("서장훈훈",65),
					new Person("남",27)
				);
		
//		System.out.println(list4);
		//나이순으로 내림차순정렬해서 출력 .sorted((a,b)->{return b-a;})//내림차순 - 배열새롭게 구성
		
		List<Person> list5 = 
		list4.stream()
			.sorted((a,b)->{return b.getAge()-a.getAge();})
			.collect(Collectors.toList());
		
		list5.forEach(System.out::println);
		
		//
		
		List<Integer> list6 = 
		list4.stream()
//			 .map((el)->{return el.getAge();})
//			 .map(el->el.getAge())
			 .map(Person::getAge)				//메서드 참조(::) 이용
			 .collect(Collectors.toList());
		System.out.println(list6);
		
		
		//
		List<Integer> list7 =
		list4.stream()	
			.map(Person::getName)				//메서드 참조(::) 이용 - Person
			.map(String::length)				//메서드 참조(::) 이용 - String
			.collect(Collectors.toList());
		System.out.println(list7);
		
		//
		List<Employee> list8 = 
		list4.stream()
//				.map((el)->{return new Employee(el);})
				.map(Employee::new)
				.collect(Collectors.toList());
		
		list8.forEach(System.out::println);
	}

}
