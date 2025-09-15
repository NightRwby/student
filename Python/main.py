# 함수 greet()을 정의하여 "파이썬 함수 시작!"을 출력하고,
# 세 번 호출하시오.
def greet():
    print("파이썬 함수 시작!")
greet();
greet()
greet()

# 이름을 매개변수로 받아
# "안녕하세요, [이름]"을 출력하는 함수 hello(name)을 작성하고
# "철수", "영희"로 각각 호출하시오.
def hello(name):
    print("안녕하세요,", name)
hello("철수")
hello("영희")

# 두 수를 입력받아 합을 반환하는 함수 add(x, y)를 작성하고,
# 결과를 변수에 저장하여 출력하시오.
def add(x, y):
    return x + y
num1 = add(1, 2)
print(num1)

# 리스트 [3, 8, 1, 7, 5]에서
# 최솟값과 최댓값을 반환하는 함수 min_max(data)를 작성하시오.
list = [3, 8, 1, 7, 5]
def min_max(data):
    return sorted({min(data), max(data)})
print(min_max(list))
print(type(min_max(list)))

# 여러 개의 숫자를 인자로 받아 총합을 구하는 함수 total(*args)를 작성하고,
# (1,2,3), (10,20,30,40)을 각각 전달해 결과를 출력하시오.
def total(*args):
    return sum(args)
print(total(1, 2, 3))
print(total(10, 20, 30, 40))
