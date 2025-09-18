import requests

# res = requests.get("https://jsonplaceholder.typicode.com/posts/1")
res = requests.get("https://www.naver.com/")
print(res.status_code)
print(res.headers)
print(res.headers.get("content-type"))
# print(res.json())