# use_module.py (동일 폴더)
import pandas

from aaa import mymath, mymath as m
from aaa.mymath import add

print(mymath.add(2, 3))
print(m.add(2, 3))
print(add(2, 3))
print(25*3.141592)
print(m.circle_area(5))